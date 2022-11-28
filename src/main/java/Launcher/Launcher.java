package Launcher;

import dato.DatosJugadores;
import guis.*;
import modelo.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Launcher {
    public static void main(String[] args) throws JugadorNoEncontradoException, IOException {
        /*ConjuntoJugadores conjuntoJugadores = new ConjuntoJugadores();
        DatosJugadores.leerArchivoJugador(conjuntoJugadores, "D:\\Marcelo 2022\\UFRO\\Ingeniería civil informática\\Segundo Semestre 2022\\Asignaturas\\Programación\\Programas IntelliJ\\JuegoFaunatich\\conjuntoJugadores.txt");
        PortalDeInicio.mostrarTextoDeBienvenida();
        PortalDeInicio.mostrarOpcionesPortalInicio(conjuntoJugadores);*/

        /*VentanaInicioDeSesion ventanaInicioDeSesion = new VentanaInicioDeSesion();
        ventanaInicioDeSesion.setVisible(true);*/

        /*VentanaMenuPrincipal ventanaMenuPrincipal = new VentanaMenuPrincipal();
        ventanaMenuPrincipal.setVisible(true);*/

        /*VentanaSeleccionDeZona ventanaSeleccionDeZona = new VentanaSeleccionDeZona();
        ventanaSeleccionDeZona.setVisible(true);*/

        /*VentanaEstadisticas ventanaEstadisticas = new VentanaEstadisticas();
        ventanaEstadisticas.setVisible(true);*/

        /*VentanaAnimalesZonaNorte ventanaAnimalesZonaNorte = new VentanaAnimalesZonaNorte();
        ventanaAnimalesZonaNorte.setVisible(true);*/

        /*VentanaAnimalesZonaCentro ventanaAnimalesZonaCentro = new VentanaAnimalesZonaCentro();
        ventanaAnimalesZonaCentro.setVisible(true);*/

        /*VentanaAnimalesZonaSur ventanaAnimalesZonaSur = new VentanaAnimalesZonaSur();
        ventanaAnimalesZonaSur.setVisible(true);*/

        /*VentanaCombate ventanaCombate = new VentanaCombate();
        ventanaCombate.setVisible(true);*/

        /*VentanaAtaque ventanaAtaque = new VentanaAtaque();
        ventanaAtaque.setVisible(true);*/

        VentanaCrearCuenta ventanaCrearCuenta = new VentanaCrearCuenta();
        ventanaCrearCuenta.setVisible(true);
    }
}