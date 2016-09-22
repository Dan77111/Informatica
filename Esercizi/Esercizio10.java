
/**
 * Scrivere un programma che, dato un numero intero, lo scomponga in migliaia, centinaia, decine e unità
 */
public class Esercizio10
{
   public static void main(){
       System.out.print("Inserisci un numero compreso tra 1 e 9999: ");
       int x = Tastiera.leggiUnIntero();
       int unità = x - ( x / 10 * 10 );
       int decine = ( x - (  x / 100 * 100 ) - unità ) / 10;
       int centinaia = ( x - (  x / 1000 * 1000 ) - decine - unità ) / 100;
       int migliaia = x / 1000;
       System.out.println(migliaia + " migliaia, " + centinaia + " centinaia, " 
                            + decine + " decine, " + unità + " unità.");
   }
}
