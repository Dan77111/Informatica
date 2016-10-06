
/**
 * Scrivere un programma che, dati il valore del cambio euro/dollaro e l’importo in euro, calcoli il
 * corrispondente valore in dollari e viceversa in base alla scelta dell’utente.
 */
public class Esercizio19
{
    public static void main(){
        System.out.println("Scrivi '1' per euro-dollaro e '2' per dollaro-euro: ");
        if ( Tastiera.leggiUnIntero() == 1 ){
            System.out.println("Scrivi quanti dollari equivalgono a un euro: ");
            double cambio = Tastiera.leggiUnDouble();
            System.out.println("Scrivi l'importo in euro: ");
            int importo = Tastiera.leggiUnIntero();
            double importoCambiato = importo * cambio;
            System.out.println("Gli euro inseriti equivalgono a " + importoCambiato + " dollari");
        } else if ( Tastiera.leggiUnIntero() == 2 ){
            System.out.println("Scrivi quanti euro equivalgono a un dollaro: ");
            double cambio = Tastiera.leggiUnDouble();
            System.out.println("Scrivi l'importo in dollari: ");
            int importo = Tastiera.leggiUnIntero();
            double importoCambiato = importo * cambio;
            System.out.println("I dollari inseriti equivalgono a " + importoCambiato + " euro");
        }
    }
}
