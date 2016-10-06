
/**
 * Ordinamenti!!!
 */
public class Ordinamento
{
    public static int[] exchange(int[] array){
        int temp = 0;
        for ( int i = 0; i < array.length - 1; i ++ ){
            for ( int j = i + 1; j < array.length; j ++ ){
                if (array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return(array);
    }
    public static int[] bubble(int[] array){
        for(int i = 0; i < array.length; i++) {
            boolean ordinato = false;
            for(int j = 0; j < array.length-1; j++) {
                if(array[j]>array[j+1]) {
                    int k = array[j];
                    array[j] = array[j+1];
                    array[j+1] = k;
                    ordinato = true;
                }
            }
            if(!ordinato){
                break;
            }
        }
        return(array); 
    }
    public static int[] selection(int[] array){
        
        return(array); 
    }
}
