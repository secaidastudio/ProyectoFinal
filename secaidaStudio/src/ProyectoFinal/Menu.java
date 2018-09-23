package ProyectoFinal;

import java.io.IOException;
import java.util.Scanner;

/**
 * clase que contendra el menu principal
 *
 * @author oscar
 */
public class Menu {

    Scanner input = new Scanner(System.in);
    Calculadora cal = new Calculadora();
    String operacion;

    public void MenuPrincipal() throws IOException {

        int opcion = -1;

        System.out.println("Bienvenidos a la calculadora PRN");
        do {
            System.out.println("");
            System.out.println("Menu Principal");
            System.out.println("1. Ingreso de la notacion postfix.");
            System.out.println("2. Mostrar historial.");
            System.out.println("3. Mostrar orden ascendente de las operaciones.");
            System.out.println("4. Mostrar orden descendente de las operaciones.");
            System.out.println("5. Salida.");
            System.out.println("");
            System.out.print("Ingrese opcion: ");
            try {
                opcion = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException ex) {
                opcion = -1;
            }

            switch (opcion) {
                case 1:
                    //ingresoData();
                    System.out.println("Sistema PRN");
                    System.out.println("");
                    System.out.println("Ingrese notacion a calcular: ");
                    operacion = input.nextLine();
                    cal.calc(operacion);
                    break;
                case 2:
                    cal.historial();
                    break;
                case 3:
                    cal.ordenAscendente();
                    cal.tiempoEspera();
                    cal.historial();
                    break;
                case 4:
                    cal.ordenDescendente();
                    cal.tiempoEspera();
                    cal.historial();

                default:
                    System.out.println(" ");
            }
        } while (opcion != 5);

        if (opcion == 5) {
            cal.guardar();
            cal.tiempoGuardado();
        }

    }

}
