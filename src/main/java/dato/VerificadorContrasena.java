package dato;

public class VerificadorContrasena {
    public static boolean verificarContrasena(String contrasena){
        if(esAlfaNumerico(contrasena) && !esEspacioVacio(contrasena) && esLongitudCorrecta(contrasena)){
            return true;
        }else {
            return false;
        }
    }

    //TODO reparar que valide correctamente que sea alfanumerico, actualmente acepta todo
    public static boolean esAlfaNumerico(String s) {
        return s != null && s.matches("^[a-zA-Z0-9]*$");
    }

    private static boolean esEspacioVacio(String contrasena){
        return contrasena.isEmpty();
    }

    private static boolean esLongitudCorrecta(String contrasena){
        if(contrasena.length() > 10 || contrasena.length() < 5){
            return false;
        }else {
            return true;
        }
    }
}
