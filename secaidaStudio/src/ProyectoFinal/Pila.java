package ProyectoFinal;

/**
 *
 * @author oscar
 */
public class Pila {

    private Nodo inicio;
    private int tamanio;

    public Pila() {
        inicio = null;
    }

    /**
     * metodo para comprobar si la pila esta vacia
     *
     * @return verdadero si la pila esta vacia
     */
    public boolean estaVacia() {
        return inicio == null;
    }

    /**
     * metodo para agregar los operandos a la pila
     *
     * @param valor
     */
    public void push(double valor) {
        Nodo nuevo;
        nuevo = new Nodo();
        nuevo.setData(valor);

        //verificar si la pila esta vacia
        if (inicio == null) {
            nuevo.setSiguiente(null);
            inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        tamanio++;
    }

    /**
     * metodo para devolver el elemento eliminado de la pila
     *
     * @return datos decimales de la pila
     */
    public double pop() {
        //verificar si la pila esta vacia
        if (inicio != null) {
            double valor = inicio.getData();
            inicio = inicio.getSiguiente();
            return valor;
        }
        return Integer.MAX_VALUE;
    }

    /**
     * metodo que devilvera la cima de la pila
     *
     * @return devuelve el valor de la cima de la pila
     */
    public Nodo getInicio() {
        return inicio;
    }

    /**
     * metodo que devuelve la longitud de la pila
     *
     * @return el tamanio de la pila
     */
    public int longitud() {
        return tamanio;
    }
}
