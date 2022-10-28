package Launcher;

import dato.DatosJugadores;
import modelo.ConjuntoJugadores;
import modelo.Jugador;

import java.util.ArrayList;

public class Launcher {
    public static void main(String[] args) {
        Jugador juanito = new Jugador("Juanito", "166338859", "juanitocontrasena");
        Jugador marcelo = new Jugador("Marcelo", "208860909", "marcelocontrasena");
        ArrayList<Jugador> jugadorArrayList = new ArrayList<>();
        jugadorArrayList.add(juanito);
        jugadorArrayList.add(marcelo);
        ConjuntoJugadores conjuntoJugadores = new ConjuntoJugadores();
        conjuntoJugadores.agregarJugador(juanito);
        conjuntoJugadores.agregarJugador(marcelo);

        //DatosJugadores.registrarDatos(juanito,"conjuntoJugadores.txt");
        DatosJugadores.leerArchivoJugador(conjuntoJugadores, "conjuntoJugadores.txt");
    }
}
