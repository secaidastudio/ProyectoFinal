package ProyectoFinal;

/**
 *
 * @author oscar
 */
public class Nodo {

    /**
     * nodo que contendra los datos de la pila
     */
    Nodo siguiente;
    double data;

    Nodo() {
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

}
