package contribuente;

public abstract class Contribuente
{
    private double entrate, uscite;
    public Contribuente( double entrate, double uscite ){
        this.entrate = entrate;
        this.uscite = uscite;
    }
    public abstract String id();
    protected double imponibile(){
        return ( entrate - uscite ) * fattoreDiSconto();
    }
    protected abstract double fattoreDiSconto();
    protected abstract double aliquota();
    public double daPagare(){
        return imponibile() * aliquota();
    }
}
