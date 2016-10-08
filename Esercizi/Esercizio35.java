
/**
 * Scrivere un programma che, data una sequenza di numeri chiusa dallo zero, determini il maggiore, il
 * minore, la somma e la media dei valori nell’ambito della sequenza escluso lo zero. DO WHILE
 */
public class Esercizio35
{
    public static void main(){
        System.out.print("Inserire il numero di numeri: ");
        int n = Tastiera.leggiUnIntero();
        int[] numeri = new int[n];
        for ( int i = 0; i < n; i ++ ){
            System.out.print("Inserire un numero: ");
            numeri[i] = Tastiera.leggiUnIntero();                     
        }
        numeri = Ordinamento.bubble(numeri);
        int maggiore = numeri[n - 1], minore = numeri[0], somma = 0;
        for ( int i = 0; i < n; i ++ ){
            somma += numeri[i];
        }
        double media = (double) somma / n;
        System.out.println("Il maggiore è " + maggiore + ", Il minore è " + minore + 
                                        ",\nLa somma è " + somma + ", La media è " + media );
    }
}
