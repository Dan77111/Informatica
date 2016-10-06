
/**
 * 
 */
public class Esercizio20
{
    public static void main(){
        System.out.print("Inserisci il primo operando: ");
        double operando1 = Tastiera.leggiUnDouble();
        System.out.print("Inserisci il secondo operando: ");
        double operando2 = Tastiera.leggiUnDouble();
        System.out.print("Scrivi 1 per addizione, 2 per sottrazione,\n" +
                            "3 per moltiplicazione e 4 per divisione: ");
        int operazione = Tastiera.leggiUnIntero();
        double risultato = 0;
        if ( operazione == 1 ){
            risultato = operando1 + operando2;
        } else if ( operazione == 2 ){
            risultato = operando1 - operando2;
        } else if ( operazione == 3 ){
            risultato = operando1 * operando2;
        } else if ( operazione == 4 ){
            risultato = operando1 / operando2;
        } else {
            System.out.println("I dati inseriti non sono corretti");
            return;
        }
        System.out.println("Il risultato è " + risultato);
    }
}
