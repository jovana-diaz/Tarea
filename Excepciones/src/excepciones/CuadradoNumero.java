package excepciones;

import java.awt.Color;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CuadradoNumero {
public static final String ANSI_CYAN = "\u001B[36m";
public static final String ANSI_BLUE = "\u001B[34m";
public static final String ANSI_RESET = "\u001B[0m";

public static void main(String[] ar) {

        Scanner s = new Scanner(System.in);
        int num;
        boolean continuar;
        do {
            try {
                continuar = false;
                System.out.print("Ingrese un valor entero:");
                num = s.nextInt();
                int cuadrado = num * num;
                System.out.print(ANSI_BLUE + "El cuadrado de " + num + " es " + cuadrado + ANSI_RESET);
            } catch (InputMismatchException x) {

                System.out.println(ANSI_CYAN + "Captura de la excepcion InputMismatchException" + ANSI_RESET);
                System.out.println("Debe ingresar obligatoriamente un número entero.");
                s.next();
                continuar = true;
            }
        } while (continuar);
    }
}
