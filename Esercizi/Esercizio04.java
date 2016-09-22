
/**
 * Scrivere un programma che calcoli la seguente espressione: y = xa + b, dove x deve essere fornito dall'utente, a
 * è uguale a 18 e b è uguale a 7. A e B devono essere delle costanti.
 */
public class Esercizio04
{
   public static void main(){
       System.out.print("Inserisci il valore di x: ");
       int x = Tastiera.leggiUnIntero();
       final int A = 18;
       final int B = 7;
       int y = x * A + B;
       System.out.println("y = " + y);
   }
}
