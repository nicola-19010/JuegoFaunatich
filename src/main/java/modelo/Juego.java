package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

    public static void comenzarJuego(Jugador juego) {
        mostrarMapaGeografico();
        int zona = elegirZona(ingresar());
        mostrarAnimalesZonaElegida(zona);

        String[][] animalEnemigo = elegirAnimalPorZona(zona);
        String[][] animalJugador = generarAnimalUsuario();

        agregarAnimalAColeccion(coleccionAnimales,animalJugador);

        mostrarCombate(animalEnemigo, animalJugador);
        int ptsDeVidaJugador = combatir(animalEnemigo, animalJugador);

        mostrarResultadoCombate(animalEnemigo, ptsDeVidaJugador);

        if (esGanador(ptsDeVidaJugador)) {
            agregarAnimalAColeccion(coleccionAnimales, animalEnemigo);
        }
    }

    private static void mostrarAnimalesZonaElegida(int zona) {
        switch (zona) {
            case 1 -> mostrarAnimalesZonaNorte();
            case 2 -> mostrarAnimalesZonaCentral();
            case 3 -> mostrarAnimalesZonaSur();
        }
    }

    private static void mostrarAnimalesZonaSur() {
        System.out.println("""
                Estos son los animales que puede usar en esta zona.
                Elija alguno:
                1. Pingüino.
                2. Zorro de la Patagonia.
                3. Ñandú.""");
    }

    private static void mostrarAnimalesZonaCentral() {
        System.out.println("""
                Estos son los animales que puede usar en esta zona.
                Elija alguno:
                1. Zorro Culpeo.
                2. Puma.
                3. Águila Mora.""");
    }

    private static void mostrarAnimalesZonaNorte() {
        System.out.println("""
                Estos son los animales que puede usar en esta zona.
                Elija alguno:
                1. Alpaca
                2. Vicuña
                3. Guanaco.
                4. Llama.""");
    }

    private static int elegirZona(int opcionIngresada) {
        if (opcionIngresada < 1 || opcionIngresada > 3) {
            System.out.println("Por favor ingrese una opción válida");
            return elegirZona(ingresar());
        }
        return opcionIngresada;
    }

    private static void mostrarMapaGeografico() {
        System.out.println("""
                A continuación elija la zona geográfica con la que desea empezar:
                1. Zona norte.
                2. Zona central.
                3. Zona sur.""");
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
