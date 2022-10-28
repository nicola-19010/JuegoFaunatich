package Launcher;

import dato.DatosJugadores;
import modelo.ConjuntoJugadores;
import modelo.Jugador;

import java.util.ArrayList;

public class Launcher {
    public static void main(String[] args) {
        Jugador juanito = new Jugador("Juanito", "166338859", "juanitocontrasena");
        Jugador marcelo = new Jugador("Marcelo", "208860909", "marcelocontrasena");

        ConjuntoJugadores conjuntoJugadores = new ConjuntoJugadores();
        //conjuntoJugadores.agregarJugador(juanito);


        //DatosJugadores.registrarDatos(conjuntoJugadores.getJugadores(), "conjuntoJugadores.txt");

        //DatosJugadores.registrarDatos(juanito,"conjuntoJugadores.txt");
        DatosJugadores.leerArchivoJugador(conjuntoJugadores, "conjuntoJugadores.txt");
        var x = conjuntoJugadores.getJugadores();
        System.out.println(x.get(0).getNombre() + x.get(0).getRut());




    }
}
