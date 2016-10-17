/**
 *  Esercizio 14/10/2016:
 *  
 *  - fai la lettura e stampa a video di un array
 *  - trova il massimo elemento
 *  - verifica se gli elementi sono stati inseriti in sequenza crescente e restituisci un messaggio positivo o negativo
 *  - verifica l'esistenza di una coppia di elementi uguali
 *  - crea un array che contiene l'inverso della sequenza e mostralo a video
 *  - riporta l'elemento più frequente della sequenza e scrivi quante volte ricorre.
 */
public class Es
{
    public static void main(){
        System.out.print("Inserisci la lunghezza dell'array: ");
        int n = Tastiera.leggiUnIntero();
        int[] numeri = new int[n];
        int[] arrayOrdinato = new int[n];
        int[] arrayInverso = new int[n];
        boolean ordinato = true, presenzaDiDoppio = false;
        int x;
        for ( int i = 0; i < n; i++ ){
            System.out.print("Inserisci un valore: ");
            x = Tastiera.leggiUnIntero();
            numeri[i] = x;
            arrayOrdinato[i] = x;
        }
        System.out.print("Gli elementi dell'array sono: ");
        Utilità.stampaDiUnArray(numeri);
        arrayOrdinato = Utilità.selectionSort(arrayOrdinato);
        System.out.println("Il maggiore è: " + arrayOrdinato[n-1]);
        for ( int i = 0; i < n; i++ ){
            if ( numeri[i] != arrayOrdinato[i] ){
                ordinato = false;
                break;
            }
        }
        if ( ordinato == true ){;
            System.out.println("I numeri sono stati inseriti in ordine");
        } else {
            System.out.println("I numeri non sono stati inseriti in ordine");
        }
        for ( int i = 0; i < n - 1; i++ ){
            if ( arrayOrdinato[i] == arrayOrdinato[i + 1] ){
                presenzaDiDoppio = true;
                break;
            }
        }
        arrayInverso = Utilità.inversoDiUnArray(numeri);
        System.out.print("Gli elementi dell'array invertiti sono: ");
        Utilità.stampaDiUnArray(arrayInverso);
        if ( presenzaDiDoppio == false ){;
            System.out.println("Non ci sono numeri doppi");
        } else {
            System.out.println("Ci sono numeri doppi");
            int numPiuFreq = Utilità.piuFrequenteInArray(numeri);
            int numPiuFreqVolte = Utilità.piuFrequenteInArrayVolte(numeri);
            System.out.println("Il numero più frequente è " + numPiuFreq + " e compare " + numPiuFreqVolte + " volte");
        }
    }
}