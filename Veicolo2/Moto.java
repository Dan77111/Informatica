
/**
 *
 */
public class Moto extends Veicolo
{
    //attributi
    private String categoria;

    //costruttore
    public Moto(String marca, String modello, String colore, int annoImmatricolazione, String categoria){
      super(marca, modello, colore, annoImmatricolazione);
      this.categoria = categoria;
    }

    //funzioni
    public String toString(){
      return String.format("%s %s %s %s (%d)", marca, modello, categoria, colore, annoImmatricolazione);
    }
}
