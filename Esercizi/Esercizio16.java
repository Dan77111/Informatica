
/**
 * Scrivere un programma che, dati tre numeri interi che rappresentano un orario espresso in ore,
 * minuti e secondi, stabilisca se è valido
 */
public class Esercizio16
{
   public static void main1(){
       System.out.print("Inserire il numero di ore: ");
       int ore = Tastiera.leggiUnIntero();
       System.out.print("Inserire il numero di minuti: ");
       int minuti = Tastiera.leggiUnIntero();
       System.out.print("Inserire il numero di secondi: ");
       int secondi = Tastiera.leggiUnIntero();
       if ( ore >= 0 && ore <= 23 && minuti >= 0 && minuti <= 59 && secondi >= 0 && secondi <= 59){
           System.out.println("L'orario inserito è valido");
       } else {
           System.out.println("L'orario inserito non è valido");
       }
   }
    public static void main2(){
       int[] orario = new int[3];
       System.out.print("Inserire il numero di ore: ");
       orario[0] = Tastiera.leggiUnIntero();
       System.out.print("Inserire il numero di minuti: ");
       orario[1] = Tastiera.leggiUnIntero();
       System.out.print("Inserire il numero di secondi: ");
       orario[2] = Tastiera.leggiUnIntero();
       if ( orario[0] >= 0 && orario[0] <= 23 && orario[1] >= 0 && orario[1] <= 59 && orario[2] >= 0 && orario[2] <= 59){
           System.out.println("L'orario inserito è valido");
       } else {
           System.out.println("L'orario inserito non è valido");
       }
   }
}
