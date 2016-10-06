
/**
 * Su una linea ferroviaria rispetto alla tariffa piena gli utenti pensionati usufruiscono di uno sconto del
 * 10%, gli studenti del 15% e i disoccupati del 25%. Codificando i pensionati con una P, gli studenti
 * con una S e i disoccupati con una D; scrivere un programma che, richiesto il costo del biglietto e
 * l’eventuale condizione particolare dell’utente, visualizzi l’importo da pagare.
 */
public class Esercizio23
{
    public static void main(){
        System.out.print("Inserire il costo del biglietto: ");
        int costo = Tastiera.leggiUnIntero();
        System.out.print("Inserire P se si è pensionati, " +
                                        "S se si è studenti, D se si è disoccupati, altrimenti lasciare vuoto: ");
        char stato = Tastiera.leggiUnCarattere();
        switch ( stato ){
            case ( 'P' ):
                costo = (costo / 100) * 90;
                break;
            case ( 'S' ):
                costo = (costo / 100) * 85;
                break;
            case ( 'D' ):
                costo = costo / 100 * 75;
                break;
        }
        System.out.println("L'importo da pagare è: " + costo);
    }
}
