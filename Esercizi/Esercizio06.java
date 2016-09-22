
/**
 * Scrivere un programma che, data la misura di un angolo in gradi, primi e secondi, determini la sua ampiezza
 * espressa in secondi
 */
public class Esercizio06
{
   public static void main(){
       System.out.print("Inserire la parte dei gradi dell'ampiezza dell'angolo: ");
       int g = Tastiera.leggiUnIntero();
       System.out.print("Inserire la parte dei primi dell'ampiezza dell'angolo: ");
       int p = Tastiera.leggiUnIntero();
       System.out.print("Inserire la parte dei secondi dell'ampiezza dell'angolo: ");
       int s = Tastiera.leggiUnIntero();
       s += ( g * 60  + p ) * 60;
       System.out.println("L'ampiezza dell'angolo in secondi è: " + s);
   }
}
