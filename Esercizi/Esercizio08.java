
/**
 * 
 */
public class Esercizio08
{
   public static void main(){
       System.out.print("Inserire un numero: ");
       int x = Tastiera.leggiUnIntero();
       String s;
       if ( x % 2 == 0){
           System.out.println("Il numero inserito è pari");
       } else {
           System.out.println("Il numero inserito è dispari");
       }
   }
}
