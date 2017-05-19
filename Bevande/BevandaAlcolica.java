
/**
 *
 */
public class BevandaAlcolica extends Bevanda
{
    protected double gradazioneAlcolica;
    protected String tipo;

    public BevandaAlcolica(double gradazioneAlcolica, String tipo){
        setGradazioneAlcolica(gradazioneAlcolica);
        setTipo(tipo);
    }

    public double getGradazioneAlcolica(){
        return gradazioneAlcolica;
    }
    public String getTipo(){
        return tipo;
    }
    public void setGradazioneAlcolica(double gradazioneAlcolica){
        this.gradazioneAlcolica = gradazioneAlcolica;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String toString(){
        return String.format("%f %s", getGradazioneAlcolica(), getTipo());
    }
}
