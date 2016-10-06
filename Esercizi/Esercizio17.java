
/**
 *
 */
public class Esercizio17
{
   public static void main(){
       System.out.print("Inserire il numero di ore: ");
       int ore1 = Tastiera.leggiUnIntero();
       System.out.print("Inserire il numero di minuti: ");
       int minuti1 = Tastiera.leggiUnIntero();
       System.out.print("Inserire il numero di secondi: ");
       int secondi1 = Tastiera.leggiUnIntero();
       System.out.print("Inserire il numero di ore: ");
       int ore2 = Tastiera.leggiUnIntero();
       System.out.print("Inserire il numero di minuti: ");
       int minuti2 = Tastiera.leggiUnIntero();
       System.out.print("Inserire il numero di secondi: ");
       int secondi2 = Tastiera.leggiUnIntero();
       if ( ore1 > ore2 ){
           System.out.println("Il primo orario è il più recente");
       } else if ( ore2 > ore1 ){
           System.out.println("Il secondo orario è il più recente");
       } else if ( minuti1 > minuti2 ){
           System.out.println("Il primo orario è il più recente");
       } else if ( minuti2 > minuti1 ){
           System.out.println("Il secondo orario è il più recente");
       } else if ( secondi1 > secondi2 ){
           System.out.println("Il primo orario è il più recente");
       } else if ( secondi2 > secondi1 ){
           System.out.println("Il secondo orario è il più recente");
       } else {
           System.out.println("I due orari sono uguali");
       }
   }
}
