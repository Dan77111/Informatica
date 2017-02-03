
/**
 *
 */
public class Cilindro extends Cerchio
{
    //attributi
    private double altezza;
    //costruttori
    public Cilindro(){
        this(1,0);
    }
    public Cilindro(double r, double h){
        super(r);
        setAltezza(h);
    }
    public Cilindro(Cilindro c){
        this(c.getRaggio(), c.getAltezza());
    }
    //metodi
    public double getAltezza(){
        return altezza;
    }
    public void setAltezza(double h){
        if ( h >= 0 ){
            altezza = h;
        }
    }
    public double getArea(){
        return ( super.getArea() * 2 ) + ( super.getCirconferenza() * getAltezza() );
    }
    public double getVolume(){
        return super.getArea() * getAltezza();
    }
}
