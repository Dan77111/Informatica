import java.util.Random;
/**
 *
 */
public class Parallelepipedo extends Figura3d
{
    private double lato;

    public Parallelepipedo(){
        this(0, 0);
    }
    public Parallelepipedo(double lato, double altezza){
        setAltezza(altezza);
        setLato(lato);
    }

    public double getLato(){
        return lato;
    }
    public void setLato(double lato){
        this.lato = lato;
    }

    public double getArea(){
        return getLato() * getLato();
    }

    public double getAreaTotale(){
       return ( getArea() * 2 ) + ( getLato() * 4 * getAltezza() );
    }
    public static Parallelepipedo creaCasuale(){
        Random rand = new Random();
        return new Parallelepipedo(rand.nextInt(10) + 1, rand.nextInt(10) + 1);
    }
    public String toString(){
        return String.format("Lato: %f, Altezza: %f \n", getLato(), getAltezza());
    }
}
