/**
 * Sviluppare una semplice classe Cerchio che esponga i metodi
 * - circonferenza
 * - area
 *
 * Successivamente implementare una semplice classe Cilindro che
 * estendendo la classe Cerchio aggiunga il o gli attributi necessari.
 * Questa classe esporr� i metodi
 * - circonferenza (evidentemente della sua base)
 * - area (che dovr� essere diversa da quella della classe Cerchio)
 * - volume
 */

public class Cilindro extends Cerchio {
    // attributi
    private double altezza;

    // costruttore
    /**
    * Costruttore proprio che invoca il costruttore di Cerchio passandogli come parametro
    * per il raggio quello ricevuto e assegnando l'altezza uguale a quella ricevuta come parametro
    */
    public Cilindro (double r, double a) {
        super(r);
        altezza = a;
    }

    // metodi
    /**
    * Metodo che calcola e restituisce l'area del cilindro
    */
    public double area() {
        double supBasi, supLaterale;

        supBasi = super.getArea() * 2;
        supLaterale = getCirconferenza() * altezza;

        return (supBasi + supLaterale);
    }
    /**
    * Metodo che calcola e restituisce il volume del cilindro
    */
    public double volume () {
         return (super.getArea() * altezza);
    }

}
