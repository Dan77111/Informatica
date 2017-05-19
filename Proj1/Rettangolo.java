import java.util.Random;
/**
*
*/

public class Rettangolo extends Poligono
{
	//variabili
	private Punto vertice1;
	private Punto vertice2;
	private Punto vertice3;
	private Punto vertice4;

	//costruttore
	public Rettangolo(Punto vertice1, Punto vertice2, Punto vertice3, Punto vertice4){
		setVertici(vertice1, vertice2, vertice3, vertice4);
	}

	//metodi get
	public int getLato1(){
		return Punto.getDistanza(vertice1, vertice2);
	}
	public int getLato2(){
		return Punto.getDistanza(vertice1, vertice3);
	}
	public int getLatoCorto(){
		return ( getLato1() <= getLato2() ) ? getLato1() : getLato2();
	}
	public Punto getVertice1(){
		return vertice1;
	}
	public Punto getVertice2(){
		return vertice2;
	}
	public Punto getVertice3(){
		return vertice3;
	}
	public Punto getVertice4(){
		return vertice4;
	}

	//metodi set
	public void setVertici(Punto vertice1, Punto vertice2, Punto vertice3, Punto vertice4){
		if ( (Punto.getDistanza(vertice1, vertice2) == Punto.getDistanza(vertice3, vertice4)) &&
		     (Punto.getDistanza(vertice1, vertice3) == Punto.getDistanza(vertice2, vertice4)) &&
				 (Punto.getDistanza(vertice1, vertice4) == Punto.getDistanza(vertice2, vertice3))){
			this.vertice1 = vertice1;
			this.vertice2 = vertice2;
			this.vertice3 = vertice3;
			this.vertice4 = vertice4;
		}
	}


	public static Rettangolo creaCasuale(){
		Random rand = new Random();
		int lato1 = rand.nextInt(10) + 1, lato2 = rand.nextInt(10) + 1;
		Punto vertice1 = new Punto(rand.nextInt(101) - 50, rand.nextInt(101) - 50);
		Punto vertice3 = new Punto(vertice1.getAscissa(), vertice1.getOrdinata() + lato2);
		Punto vertice2 = new Punto(vertice1.getAscissa() + lato1, vertice1.getOrdinata());
		Punto vertice4 = new Punto(vertice3.getAscissa() + lato1, vertice3.getOrdinata());
		return new Rettangolo( vertice1, vertice2, vertice3, vertice4 );
	}

	public int getPerimetro(){
		return (getLato1()*2) + (getLato2()*2);
	}

	public int getArea(){
		return getLato1()*getLato2();
	}

	//metodo toString
	public String toString(){
		return String.format("Vertici: ( %s, %s, %s, %s ), \n\tLato 1: %d, \n\tLato 2: %d, \n\tPerimetro: %d, \n\tArea: %d", getVertice1(), getVertice2(), getVertice3(), getVertice4(), getLato1(), getLato2(), getPerimetro(), getArea());
	}
}
