package veicoli.motocicli;
import veicoli.Veicolo;

/**
 *
 */
public class Motociclo extends Veicolo
{
    private String numeroTelaio;
    public Motociclo(int numeroPosti, double cilindrata, String numeroTelaio){
        super(numeroPosti, cilindrata);
        //CONTROLLI SUL NUMERO TELAIO DA FARE
        this.numeroTelaio = numeroTelaio;
    }
    public String id(){
        return numeroTelaio;
    }
    public double prezzoCc(){
        return 0.1;
    }
}
