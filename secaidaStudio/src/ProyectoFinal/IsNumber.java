package ProyectoFinal;

/**
 *
 * @author oscar
 */
public class IsNumber {

    /**
     * metodo para verificar si el token generado del String se puede convertir
     * en double
     *
     * @param elemento
     * @return true si elemento puede convertirse a double
     */

    public boolean esNumero(String elemento) {
        try {
            Double.parseDouble(elemento);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
