package veicoli;

/**
 *
 */
public abstract class Veicolo
{
    private int numeroPosti;
    private double cilindrata;
    public Veicolo(int numeroPosti, double cilindrata){
        this.numeroPosti = numeroPosti;
        this.cilindrata = cilindrata;
    }
    public abstract String id();
    public abstract double prezzoCc();
    public double tassaCircolazione(){
        return cilindrata * prezzoCc();
    }
    public int numeroPosti(){
        return numeroPosti;
    }
}
