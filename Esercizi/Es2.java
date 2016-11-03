
/**
 * Un'azienda ha 19 dipendenti.
 * Essi possono fare, al massimo, 30 giorni di ferie e avere, al massimo, 40 giorni di malattia (DOPODICHE' NON SARANNO PAGATI). I totali dei giorni di ferie (di tutti i dipendenti) sono registrati in un vettore, i totali dei giorni di malattia (di tutti i dipendenti) sono registrati in un secondo vettore. Dati in input:
 * - l'identificativo di un dipendente
 * - il numero di giorni di permesso che desidera avere
 * - il tipo di permesso (ferie o malattia)
 * 
 * fornisci in output:
 * - il nominativo del dipendente, 
 * - l'esito della concessione di tale permesso (positivo nel caso in cui il dipendente enon ha superato il tetto massimo previsto, negativo nel caso contrario). 
 * 
 * Se il permesso viene accordato, aggiorna il totale che lo interessa. 
 * 
 * L'algoritmo inoltre, dovrà fornire in output la trattenuta relativa al permesso concesso tenendo conto che per ogni giorno di ferie vengono trattenuti 5 euro, mentre per ogni giorno di malattia vengono trattenuti 3 euro.
 * 
 * Suggerimenti: 
 * - procedi per passi
 * - usa lo switch per fornire in output il nominativo del dipendente
 * 
 * Nominativo  giorni di ferie giorni di malattia
 * 0   Agostini    3       5
 * 1   Araid       39      4
 * 2   Briosi      12      32
 * 3   Casagrande  32      8
 * 4   Cimadom     21      5
 * 5   Ciola       11      3
 * 6   Dalla Rosa  9       2
 * 7   Dell'Agnolo 7       6
 * 8   Facchinelli 0       8
 * 9   Gretter     22      0
 * 10  Hamrouni    14      8
 * 11  Lazzaretti  17      4
 * 12  Lenzi       31      12
 * 13  Ligama      6       21
 * 14  Lorenzi     8       40
 * 15  Naci        11      39
 * 16  Strappazzon 21      31
 * 17  Villotti    12      32
 * 18  Vivian      13      21
 * 
 * VERSIONE BASE
 * 
 * Un'azienda ha 19 dipendenti.
 * Essi possono fare, al massimo, 30 giorni di ferie e avere, al massimo, 40 giorni di malattia (DOPODICHE' NON SARANNO PAGATI). 
 * I totali dei giorni di ferie (di tutti i dipendenti) sono registrati in un vettore, i totali dei giorni di malattia (di tutti i dipendenti) sono registrati in un secondo vettore e i nominativi dei dipendenti in un terzo vettore. Dati in input:
 * - il nominativo di un dipendente
 * - il numero di giorni di permesso che desidera avere
 * - il tipo di permesso (ferie o malattia)
 * 
 * fornisci in output l'esito della concessione di tale permesso (positivo nel caso in cui il dipendente enon ha superato il tetto massimo previsto, negativo nel caso contrario). 
 * Se il permesso viene accordato, aggiorna il totale che lo interessa. L'algoritmo inoltre, dovrà fornire in output la trattenuta relativa al permesso concesso tenendo conto che per ogni giorno di ferie vengono trattenuti 5 euro, 
 * mentre per ogni giorno di malattia vengono trattenuti 3 euro.
 * 
 */
public class Es2
{
    public static void main(){
        String[] nominativi = { "Agostini", "Araid", "Briosi", "Casagrande", "Cimadom", "Ciola",
                                "Dalla Rosa", "Dell'Agnolo", "Facchinelli", "Gretter", "Hamrouni", 
                                "Lazzaretti", "Lenzi", "Ligama", "Lorenzi", "Naci", "Strappazzon", 
                                "Villotti", "Vivian" };
        int[] ferie = { 3, 39, 12, 32, 21, 11, 9, 7, 0, 22, 14, 17, 31, 6, 8, 11, 21, 12, 13 };
        int[] malattia = { 5, 4, 32, 8, 5, 3, 2, 6, 8, 0, 8, 4, 12, 21, 40, 39, 31, 32, 21 };
        int n = nominativi.length, indice = -1, permesso = -1;
        while (true){
        System.out.print("Inserire il nome del dipendente o Esci per uscire: ");
        String dipendente = Tastiera.leggiUnaStringa();
            if ( dipendente.equals("Esci")){
                break;
            }
            for ( int i = 0; i < n; i++ ){
                if ( dipendente.equals(nominativi[i])){
                    indice = i;
                } 
            }
            if (indice == -1){
                System.out.println("Il nome inserito non corrisponde a nessun dipendente");
            }
            System.out.print("Inserire il numero di giorni di permesso richiesti: ");
            int permessoRichiesto = Tastiera.leggiUnIntero();
            System.out.print("Ferie o Malattia? ");
            String tipoDiPermesso = Tastiera.leggiUnaStringa();
            if ( tipoDiPermesso.equals("Ferie") ){
                permesso = 0;
            } else if ( tipoDiPermesso.equals("Malattia") ){
                permesso = 1;
            } else {
                System.out.print("Il tipo di permesso non è stato inserito correttamente");
            }
            if ( permesso == 0 ){
                if ( permessoRichiesto <= 30 - ferie[indice] ){
                    ferie[indice] += permessoRichiesto;
                    System.out.println("Le ferie richieste sono state accordate e verranno trattenuti " + 5 * ferie[indice] + " euro" );
                } else{
                    System.out.println("Le ferie richieste superano il tetto massimo");
                }
            } else if ( permesso == 1 ){
                if ( permessoRichiesto <= 40 - malattia[indice] ){
                    malattia[indice] += permessoRichiesto;
                    System.out.println("La malattia richiesta è stata accordata e verranno trattenuti " + 3 * malattia[indice] + " euro" );
                } else{
                    System.out.println("Le malattia richiesta supera il tetto massimo");
                }
            }
        }
    }
}
