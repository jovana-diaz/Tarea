package herenciaoperaciones;

import java.util.Scanner;

/**
 *
 * @author maryse
 */
public class ClasePadre {

    protected int valor1, valor2, resultado;
    Scanner entrada = new Scanner(System.in);

    public ClasePadre() {

    }

    //métodoque pide los valores al usuario
    public void PedirDatos() {
        System.out.print("\nDame el primer valor: ");
        valor1 = entrada.nextInt();

        System.out.print("\nDame el segundo valor: ");
        valor2 = entrada.nextInt();
    }

    //método que muestra el resultado
    public void MostrarResultados() {
        System.out.println(resultado);
    }

}
