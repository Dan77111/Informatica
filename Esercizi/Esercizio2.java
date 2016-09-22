
/**
 * Scrivere un programma che, date due variabili, ne scambi il contenuto.
 */
public class Esercizio2
{
   public static void main(){
       System.out.print("Inserisci il valore della prima variabile: ");
       int x = Tastiera.leggiUnIntero();
       System.out.print("Inserisci il valore della seconda variabile: ");
       int y = Tastiera.leggiUnIntero();
       int z = x;
       x = y;
       y = z;
       System.out.println("La prima variabile adesso vale: " + x);
       System.out.println("La seconda variabile adesso vale: " + y);
   }
}
