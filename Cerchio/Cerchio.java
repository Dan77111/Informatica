import java.util.*;
/**
 *
 */
public class Cerchio
{
    //variabili
    protected double raggio;
    //costruttori
    public Cerchio(){
        this(1);
    }
    public Cerchio(double r){
        setRaggio(r);
    }
    public Cerchio(Cerchio c){
        this(c.getRaggio());
    }
    //metodi
    public double getRaggio(){
        return raggio;
    }
    public void setRaggio(double r){
        if ( r > 0 ){
            raggio = r;
        }
    }
    public double getCirconferenza(){
        return Math.PI * 2 * getRaggio();
    }
    public double getArea(){
        return Math.PI * Math.pow(getRaggio(), 2);
    }
}
