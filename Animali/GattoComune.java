
/**
 *
 */
public class GattoComune extends Animale
{
  protected String colorePelo;

  public GattoComune(String nomeProprio, String colorePelo){
    super("gatto domestico", "felis silvestris catus", "urbano", "rischio minimo", nomeProprio);
    setColorePelo(colorePelo);
  }

  public String getColorePelo(){
    return colorePelo;
  }

  public void setColorePelo(String colorePelo){
    this.colorePelo = colorePelo;
  }

  public String toString(){
    return String.format("%s\n\tColore Del Pelo: %s", super.toString(), getColorePelo());
  }
}
