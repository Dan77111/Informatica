
/**
 * 
 */
public class Manager extends Impiegato
{
    int bonus;
    
    public Manager(String nome, int stipendio, int bonus){
        super(nome, stipendio);
        this.bonus = bonus;
    }
    
    //public get e set di bonus
    public int getStipendio(){
        return (super.getStipendio() + getBonus());
    }
    
}
