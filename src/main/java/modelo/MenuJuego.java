package modelo;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuJuego {

    static void mostrarMenu(Jugador jugador) {
        System.out.println("""
                Ingrese una opción:
                1. Empezar.
                2. Mostrar estadísticas.
                3. Salir del juego.""");
        opcionesMenu(jugador);
    }
    private static int opcionesMenu(int opcionIngresada, Jugador jugador) {
        switch (opcionIngresada) {
            case 1 -> Juego.comenzarJuego(jugador);
            case 2 -> Estadistica.mostrarEstadisticas(coleccionAnimales);
            case 3 -> salirDelJuego();
            default -> {
                System.out.println("Por favor ingrese un número válido:");
                opcionesMenu(ingresar(), coleccionAnimales);
            }
        }
        return opcionIngresada;
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
