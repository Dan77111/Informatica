
/**
 * Scrivere un programma che, data una sequenza di numeri chiusa dallo zero, calcoli la somma dei
quadrati nell’ambito della sequenza escluso lo zero. DO WHILE
 */
public class Esercizio26
{
   public static void main(){
       int tot = 0;
       int n = 0;
       do {
           tot += (n * n);
           System.out.print("Inserire un numero o 0 per eseguire il calcolo: ");
           n = Tastiera.leggiUnIntero();
       } while( n != 0 );
       System.out.println(tot);
   }
}
