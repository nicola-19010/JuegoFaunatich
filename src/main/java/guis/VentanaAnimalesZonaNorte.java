package guis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class VentanaAnimalesZonaNorte extends JFrame implements ActionListener {
    FondoVentanaAnimalesZonaNorte fondo = new FondoVentanaAnimalesZonaNorte();
    private JPanel panel;
    private JButton botonAlpaca;
    private JButton botonGuanaco;
    private JButton botonVicuña;
    private JButton botonLlama;
    private JButton botonVolver;

    public VentanaAnimalesZonaNorte() throws IOException {
        setSize(700,500);
        setLocationRelativeTo(null);
        fondo.setLayout(null);
        this.getContentPane().add(fondo);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        añadirPartes();
    }

    private void añadirPartes(){
        agregarBotones(fondo);
        añadirPanel();
    }

    private void añadirPanel(){
        panel = new JPanel();
        panel.setLayout(null);
    }

    public void agregarBotones(FondoVentanaAnimalesZonaNorte fondo){
        botonAlpaca = new JButton("Alpaca");
        botonAlpaca.setBounds(180,90,110,30);
        botonAlpaca.setHorizontalAlignment(SwingConstants.CENTER);
        fondo.add(botonAlpaca);
        botonAlpaca.setOpaque(true);
        botonAlpaca.setBackground(Color.white);
        botonAlpaca.setForeground(Color.black);
        botonAlpaca.addActionListener(this);

        botonGuanaco = new JButton("Guanaco");
        botonGuanaco.setBounds(160,330,110,30);
        botonGuanaco.setHorizontalAlignment(SwingConstants.CENTER);
        fondo.add(botonGuanaco);
        botonGuanaco.setOpaque(true);
        botonGuanaco.setBackground(Color.white);
        botonGuanaco.setForeground(Color.black);
        botonGuanaco.addActionListener(this);

        botonVicuña = new JButton("Vicuña");
        botonVicuña.setBounds(500,100,110,30);
        botonVicuña.setHorizontalAlignment(SwingConstants.CENTER);
        fondo.add(botonVicuña);
        botonVicuña.setOpaque(true);
        botonVicuña.setBackground(Color.white);
        botonVicuña.setForeground(Color.black);
        botonVicuña.addActionListener(this);

        botonLlama = new JButton("Llama");
        botonLlama.setBounds(500,280,100,30);
        botonLlama.setHorizontalAlignment(SwingConstants.CENTER);
        fondo.add(botonLlama);
        botonLlama.setOpaque(true);
        botonLlama.setBackground(Color.white);
        botonLlama.setForeground(Color.black);
        botonLlama.addActionListener(this);

        botonVolver = new JButton("Volver");
        botonVolver.setBounds(20,420,100,30);
        botonVolver.setHorizontalAlignment(SwingConstants.CENTER);
        fondo.add(botonVolver);
        botonVolver.setOpaque(true);
        botonVolver.setBackground(Color.ORANGE);
        botonVolver.setForeground(Color.BLACK);
        botonVolver.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == botonVolver){
            try {
                new VentanaSeleccionDeZona().setVisible(true);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            this.dispose();
        }
    }
}