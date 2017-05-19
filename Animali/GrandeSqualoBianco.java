
/**
 *
 */
public class GrandeSqualoBianco extends Animale
{
  protected double lunghezza;

  public GrandeSqualoBianco(String nomeProprio, double lunghezza){
    super("grande squalo bianco", "carchadon carcharis", "oceano", "minacciato - vulnerabile", nomeProprio);
    setLunghezza(lunghezza);
  }

  public double getLunghezza(){
    return lunghezza;
  }

  public void setLunghezza(double lunghezza){
    this.lunghezza = lunghezza;
  }

  public String toString(){
    return String.format("%s\n\tLunghezza: %f cm", super.toString(), getLunghezza());
  }
}
