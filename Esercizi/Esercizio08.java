
/**
 * 
 */
public class Esercizio08
{
   public static void main(){
       System.out.print("Inserire un numero: ");
       int x = Tastiera.leggiUnIntero();
       String s;
       if ( (x % 2) == 0){
           s = "pari";
       } else {
           s = "dispari";
       }
       System.out.println("Il numero inserito è " + s);
   }
}
