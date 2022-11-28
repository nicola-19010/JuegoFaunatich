package guis;

import dato.VerificadorContrasena;
import dato.VerificadorNombre;
import dato.VerificadorRut;
import modelo.ConjuntoJugadores;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaInicioDeSesion extends JFrame implements ActionListener {
    private ConjuntoJugadores jugador;
    private JLabel panel;
    private JButton botonAceptar;
    private JButton botonSalir;
    private JTextField cajaDeTextoRut;
    private JTextField cajaDeTextoContrasena;
    FondoVentanaInicioSesion fondo = new FondoVentanaInicioSesion();

    public VentanaInicioDeSesion() {
        this.setTitle("Portal de inicio");
        this.setSize(700,500);
        this.setLocationRelativeTo(null);
        this.fondo.setLayout(null);
        this.getContentPane().add(fondo);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        agregarComponentes();
    }

    private void agregarComponentes(){
        añadirPanel();
        agregarBotones(fondo);
        agregarCajasDeTexto(fondo);
    }

    public void agregarBotones(FondoVentanaInicioSesion fondo){
        botonAceptar = new JButton("Aceptar");
        botonAceptar.setBounds(400,350,80,30);
        botonAceptar.setHorizontalAlignment(SwingConstants.CENTER);
        fondo.add(botonAceptar);
        botonAceptar.setOpaque(true);
        botonAceptar.setBackground(Color.white);
        botonAceptar.setForeground(Color.black);
        botonAceptar.addActionListener(this);

        botonSalir = new JButton("Salir");
        botonSalir.setBounds(510,350,80,30);
        botonSalir.setHorizontalAlignment(SwingConstants.CENTER);
        fondo.add(botonSalir);
        botonSalir.setOpaque(true);
        botonSalir.setBackground(Color.white);
        botonSalir.setForeground(Color.black);
        botonSalir.addActionListener(this);

        agregarCajasDeTexto(fondo);
    }

    private void agregarCajasDeTexto(FondoVentanaInicioSesion fondo){
        cajaDeTextoRut = new JTextField();
        cajaDeTextoRut.setBounds(430,210,130,30);
        fondo.add(cajaDeTextoRut);

        cajaDeTextoContrasena = new JTextField();
        cajaDeTextoContrasena.setBounds(430,280,130,30);
        fondo.add(cajaDeTextoContrasena);
    }

    private void añadirPanel(){
        panel = new JLabel();
        panel.setLayout(null);
    }

    public boolean cajasDeTextoVacias() {
        return cajaDeTextoRut.getText().equals("") || cajaDeTextoContrasena.getText().equals("");
    }

    public void limpiarCajasDeTexto() {
        cajaDeTextoRut.setText("");
        cajaDeTextoContrasena.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == botonSalir){
            if (JOptionPane.showConfirmDialog(rootPane, "¿Está seguro/a que desea salir del portal de inicio?",
                    "Confirmación de cierre", JOptionPane.YES_NO_OPTION) == JOptionPane.ERROR_MESSAGE){System.exit(0);}
        }else if (e.getSource() == botonAceptar && cajasDeTextoVacias()){
            System.out.println(cajaDeTextoContrasena.getText());
            System.out.println(cajaDeTextoRut.getText());
            JOptionPane.showMessageDialog(this,"Por favor, no deje campos de texto vacíos");
            limpiarCajasDeTexto();
        } else if(e.getSource() == botonAceptar && VerificadorRut.validarRut(cajaDeTextoRut.getText()) && VerificadorContrasena.verificarContrasena(cajaDeTextoContrasena.getText())) {
            JOptionPane.showMessageDialog(this,"¡USUARIO REGISTRADO!");
        } else if(e.getSource() == botonAceptar && (!VerificadorRut.validarRut(cajaDeTextoRut.getText()) && !VerificadorContrasena.verificarContrasena(cajaDeTextoContrasena.getText()))) {
            JOptionPane.showMessageDialog(this,"ERROR, ingrese los datos correctamente");
            limpiarCajasDeTexto();
        }


        /*if(e.getSource() == botonSalir){
            if (JOptionPane.showConfirmDialog(rootPane, "¿Está seguro/a que desea salir del portal de inicio?",
                    "Confirmación de cierre", JOptionPane.YES_NO_OPTION) == JOptionPane.ERROR_MESSAGE){System.exit(0);}
        }else if(e.getSource() == botonAceptar && cajasDeTextoVacias()){
            JOptionPane.showMessageDialog(this, "ERROR, por favor no deje campos de texto vacíos.",
                    "Inicio de sesión", JOptionPane.INFORMATION_MESSAGE);
            limpiarCajasDeTexto();
        } else if (e.getSource() == botonAceptar && (!VerificadorRut.validarRut(cajaDeTextoRut.getText()) ||
                !VerificadorContrasena.verificarContrasena(cajaDeTextoContrasena.getText()))) {
            JOptionPane.showMessageDialog(this,"ERROR, ingrese sus datos nuevamente.");
            limpiarCajasDeTexto();
        } else if(e.getSource() == botonAceptar && (VerificadorRut.validarRut(cajaDeTextoRut.getText()) && VerificadorContrasena.verificarContrasena(cajaDeTextoContrasena.getText()))) {
            JOptionPane.showMessageDialog(this,"¡USUARIO ACEPTADO!");
            System.out.println(cajaDeTextoContrasena.getText());
        }*/
    }
}