
/**
 *
 */
public class Test
{
    public static void main(){
      Veicolo[] vett = new Veicolo[4];

      vett[0] = new Veicolo("Fiat", "Punto", "bianco", 2010);
      vett[1] = new Auto("Fiat", "Punto", "bianco", 2010, 5);
      vett[2] = new Taxi("Fiat", "Punto", "bianco", 2010, 5, "India 5");
      vett[3] = new Moto("Yamaha", "WR 450", "rosso", 2015, "cross");

      for ( int i = 0; i < 4; i ++ ){
        System.out.println(vett[i]);
      }
    }
}
