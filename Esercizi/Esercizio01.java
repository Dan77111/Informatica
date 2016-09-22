
/**
 * Scrivere un programma che, dato un numero intero, ne calcoli il doppio e il quadrato
 */
public class Esercizio01
{
   public static void main(){
       System.out.print("Inserisci un intero: ");
       int x = Tastiera.leggiUnIntero();
       int doppio = x * 2;
       int quadrato = x * x;
       System.out.println("Il doppio è: " + doppio + ". Il quadrato è: " + quadrato);
   }
}
