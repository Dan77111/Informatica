
/**
 *
 */
public class Auto extends Veicolo
{
    //attributi
    private int numPorte;

    //costruttore
    public Auto(String marca, String modello, String colore, int annoImmatricolazione, int numPorte){
      super(marca, modello, colore, annoImmatricolazione);
      this.numPorte = numPorte;
    }
    public String toString(){
      return String.format("%s %d porte", super.toString(), numPorte);
    }
}
