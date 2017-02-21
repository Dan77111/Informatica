package veicoli.utilita;
import veicoli.Veicolo;
import veicoli.automobili.Automobile;
import veicoli.motocicli.Motociclo;

/**
 *
 */
public class Utilita
{
    private static int i, j, n;
    public static Veicolo[] veicoliLusso(Veicolo[] veicoli){
        Veicolo[] lista = new Veicolo[veicoli.length];
        i = 0;
        j = 0;
        n = 0;
        return diLusso(lista, veicoli);
    }
    private static Veicolo[] diLusso(Veicolo[] lista, Veicolo[] veicoli){
        if ( j < veicoli.length ){
            if ( veicoli[j].numeroPosti() > 5 || veicoli[j].tassaCircolazione() > 500 ){
                lista[i] = veicoli[j];
                i ++;
                j ++;
                return diLusso(lista, veicoli);
            } else {
                j ++;
                n ++;
                return diLusso(lista, veicoli);
            }
        } else {
            return rimuoviNElementiDaLista(lista);
        }
    }
    private static Veicolo[] rimuoviNElementiDaLista(Veicolo[] lista){
        Veicolo[] lista2 = new Veicolo[lista.length-n];
        for ( int z = 0; z < lista2.length; z ++ ){
            lista2[z] = lista[z];
        }
        return lista2;
    }
}
