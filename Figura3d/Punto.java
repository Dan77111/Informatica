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

	//metodo toString
	public String toString(){
		return String.format("(%d;%d)", getAscissa(), getOrdinata());
	}
}
