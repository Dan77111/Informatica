package veicoli.automobili;
import veicoli.Veicolo;

/**
 *
 */
public class Automobile extends Veicolo
{
    private String targa;
    public Automobile(int numeroPosti, double cilindrata, String targa){
        super(numeroPosti, cilindrata);
        //CONTROLLI SULLA TARGA DA FARE
        this.targa = targa;
    }
    public String id(){
        return targa;
    }
    public double prezzoCc(){
        return 0.5;
    }
}
