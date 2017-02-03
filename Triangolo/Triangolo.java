
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
        if ( ( Punto.calcolaDistanza( a, p ) + Punto.calcolaDistanza( b, p ) <
               Punto.calcolaDistanza( a, c ) + Punto.calcolaDistanza( b, c ) ) &&
             ( Punto.calcolaDistanza( a, p ) + Punto.calcolaDistanza( c, p ) <
               Punto.calcolaDistanza( a, b ) + Punto.calcolaDistanza( b, c ) ) &&
             ( Punto.calcolaDistanza( b, p ) + Punto.calcolaDistanza( c, p ) <
               Punto.calcolaDistanza( a, b ) + Punto.calcolaDistanza( a, c ) ) ) {
            return true;
        } else {
            return false;
        }
    }
    //TEST
    public boolean puntoInterno(double px, double py){
        Punto p = new Punto(px, py);
        if ( ( Punto.calcolaDistanza( a, p ) + Punto.calcolaDistanza( b, p ) <
               Punto.calcolaDistanza( a, c ) + Punto.calcolaDistanza( b, c ) ) &&
             ( Punto.calcolaDistanza( a, p ) + Punto.calcolaDistanza( c, p ) <
               Punto.calcolaDistanza( a, b ) + Punto.calcolaDistanza( b, c ) ) &&
             ( Punto.calcolaDistanza( b, p ) + Punto.calcolaDistanza( c, p ) <
               Punto.calcolaDistanza( a, b ) + Punto.calcolaDistanza( a, c ) ) ) {
            return true;
        } else {
            return false;
        }
    }
    //FINE TEST
    public String toString(){
        return String.format("%s, %s, %s", a, b, c);
    }
    public double getPerimetro(){
        return Punto.calcolaDistanza( a, b ) + Punto.calcolaDistanza( b, c ) + Punto.calcolaDistanza( c, a );
    }
    public double getArea(){
        return 0.0;
    }
}
