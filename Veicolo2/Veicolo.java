
/**
 *
 */
public class Veicolo
{
    //attributi
    protected String marca;
    protected String modello;
    protected String colore;
    protected int annoImmatricolazione;

    //costruttore
    public Veicolo(String marca, String modello, String colore, int annoImmatricolazione){
      this.marca = marca;
      this.modello = modello;
      this.colore = colore;
      this.annoImmatricolazione = annoImmatricolazione;
    }
    //funzioni
    public String toString(){
      return String.format("%s %s %s (%d)", marca, modello, colore, annoImmatricolazione);
    }
}
