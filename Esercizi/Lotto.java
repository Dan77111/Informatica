import java.util.Random;
/**
 * Si vuole realizzare una classe Lotto, che mantiene informazioni su una estrazione del lotto. 
 * 
 * Ogni estrazione è caratterizzata da 5 numeri (interi) estratti su 6 ruote.
 * 
 * Della classe sono d'interesse le seguenti funzionalità:
 * 
 * 1. creazione di una estrazione del lotto: si generino casualmente i numeri estratti utilizzando per la generazione di ciascun numero la seguente espressione:
 * (int) (Math.random() * 90) + 1
 * 
 * 
 * 2. Si faccia in modo che tra i numeri estratti su una stessa ruota non vi siano duplicati. Quindi, per ciascun numero generato, bisogna verificare 
 *      che non sia già stato estratto sulla stessa ruota, e nel caso lo sia, ignorarlo e generarne un altro.
 * 
 * 3. acquisisci da tastiera un array di 5 numeri interi. 
 * 
 * 4. Verifica che l'array passato come argomento rappresenti un ambo, un terno, una quaterna o una cinquina su almeno una ruota, e restituzione di 
 *      una stringa che rappresenti opportunamente il risultato (es.: se si è realizzata una cinquina il metodo restituisce "cinquina", se non si è 
 *      realizzato nulla, il metodo restituisce "nulla") e specificando su che ruota.
 * 
 * 
 * 5. verifica che l'array (di lunghezza cinque) passato come parametro rappresenti una vincita al superEnalotto. I 6 numeri vincenti tra i quali devono 
 *      comparire i numeri giocati sono dati dal primo numero estratto da ciascuna ruota che sia diverso da tutti i numeri vincenti già presi dalle ruote precedenti.
 */
public class Lotto
{
    public static void main(){
        Random rand = new Random();
        int[] scheda = new int[5];
        int[][] estrazioni = new int[6][5];
        String[][] vincita = new String[6][2];
        int numeroEstratto = 0, tempNumeriCorrispondenti, numeriS = 0;
        String stringaVincita;
        for ( int i = 0; i < estrazioni.length; i++ ){
            for ( int j = 0; j < estrazioni[0].length; j++ ){
                while ( controllaNumeroDuplicato(numeroEstratto, estrazioni, i) ){
                    numeroEstratto = rand.nextInt(90)+1;
                } 
                estrazioni[i][j] = numeroEstratto;
            }
        }
        for (int i = 0; i < 5; i++ ){
            System.out.print("Inserisci il numero " + (i+1) + " della scheda: ");
            scheda[i] = Tastiera.leggiUnIntero();
        }
        for ( int i = 0; i < 6; i++ ){
            tempNumeriCorrispondenti = 0;
            for ( int j = 0; j < 5; j++ ){
                for ( int k = 0; k < 5; k ++ ){
                    if ( scheda[k] == estrazioni[i][j] ){
                        tempNumeriCorrispondenti++;
                    }
                }
            }
            switch ( tempNumeriCorrispondenti){
                    case 2:
                        stringaVincita = "ambo";
                        break;
                    case 3:
                        stringaVincita = "terna";
                        break;
                    case 4:
                        stringaVincita = "quaterna";
                        break;
                   case 5:
                        stringaVincita = "cinquina";
                        break;
                   default:
                        stringaVincita = "nulla";
            }
            vincita[i][0] = ""+i;
            vincita[i][1] = stringaVincita;
        }
        for ( int i = 0; i < 6; i++ ){
            System.out.println(vincita[i][1] + " sulla ruota " + vincita[i][0]);
        }
        for ( int i = 0; i < 6; i++ ){
            for ( int j = 0; j < 5; j ++ ){
                if ( !controllaNumeroGiaEstratto(estrazioni[i][j], estrazioni, i, j) ){
                    for ( int s = 0; s < 5; s ++  ){
                        if ( scheda[s] == estrazioni[i][j] ){
                            numeriS ++;
                        }
                    }
                    break;
                }
            }
        }
        if ( numeriS == 5 ){
            System.out.println("La scheda inserita è una vincita al superenalotto");
        } else {
            System.out.println("La scheda inserita non è una vincita al superenalotto");
        }
    }
    public static boolean controllaNumeroDuplicato(int numero, int[][] estrazioni, int i){
        for ( int j = 0; j < estrazioni[0].length; j++ ){
            if ( numero == estrazioni[i][j] ){
                return true;
            }
        }
        return false;
    }
    public static boolean controllaNumeroGiaEstratto(int numero, int[][] estrazioni, int i, int j){
        for ( int k = 0; k < i; k++ ){
            if ( k < i ){
                for ( int l = 0; l < estrazioni[0].length; l++ ){
                    if ( numero == estrazioni[i][j] ){
                        return true;
                    }
                }
            } else {
                for ( int l = 0; l < j; l++ ){
                    if ( numero == estrazioni[i][j] ){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
