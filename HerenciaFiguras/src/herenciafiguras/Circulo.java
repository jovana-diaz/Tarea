package herenciafigura;

/**
 *
 * @author maryse
 */
public class Circulo extends Figura {

    public Circulo() {

    }

    public void Area() {
        area = (int) (Math.PI * Math.pow(radio, 2));
    }
}
