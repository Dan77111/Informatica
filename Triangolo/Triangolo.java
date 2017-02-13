
/**
 *
 */
public class Triangolo
{
    //attributi
    private Punto a, b, c;
    //costruttori
    public Triangolo(){
        this(0.0,0.0,0.0,0.0,0.0,0.0);
    }
    public Triangolo(double ax, double ay, double bx, double by, double cx, double cy){
        a = new Punto(ax, ay);
        b = new Punto(bx, by);
        c = new Punto(cx, cy);
    }
    public Triangolo(Punto a, Punto b, Punto c){
       this(a.getAscissa(), a.getOrdinata(),b.getAscissa(), b.getOrdinata(),c.getAscissa(), c.getOrdinata());
    }
    //metodi
    public Punto getA(){
        return a;
    }
    public Punto getB(){
        return b;
    }
    public Punto getC(){
        return c;
    }
    public void setA(Punto a){
        this.a = a;
    }
    public void setB(Punto b){
        this.b = b;
    }
    public void setC(Punto c){
        this.c = c;
    }
    public boolean isDegenere(){
        return (Punto.segno(a,b,c) == 0);
    }
    public boolean puntoInterno(Punto p){
        return ( Punto.segno(a,b,c) == Punto.segno(a,b,p) ) &&
               ( Punto.segno(a,c,b) == Punto.segno(a,c,p) ) &&
               ( Punto.segno(b,c,a) == Punto.segno(b,c,p) );
    }
    public String toString(){
        return String.format("%s, %s, %s", a, b, c);
    }
    public double getPerimetro(){
        return Punto.calcolaDistanza( a, b ) + Punto.calcolaDistanza( b, c ) + Punto.calcolaDistanza( c, a );
    }
    public double getArea(){
        double sp = getPerimetro()/2;
        double l1 = Punto.calcolaDistanza(getA(),getB());
        double l2 = Punto.calcolaDistanza(getA(),getC());
        double l3 = Punto.calcolaDistanza(getC(),getB());
        return Math.sqrt(sp*(sp*l1)*(sp*l2)*(sp*l3));
    }
    public boolean equals(Triangolo t){
        return getA().equals(t.getA()) && getB().equals(t.getB()) && getC().equals(t.getC()) ||
               getA().equals(t.getA()) && getB().equals(t.getC()) && getC().equals(t.getB()) ||
               getA().equals(t.getB()) && getB().equals(t.getA()) && getC().equals(t.getC()) ||
               getA().equals(t.getB()) && getB().equals(t.getC()) && getC().equals(t.getA()) ||
               getA().equals(t.getC()) && getB().equals(t.getA()) && getC().equals(t.getB()) ||
               getA().equals(t.getC()) && getB().equals(t.getB()) && getC().equals(t.getA());
    }
}
