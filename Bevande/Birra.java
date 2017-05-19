
/**
 *
 */
public class Birra extends BevandaAlcolica
{
    private String marca;

    public Birra(double gradazioneAlcolica, String tipo, String marca){
        super(gradazioneAlcolica, tipo);
        setMarca(marca);
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String toString(){
        return String.format("%s %s", super.toString(), getMarca());
    }
}
