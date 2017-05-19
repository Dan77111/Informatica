
/**
 *
 */
public class Giraffa extends Animale
{
  protected double lunghezzaCollo;

  public Giraffa(String nomeProprio, double lunghezzaCollo){
    super("giraffa", "giraffa camelo pardavis", "savana", "rischio minimo", nomeProprio);
    setLunghezzaCollo(lunghezzaCollo);
  }

  public double getLunghezzaCollo(){
    return lunghezzaCollo;
  }

  public void setLunghezzaCollo(double lunghezzaCollo){
    this.lunghezzaCollo = lunghezzaCollo;
  }

  public String toString(){
    return String.format("%s\n\tLunghezza Del Collo: %f cm", super.toString(), getLunghezzaCollo());
  }
}
