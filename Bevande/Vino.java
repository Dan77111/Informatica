
/**
 *
 */
public class Vino extends BevandaAlcolica
{
  private String cantina;

  public Vino(double gradazioneAlcolica, String tipo, String cantina){
      super(gradazioneAlcolica, tipo);
      setCantina(cantina);
  }
  public String getCantina(){
      return cantina;
  }
  public void setCantina(String cantina){
      this.cantina = cantina;
  }
  public String toString(){
      return String.format("%s %s", super.toString(), getCantina());
  }
}
