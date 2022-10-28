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
        PortalDeInicio.mostrarOpcionesPortalInicio();


        Jugador juanito = new Jugador("Juanito", "166338859", "juanitocontrasena");
        Jugador marcelo = new Jugador("Marcelo", "208860909", "marcelocontrasena");
        Jugador jesus = new Jugador("Jesus", "111111111111", "jesuscontraseña");
        Jugador pedro = new Jugador("Pedro", "2222222222", "pedrocontrasena");
        Jugador pablo = new Jugador("pablo", "333333333", "pablocontrasena");

        //conjuntoJugadores.agregarJugador(juanito);


        //DatosJugadores.registrarDatos(juanito, "conjuntoJugadores.txt");
        //DatosJugadores.registrarDatos(marcelo,"conjuntoJugadores.txt");


        //DatosJugadores.registrarDatos(marcelo,"conjuntoJugadores.txt" );
        //DatosJugadores.registrarDatos(juanito,"conjuntoJugadores.txt");
        //DatosJugadores.leerArchivoJugador(conjuntoJugadores, "C:\\Users\\npach\\IdeaProjects\\JuegoFaunatich\\conjuntoJugadores.txt");

        //conjuntoJugadores.agregarJugador(jesus);
        //conjuntoJugadores.agregarJugador(pedro);


        System.out.println(conjuntoJugadores.agregarJugador(marcelo));
        System.out.println(conjuntoJugadores.agregarJugador(jesus));
        System.out.println(conjuntoJugadores.agregarJugador(juanito));

        guardarCuenta(marcelo);


        //Metodo de esta clase que imprime las cuentas
        /*for (var jugador: conjuntoJugadores.getJugadores()) {
            System.out.println(jugador.toString());
        }*/

        /*for (Jugador jugador: x) {
            System.out.println(jugador.toString());
        }*/

        //Animal animal1 = new Animal("ABC", "30", "4","2","1");
        //Animal animal2 = new Animal("DEF","35","4","2", "2");
        //ArrayList<Animal> listaAnimal = new ArrayList<>();


    }
    /*public static void guardarCuenta(ConjuntoJugadores conjuntoJugadores){
        DatosJugadores.registrarDatos(conjuntoJugadores.getJugadores().get(0),"C:\\Users\\npach\\IdeaProjects\\JuegoFaunatich\\conjuntoJugadores.txt");
    }*/

    public static void guardarCuenta(Jugador jugador){
        DatosJugadores.registrarDatos(jugador,"C:\\Users\\npach\\IdeaProjects\\JuegoFaunatich\\conjuntoJugadores.txt");
    }
}
