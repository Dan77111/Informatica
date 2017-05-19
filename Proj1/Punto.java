/**
*
*/

public class Punto
{
	//variabili
	private int ascissa;
	private int ordinata;

	//costruttore
	public Punto(int ascissa, int ordinata){
		setAscissa(ascissa);
		setOrdinata(ordinata);
	}

	//metodi get
	public int getAscissa(){
		return ascissa;
	}
	public int getOrdinata(){
		return ordinata;
	}

	//metodi set
	public void setAscissa(int ascissa){
		this.ascissa = ascissa;
	}
	public void setOrdinata(int ordinata){
		this.ordinata = ordinata;
	}

	public static int getDistanza(Punto p1, Punto p2){
		return (int) Math.sqrt( Math.pow((p1.getAscissa() - p2.getAscissa()),2) + Math.pow((p1.getOrdinata() - p2.getOrdinata()),2) );
	}

	//metodo toString
	public String toString(){
		return String.format("(%d;%d)", getAscissa(), getOrdinata());
	}
}
