package herenciafigura;

import java.util.Scanner;

/**
 *
 * @author maryse
 */
public class Figura {

    /*
    Variables
     */
    protected int lado = 0,
            base = 0,
            altura = 0,
            radio = 0,
            arista = 0,
            area = 0;

    Scanner datos = new Scanner(System.in);

    public void pedirDatosCirculoEsfera() {
        System.out.print("Inserta valor del radio:" + " ");
        radio = datos.nextInt();
    }

    public void pedirDatosCuadrado() {
        System.out.print("Inserta valor de un lado:" + " ");
        lado = datos.nextInt();
    }

    public void pedirDatosTriángulo() {
        System.out.print("Inserta valor de la base:" + " ");
        base = datos.nextInt();
        System.out.print("Inserta valor de la altura:" + " ");
        altura = datos.nextInt();
    }

    public void pedirDatosCuboTetraedro() {
        System.out.print("Inserta valor de la arista" + " ");
        arista = datos.nextInt();
    }

    public void mostrarResultado() {
        System.out.println("El área es:" + " " + area);
    }
}
