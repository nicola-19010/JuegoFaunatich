package Launcher;

import dato.DatosJugadores;
import modelo.Animal;
import modelo.ConjuntoJugadores;
import modelo.Jugador;
import modelo.PortalDeInicio;

import java.util.ArrayList;
import java.util.List;

public class Launcher {
    public static void main(String[] args) {
        ConjuntoJugadores conjuntoJugadores = new ConjuntoJugadores();
        DatosJugadores.leerArchivoJugador(conjuntoJugadores, "C:\\Users\\npach\\IdeaProjects\\JuegoFaunatich\\conjuntoJugadores.txt");
        PortalDeInicio.mostrarTextoDeBienvenida();
        PortalDeInicio.mostrarOpcionesPortalInicio(conjuntoJugadores);



        Jugador juanito = new Jugador("Juanito", "166338859", "juanitocontrasena");
        Jugador marcelo = new Jugador("Marcelo", "208860909", "marcelocontrasena");
        Jugador jesus = new Jugador("Jesus", "111111111111", "jesuscontraseña");
        Jugador pedro = new Jugador("Pedro", "2222222222", "pedrocontrasena");
        Jugador pablo = new Jugador("pablo", "333333333", "pablocontrasena");


        //Metodo de esta clase que imprime las cuentas
        /*for (var jugador: conjuntoJugadores.getJugadores()) {
            System.out.println(jugador.toString());
        }*/

        /*for (Jugador jugador: x) {
            System.out.println(jugador.toString());
        }*/


    }



}
