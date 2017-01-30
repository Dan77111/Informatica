
/**
 * 
 */
public class Punto
{
    //attributi
    private double x, y;
    //costruttori
    public Punto(){
       this(0,0);
    }
    public Punto(double x, double y){
       setPunto(x,y);
    }
    //metodi
    public void setAscissa(double x){
        this.x = x;
    }
    public void setOrdinata(double y){
        this.y = y;
    }
    public double getAscissa(){
        return x;
    }
    public double getOrdinata(){
        return y;
    }
    public void setPunto(double x, double y){
        setAscissa(x);
        setOrdinata(y);
    }
    public boolean equals(Punto p2){
        return ( getAscissa() == p2.getAscissa() && 
               getOrdinata() == p2.getOrdinata() );        
    }
    public static boolean equals(Punto p1, Punto p2){
        return p1.equals(p2);
    }
    public String toString(){
        return "( " + getAscissa() + " ; " 
                    + getOrdinata() + " )";
    }
}
