import java.util.Random;
/**
*
*/

public class Cerchio extends Poligono
{
	//variabili
	private int raggio;
	private Punto centro;

	//costruttore
	public Cerchio(Punto centro, int raggio){
		setCentro(centro);
		setRaggio(raggio);
	}

	//metodi get
	public int getRaggio(){
		return raggio;
	}
	public Punto getCentro(){
		return centro;
	}
	//metodi set
	public void setRaggio(int raggio){
		if ( raggio > 0 ){
			this.raggio = raggio;
		}
	}
	public void setCentro(Punto centro){
		this.centro = centro;
	}

	public static Cerchio creaCasuale(){
		Random rand = new Random();
		return new Cerchio( new Punto(rand.nextInt(101)-50, rand.nextInt(101)-50), rand.nextInt(10)+1 );
	}

	public int getPerimetro(){
		return (int) (Math.PI * 2 * getRaggio());
	}

	public int getArea(){
		return (int) (Math.PI * getRaggio() * getRaggio());
	}

	//metodo toString
	public String toString(){
		return String.format("Centro: %s, \n\tRaggio: %d, \n\tCirconferenza: %d, \n\tArea: %d", centro.toString(), getRaggio(), getPerimetro(), getArea());
	}
}
