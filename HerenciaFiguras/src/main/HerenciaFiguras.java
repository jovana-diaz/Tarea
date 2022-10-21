package main;

import herenciafigura.Circulo;
import herenciafigura.Cuadrado;
import herenciafigura.Cubo;
import herenciafigura.Esfera;
import herenciafigura.Tetraedro;
import herenciafigura.Triangulo;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author maryse
 */
public class HerenciaFiguras {

    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    private int opcion1 = 0,
            opcion2 = 0,
            opcion3 = 0;

    Scanner datos = new Scanner(System.in);

    public HerenciaFiguras() {

    }

    public void Menu() {

        System.out.println(ANSI_GREEN + "Calcular el área:" + ANSI_RESET
                + "\n1- Figura Bidimensional"
                + "\n2- Figura tridimencinal");
        opcion1 = datos.nextInt();

        if (opcion1 == 1) {
            System.out.println(ANSI_BLUE + "Seleccione figura para calcular área:" + ANSI_RESET
                    + "\n1- Circulo"
                    + "\n2- Cuadrado"
                    + "\n3- Triángulo");
            opcion2 = datos.nextInt();

            if (opcion2 == 1) {
                Circulo circulo = new Circulo();
                circulo.pedirDatosCirculoEsfera();
                circulo.Area();
                circulo.mostrarResultado();
            }
            if (opcion2 == 2) {
                Cuadrado cuadrado = new Cuadrado();
                cuadrado.pedirDatosCuadrado();
                cuadrado.Area();
                cuadrado.mostrarResultado();
            }
            if (opcion2 == 3) {
                Triangulo triangulo = new Triangulo();
                triangulo.pedirDatosTriángulo();
                triangulo.Area();
                triangulo.mostrarResultado();
            }

        } else if (opcion1 == 2) {
            System.out.println(ANSI_GREEN + "Seleccione figura para calcular área:" + ANSI_RESET
                    + "\n1- Esfera"
                    + "\n2- Cubo"
                    + "\n3- Tetraedro");
            opcion3 = datos.nextInt();

            if (opcion3 == 1) {
                Esfera esfera = new Esfera();
                esfera.pedirDatosCirculoEsfera();
                esfera.Area();
                esfera.mostrarResultado();
            }
            if (opcion3 == 2) {
                Cubo cubo = new Cubo();
                cubo.pedirDatosCuboTetraedro();
                cubo.Area();
                cubo.mostrarResultado();
            }
            if (opcion3 == 3) {
                Tetraedro tetraedro = new Tetraedro();
                tetraedro.pedirDatosCuboTetraedro();
                tetraedro.Area();
                tetraedro.mostrarResultado();
            }
        }

    }

    public static void main(String args[]) {
        boolean continuar;

        do {
            try {
                continuar = false;
                HerenciaFiguras principal = new HerenciaFiguras();
                principal.Menu();
            } catch (InputMismatchException x) {
                System.out.println("\nCaptura de exception" + ANSI_BLUE + "-->" + ANSI_RESET + x);
                System.out.println(ANSI_BLUE + "Te solicitamos que ingreses un valor de tipo entero" + ANSI_RESET);
            continuar = true;
            }

        }while(continuar);
    }
}
