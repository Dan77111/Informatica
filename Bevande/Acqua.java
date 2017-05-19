
/**
 *
 */
public class Acqua extends Bevanda
{
    private int residuoFisso;
    private double sodio;
    private int durezza;

    public Acqua(int residuoFisso, double sodio, int durezza){
        setResiduoFisso(residuoFisso);
        setSodio(sodio);
        setDurezza(durezza);
    }

    public int getResiduoFisso(){
        return residuoFisso;
    }
    public double getSodio(){
        return sodio;
    }
    public int getDurezza(){
        return durezza;
    }
    public void setResiduoFisso(int residuoFisso){
        this.residuoFisso = residuoFisso;
    }
    public void setSodio(double sodio){
        this.sodio = sodio;
    }
    public void setDurezza(int durezza){
        this.durezza = durezza;
    }

    public String toString(){
        return String.format("%d, %f, %d", residuoFisso, sodio, durezza);
    }
}
