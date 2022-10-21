package herenciafigura;

/**
 *
 * @author maryse
 */
public class Esfera extends Figura {

    public Esfera() {

    }

    public void Area() {
        // area = 4 · π · radio²
        area = (int) (4 * Math.PI * Math.pow(radio, 2));
    }
}
