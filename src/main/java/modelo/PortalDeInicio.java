package modelo;

import dato.DatosJugadores;
import dato.VerificadorContraseña;
import dato.VerificadorNombre;
import dato.VerificadorRut;

import java.util.Scanner;

public class PortalDeInicio {
    public static void mostrarTextoDeBienvenida() {
        System.out.println("BIENVENIDO/A A FAUNATICH!");
        System.out.println("Este juego te ayudará a aprender sobre la fauna Chilena de una manera muy entretenida.\n");
    }

    public static void mostrarMenu() {
        System.out.println("""
                Ingrese una opción:
                1. Empezar.
                2. Mostrar estadísticas.
                3. Ganar vidas.
                4. Salir del juego.""");
    }


    public static void mostrarOpcionesPortalInicio(){
        System.out.println("""
                FAUNATICH.
                Elija alguna opcion:
                1. Iniciar Sesión.
                2. Crear Cuenta.""");
        opcionesPortalInicio(ingresar());
    }

    private static void opcionesPortalInicio(int opcionIngresada){
        switch (opcionIngresada) {
            case 1 -> iniciarSesion();
            case 2 -> crearCuenta();
            default -> {
                System.out.println("Por favor ingrese una opcion válida:");
                mostrarOpcionesPortalInicio();
            }
        }
    }

    public static void crearCuenta(){
        String nombre = pedirNombre();
        String rut = pedirRut();
        String contrasena = pedirContraseña();
        Jugador jugador = new Jugador(nombre, rut, contrasena);
        ConjuntoJugadores conjuntoJugadores = new ConjuntoJugadores();
        if(conjuntoJugadores.agregarJugador(jugador)){
            DatosJugadores.registrarDatos(jugador, "C:\\Users\\npach\\IdeaProjects\\JuegoFaunatich\\conjuntoJugadores.txt");
        }else {
            System.out.println("Esta cuenta ya existe");

        }

    }

    //TODO reparar logica, nunca llegará al ultimo return eso es bueno pero hay HORROR de logica
    private static String pedirNombre() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un nombre de jugador: ");
        String nombre = teclado.nextLine();
        if(VerificadorNombre.validarNombre(nombre)){
            return nombre;
        }else {
            nombre = pedirNombre();
        }
        return nombre;
    }

    private static String pedirRut(){
        System.out.println("A continuación deberá ingresar su rut, sin puntos ni guión y con dígito verificador.");
        System.out.print("Ingrese su rut: ");
        String rut = ingresarDatos();
        if(VerificadorRut.validarRut(rut) == true){
            return rut;
        }else{
            System.out.print("Error, el rut no es válido, ingréselo nuavamente. \n");
            rut = pedirRut();
        }

        return rut;
    }

    private static String pedirContraseña(){
        System.out.println("A continuación deberá ingresar una contraseña, la cual deberá tener letras y números y debe tener por lo menos 5 caracteres y máximo 10.");
        System.out.print("Ingrese una contraseña: ");
        String contrasena = ingresarDatos();
        VerificadorContraseña.verificarContraseña(contrasena);
        if(VerificadorContraseña.verificarContraseña(contrasena) == true){
            return contrasena;
        }else{
            System.out.println("Error, la contraseña no es válida, inténtelo nuevamente. ");
            contrasena = pedirContraseña();
        }

        return contrasena;
    }

    private static String ingresarDatos(){
        Scanner teclado = new Scanner(System.in);
        String ingreso = teclado.nextLine();
        return ingreso;
    }

    private static void iniciarSesion() {
        String rut = pedirRut();
        //aqui debe ir un metodo que verifique si el rut ya existe
        String contraseña = pedirContraseña();

    }

    private static int ingresar() {
        Scanner teclado = new Scanner(System.in);
        int entrada;
        do {
            try {
                entrada = teclado.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Por favor ingrese una opción válida:");
                teclado.nextLine();
            }
        } while (true);
        return entrada;
    }
}
