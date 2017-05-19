import java.util.Random;
/**
 *
 */
public class Cilindro extends Figura3d
{
    private double raggio;

    public Cilindro(){
        this(0, 0);
    }
    public Cilindro(double raggio, double altezza){
        setAltezza(altezza);
        setRaggio(raggio);
    }

    public double getRaggio(){
        return raggio;
    }
    public void setRaggio(double raggio){
        this.raggio = raggio;
    }

		public double getAreaTotale(){
				return ( getArea() * 2 ) + ( 2 * getRaggio() * Math.PI * getAltezza() );
		}

    public double getArea(){
        return ( getRaggio() * getRaggio() * Math.PI )
    }

    public static Cilindro creaCasuale(){
        Random rand = new Random();
        return new Cilindro(rand.nextInt(10) + 1, rand.nextInt(10) + 1);
    }
    public String toString(){
        return String.format("Raggio: %f, Altezza: %f \n", getRaggio(), getAltezza());
    }
}
