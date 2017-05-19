import java.util.Random;
/**
*
*/

public class Triangolo extends Poligono
{
	//variabili
	private int lato1;
	private int lato2;
	private int lato3;

	//costruttore
	public Triangolo(int lato1, int lato2, int lato3){
		setLato1(lato1);
		setLato2(lato2);
		setLato3(lato3);
	}

	//metodi get
	public int getLato1(){
		return lato1;
	}
	public int getLato2(){
		return lato2;
	}
	public int getLato3(){
		return lato3;
	}
	public int getLatoCorto(){
		return ( getLato1() <= getLato2() ) ? ( ( getLato1() <= getLato3() ) ? getLato1() : getLato3() ) : ( ( getLato2() <= getLato3() ) ? getLato2() : getLato3() );
	}

	//metodi set
	public void setLato1(int lato1){
		this.lato1 = lato1;
	}
	public void setLato2(int lato2){
		this.lato2 = lato2;
	}
	public void setLato3(int lato3){
		this.lato3 = lato3;
	}

	public static Triangolo creaCasuale(){
		Random rand = new Random();
		return new Triangolo( rand.nextInt(10)+1, rand.nextInt(10)+1, rand.nextInt(10)+1 );
	}
	public int getPerimetro(){
		return getLato1() + getLato2() + getLato3();
	}

	public int getArea(){
		l = (getLato1() + getLato2() + getLato3() )/ 2 ;
    return Math.sqrt(l * (l - getLato1()) * (l - getLato2()) * (l - getLato3()));
	}

	//metodo toString
	public String toString(){
		return String.format("Lato 1: %d, Lato 2: %d, Lato 3: %d, Perimetro: %d, Area: %d", getLato1(), getLato2(), getLato3(), getPerimetro(), getArea());
	}
}
