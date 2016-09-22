
/**
 * Scrivere un programma che, supponendo che l'operatore resto non esista, calcoli il resto della divisione di due
 * numeri interi forniti in input
 */
public class Esercizio05
{
   public static void main(){
       System.out.print("Inserisci l'intero di cui fare il modulo: ");
       int x = Tastiera.leggiUnIntero();
       System.out.print("Inserisci l'intero con cui fare il modulo: ");
       int y = Tastiera.leggiUnIntero();
       int modulo = x - ( x / y * y );
       System.out.println("Il modulo tra " + x + " e " + y + " è: " + modulo);
   }
}
