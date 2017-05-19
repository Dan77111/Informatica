
/**
 *
 */
public class Taxi extends Auto
{
  //attributi
  private String codiceTaxi;

  //costruttore
  public Taxi(String marca, String modello, String colore, int annoImmatricolazione, int numPorte, String codiceTaxi){
    super(marca, modello, colore, annoImmatricolazione, numPorte);
    this.codiceTaxi = codiceTaxi;
  }
  public String toString(){
    return String.format("Taxi %s [%s]", codiceTaxi, super.toString());
  }
}
