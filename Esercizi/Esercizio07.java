
/**
 * Scrivere un programma che, dato un numero espresso in secondi, calcoli il numero di ore, minuti e secondi
 * equivalenti
 */
public class Esercizio07
{
    public static void main(){
        System.out.print("Inserire il numero di secondi: ");
        int s = Tastiera.leggiUnIntero();
        int m = s / 60;
        int h = m / 60;
        s -= m * 60;
        m -= h * 60;
        System.out.println("I secondi inseriti equivalgono a: " + h + " ore, " + m + " minuti, " + s + " secondi.");
    }
}
