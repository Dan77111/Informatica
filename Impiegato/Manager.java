
/**
 * 
 */
public class Manager extends Impiegato
{
    public Manager(String nome, int stipendio){
        super(nome, stipendio);
    }
    public void aumentaStipendio(int aumento){
        setStipendio(getStipendio()+aumento);
    }
}
