package modelo;

import java.util.ArrayList;
import java.util.List;

public class ConjuntoJugadores {
    private List<Jugador> jugadores;

    //TODO linea comentada por produce un null, probar si funciona sin este metodo sino volver a dejarla
    public ConjuntoJugadores() {
        this.jugadores = new ArrayList<>();
    }

    public boolean agregarJugador(Jugador jugador) {
        String rut = jugador.getRut();

        //TODO agregar validacion del dibito verificador quedaria algo así ->  if(!jugadorExiste(rut) && DigitoVerificador.validarRut(rut)) {
        if(!jugadorExiste(rut) ) {
            jugadores.add(jugador);
            return true;
        }

        return false;
    }

    private boolean jugadorExiste(String rut) {
        for (Jugador j: this.jugadores) {
            if(j.getRut().equals(rut)) {
                return true;
            }
        }

        return false;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public Jugador buscarJugadorPorRut(String rut) throws JugadorNoEncontradoException {
        for (Jugador e : this.jugadores) {
            if (e.getRut().equals(rut)) {
                return e;
            }
        }
        throw new JugadorNoEncontradoException();
    }



}
