package ProyectoFinal;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

/**
 * clase que contendra los metodos a utilizar para las operaciones de las
 * notaciones polacas implementara la interface Operadores que contiene los
 * metodos para calcular la suma, resta, multiplicacion y division asi como los
 * metodos para desplegar el historial, el orden ascendente y el orden
 * descendente
 *
 * @author oscar
 */
public class Calculadora extends Pila implements Operadores {

    Pila pila = new Pila();
    List<String> lista = new ArrayList();
    List<Double> lista2 = new ArrayList();

    public Calculadora() {
    }
    IsNumber numero = new IsNumber();
    Double valor1 = 0d;
    Double valor2 = 0d;
    Double resultado = 0d;

    /**
     * metodo que recibe la cadena String con la anotacion polaca inversa y
     * operarla segun corresponda
     *
     * @param operacion
     */
    public void calc(String operacion) {
        try {
            String[] arrOfStr = operacion.split(" ");

        lista.add(operacion);
        for (int i = 0; i < arrOfStr.length; i++) {

            String elemento = arrOfStr[i];
            if (numero.esNumero(elemento)) {
                pila.push(Double.parseDouble(arrOfStr[i]));
            } else {
                switch (arrOfStr[i]) {
                    case "PLUS":
                        sumar();
                        break;
                    case "LESS":
                        restar();
                        break;
                    case "TIMES":
                        multiplicar();
                        break;
                    case "DIVIDE":
                        dividir();
                        break;

                }
            }
        }
        lista2.add(pila.pop());
            
        }catch(NumberFormatException e){
            System.out.println("notacion ingresada incorrectamente");
        }
        
    }

    /**
     * funcion que realiza la suma de los tokens ya separados del String
     */
    @Override
    public void sumar() {
        valor1 = pila.pop();
        valor2 = pila.pop();
        pila.push(valor2 + valor1);

    }

    /**
     * funcion que realiza la resta de los tokens
     */
    @Override
    public void restar() {
        valor1 = pila.pop();
        valor2 = pila.pop();
        pila.push(valor2 - valor1);

    }

    /**
     * funcion que realiza la multiplicacion de los tokens
     */
    @Override
    public void multiplicar() {
        valor1 = pila.pop();
        valor2 = pila.pop();
        pila.push(valor2 * valor1);

    }

    /**
     * funcion que realiza la division de los tokens
     */
    @Override
    public void dividir() {
        valor1 = pila.pop();
        valor2 = pila.pop();
        try {
            pila.push(valor2 / valor1);

        } catch (Exception e) {
            System.out.println("No es posible dividir dentro de 0");
        }

    }

    /**
     * funcion que desplegara el historial de operaciones con su respuesta
     *
     */
    @Override
    public void historial() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i) + " = " + lista2.get(i));
        }

    }

    /**
     * metodo que ordenara las operaciones ingresadas del menor al mayor
     */
    @Override
    public void ordenAscendente() {

        int n = lista2.size();

        for (int i = 0; i <= (n - 1); i++) {

            int indice = i;

            for (int j = i + 1; j <= n - 1; j++) {
                if (lista2.get(j) < lista2.get(indice)) {
                    indice = j;

                    double minimo = lista2.get(indice);
                    String minimoStr = lista.get(indice);
                    lista2.set(indice, lista2.get(i));
                    lista.set(indice, lista.get(i));
                    lista2.set(i, minimo);
                    lista.set(i, minimoStr);

                }
            }

        }

    }

    /**
     * metodo que ordenara las operaciones de mayor a menor
     */
    @Override
    public void ordenDescendente() {

        int n = lista2.size();

        for (int i = 0; i <= (n - 1); i++) {

            int indice = i;

            for (int j = i + 1; j <= n - 1; j++) {
                if (lista2.get(j) > lista2.get(indice)) {
                    indice = j;

                    double minimo = lista2.get(indice);
                    String minimoStr = lista.get(indice);
                    lista2.set(indice, lista2.get(i));
                    lista.set(indice, lista.get(i));
                    lista2.set(i, minimo);
                    lista.set(i, minimoStr);
                }
            }

        }

    }

    /**
     * metodo para colocar un tiempo de espera entre acciones
     */
    public void tiempoEspera() {
        System.out.println("");
        System.out.println("Reordenando...");
        try {
            Thread.sleep(3000);
            System.out.println("Listo.");
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * metodo para colocar un tiempo de espera entre la salida del programa y la
     * generacion del archivo txt que contiene el historial de operaciones
     */
    public void tiempoGuardado() {
        System.out.println("Guardando datos en archivo historial.txt. Por favor espere...");
        try {
            Thread.sleep(4000);
            System.out.println("Listo. archivo historial.txt generado correctamente");
            Thread.sleep(2000);
            System.out.println("Buen dia");
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * metodo para generar un archivo txt que contendra el historial de
     * operaciones realizadas
     *
     * @throws IOException
     */
    public void guardar() throws IOException {
        String str = "historial.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(str));
        writer.write("HISTORIAL DE OPERACIONES");
        writer.newLine();
        writer.write("Guatemala, " + new Date());
        writer.newLine();
        for (int i = 0; i < lista.size(); i++) {
            writer.write(lista.get(i) + " = " + lista2.get(i) + "\n");
            writer.newLine();

        }
        writer.close();
    }

}
