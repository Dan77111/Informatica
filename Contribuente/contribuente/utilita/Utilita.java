package contribuente.utilita;
import contribuente.Contribuente;
import contribuente.persone.PersonaFisica;
import contribuente.aziende.Azienda;

/**
 *
 */
public class Utilita
{
    private static int i, j, p;
    public static Contribuente[] debitori(Contribuente[] contribuenti, double[] pagamentiPervenuti){
        Contribuente[] debitori = new Contribuente[contribuenti.length];
        for ( int i = 0; i < contribuenti.length; i ++ ){
            if ( contribuenti[i].daPagare() > pagamentiPervenuti[i] ){
                debitori[i] = contribuenti[i];
            }
        }
        return debitori;
    }
    /*
    public static Contribuente[] aziendeDebitrici(Contribuente[] debitori){
        int[] temp = new int[debitori.length];
        int j = 0;
        for ( int i = 0; i < debitori.length; i ++ ){
            if ( debitori[i].id().length() == 11 ){
                temp[j++] = i;
            }
        }
        Contribuente[] aziendeDebitrici = new Contribuente[j+1];
        for ( int i = 0; i <= j; i ++ ){
            aziendeDebitrici[i] = debitori[temp[i]];
        }
        return aziendeDebitrici;
    }
    */
    public static Contribuente[] aziendeDebitrici(Contribuente[] debitori){
        Contribuente[] lista = new Contribuente[debitori.length];
        i = 0;
        j = 0;
        p = 0;
        return isAzienda(lista, debitori);
    }
    private static Contribuente[] isAzienda(Contribuente[] lista, Contribuente[] debitori){
        if ( j < debitori.length ){
            if ( debitori[j].id().length() == 11 ){
                lista[i] = debitori[j];
                i ++;
                j ++;
                return isAzienda(lista, debitori);
            } else {
                j ++;
                p ++;
                return isAzienda(lista, debitori);
            }
        } else {
            return rimuoviPElementiDaLista(lista);
        }
    }
    private static Contribuente[] rimuoviPElementiDaLista(Contribuente[] lista){
        Contribuente[] lista2 = new Contribuente[lista.length-p];
        for ( int z = 0; z < lista2.length; z ++ ){
            lista2[z] = lista[z];
        }
        return lista2;
    }
    public static PersonaFisica cerca(String nome, String cognome, PersonaFisica[] lista){
        for ( int i = 0; i < lista.length; i ++ ){
            if ( lista[i].getNome() == nome && lista[i].getCognome() == cognome ){
                return lista[i];
            }
        }
        return null;
    }
}
