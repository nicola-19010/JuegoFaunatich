package modelo;

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
                opcionesPortalInicio(ingresar());
            }
        }
    }

    private static void crearCuenta() {
    }

    private static void iniciarSesion() {
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
