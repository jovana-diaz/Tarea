package herenciafigura;

import static java.lang.Math.sqrt;

/**
 *
 * @author maryse
 */
public class Tetraedro extends Figura {

    public Tetraedro() {

    }

    public void Area() {
        //area = la raiz cuadrada de 3 por la lonitud de las aristas² 
        area = (int) (sqrt(3) * (arista * arista));
    }
}
