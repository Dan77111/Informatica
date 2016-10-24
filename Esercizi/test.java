
/**
 * Aggiungi qui una descrizione della classe test
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class test
{
    public static void main(){
        int freq, piuFreq;
        System.out.println("---------------------------------------------------------------");
        for ( int i = 1; i < 20; i++ ){
            int[] array = new int[i];
            for ( int j = 0; j < i; j++ ){
                if ( j < i/2 ){
                    array[j] = 1;
                } else {
                    array[j] = 2;
                }
            }
            freq = Utilità.piuFrequenteInArrayVolte(array);
            piuFreq = Utilità.piuFrequenteInArray(array);
            Utilità.stampaDiUnArray(array);
            System.out.println("len = " + array.length + ", freq = " + freq + ", piuFreq = " + piuFreq);
        }
    }
}
