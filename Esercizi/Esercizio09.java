
/**
 * Scrivere un programma che, dati due numeri, visualizzi la differenza tra il minore e il maggiore
 */
public class Esercizio09
{
   public static void main(){
       int differenza;
       System.out.print("Inserire il primo numero: ");
       int x = Tastiera.leggiUnIntero();
       System.out.print("Inserire il secondo numero: ");
       int y = Tastiera.leggiUnIntero();
       if ( x > y ){
           differenza = x - y;
       } else {
           differenza = y - x;
       }
       System.out.println("La differenza tra il maggiore e il minore è: " + differenza);
   }
}
