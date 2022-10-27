import java.util.List;

public class Players {
    private List<Jugador> jugadores;

    public Players(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public boolean agregarJugador(Jugador jugador) {
        String rut = jugador.getRut();

        //TODO agregar validacion del dígito verificador quedaria algo así ->  if(!jugadorExiste(rut) && DigitoVerificador.validarRut(rut)) {
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
