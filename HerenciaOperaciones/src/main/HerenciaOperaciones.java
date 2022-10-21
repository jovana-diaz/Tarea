package main;

import herenciaoperaciones.ClaseHija_Resta;
import herenciaoperaciones.ClaseHija_Suma;
import java.util.InputMismatchException;

/**
 *
 * @author maryse
 */
public class HerenciaOperaciones {

    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {

        try {

            ClaseHija_Suma suma = new ClaseHija_Suma();
            suma.PedirDatos();
            suma.Sumar();
            System.out.print(ANSI_CYAN + "\nEl resultado de la suma es: "
                    + "" + ANSI_RESET);
            suma.MostrarResultados();

            ClaseHija_Resta resta = new ClaseHija_Resta();
            resta.PedirDatos();
            resta.Resta();
            System.out.print(ANSI_CYAN + "\nEl resultado de la resta es: " + ANSI_RESET);
            resta.MostrarResultados();
        } catch (InputMismatchException x) {
            System.out.println("\nCaptura de exception" + ANSI_BLUE + "-->" + ANSI_RESET + x);
            System.out.println(ANSI_BLUE + "Te solicitamos que ingreses un valor de tipo entero" + ANSI_RESET);

        }

    }

}
