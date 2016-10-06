
/**
 * Scrivere un programma che visualizzi il più piccolo e il più grande tra 10 numeri inseriti da tastiera.
 * FOR
 */
public class Esercizio27
{
    public static void main(){
        int maggiore = 0;
        int minore = 0;
        int n = 0;
        for (int i = 0; i < 10; i ++){
            System.out.println("Inserire un numero: ");
            n = Tastiera.leggiUnIntero();
            if ( i == 0 ){
                minore = n;
                maggiore = n;
            }
            if ( n > maggiore ){
                maggiore = n;
            } else if( n < minore ){
                minore = n;
            }
        }
        System.out.println("Il maggiore è " + maggiore + ", il minore è " + minore);
    }
}
