import java.util.Random;
/**
*
*/

public class Triangolo extends Poligono
{
    //variabili
    private Punto vertice1;
    private Punto vertice2;
    private Punto vertice3;

    //costruttore
    public Triangolo(Punto vertice1, Punto vertice2, Punto vertice3){
        setVertici(vertice1, vertice2, vertice3);
    }

    //metodi get
    public int getLato1(){
        return Punto.getDistanza(vertice1, vertice2);
    }
    public int getLato2(){
        return Punto.getDistanza(vertice2, vertice3);
    }
    public int getLato3(){
        return Punto.getDistanza(vertice3, vertice1);
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
    public int getLatoCorto(){
        return ( getLato1() <= getLato2() ) ? ( ( getLato1() <= getLato3() ) ? getLato1() : getLato3() ) : ( ( getLato2() <= getLato3() ) ? getLato2() : getLato3() );
    }

    //metodi set
    public void setVertici(Punto vertice1, Punto vertice2, Punto vertice3){
        setVertice1(vertice1);
        setVertice2(vertice2);
        setVertice3(vertice3);
    }
    public void setVertice1(Punto vertice1){
        this.vertice1 = vertice1;
    }
    public void setVertice2(Punto vertice2){
        this.vertice2 = vertice2;
    }
    public void setVertice3(Punto vertice3){
        this.vertice3 = vertice3;
    }

    public static Triangolo creaCasuale(){
        Random rand = new Random();
        Punto vertice1 = new Punto(rand.nextInt(101)-50, rand.nextInt(101)-50);
        Punto vertice2 = new Punto(rand.nextInt(101)-50, rand.nextInt(101)-50);
        Punto vertice3 = new Punto(rand.nextInt(101)-50, rand.nextInt(101)-50);
        return new Triangolo( vertice1, vertice2, vertice3 );
    }
    public int getPerimetro(){
        return getLato1() + getLato2() + getLato3();
    }

    public int getArea(){
        int l = (getLato1() + getLato2() + getLato3() )/ 2 ;
        return (int) Math.sqrt(l * (l - getLato1()) * (l - getLato2()) * (l - getLato3()));
    }

    //metodo toString
    public String toString(){
        return String.format("Vertici: (%s, %s, %s), \n\tLato 1: %d, \n\tLato 2: %d, \n\tLato 3: %d, \n\tPerimetro: %d, \n\tArea: %d", getVertice1(), getVertice2(), getVertice3(), getLato1(), getLato2(), getLato3(), getPerimetro(), getArea());
    }
}
