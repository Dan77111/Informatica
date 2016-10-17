
/**
 * Robe utili
 */
public class Utilità
{
    public static int[] exchangeSort(int[] array){
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
    public static int[] bubbleSort(int[] array){
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
    public static int[] selectionSort(int[] array){
        int minTemp, temp, posMin = 0;
        for ( int i = 0; i < array.length; i++ ){
            minTemp = array[i];
            for ( int j = i + 1 ; j < array.length; j++ ){
                if ( array[j] < minTemp ){
                    posMin = j;
                    minTemp = array[j];
                }
            }
            temp = array[i];
            array[i] = minTemp;
            array[posMin] = temp;
        }
        return(array); 
    }
    public static int piuFrequenteInArray(int[] array){
        int n = array.length, temp, numPiuFreqVolteTemp = 1, numPiuFreqVolte = 0, 
            numPiuFreqTemp = array[0], numPiuFreq = array[0];
        int[] arrayOrdinato = Utilità.selectionSort(array);
        for ( int i = 0; i < n - 1; i++ ){
            if ( arrayOrdinato[i] == arrayOrdinato[i+1] ){
                if ( numPiuFreqTemp != numPiuFreq ){
                        numPiuFreqVolteTemp = 1;
                }
                numPiuFreqTemp = arrayOrdinato[i];
                numPiuFreqVolteTemp ++;
            }
            if ( numPiuFreqVolteTemp > numPiuFreqVolte ){
                numPiuFreqVolte = numPiuFreqVolteTemp;
                numPiuFreq = numPiuFreqTemp;
            }
        }
        return(numPiuFreq);
    }
    public static int piuFrequenteInArrayVolte(int[] array){
        int n = array.length, temp, numPiuFreqVolteTemp = 1, numPiuFreqVolte = 0, 
            numPiuFreqTemp = array[0], numPiuFreq = array[0];
        int[] arrayOrdinato = Utilità.selectionSort(array);
        for ( int i = 0; i < n - 1; i++ ){
            if ( arrayOrdinato[i] == arrayOrdinato[i+1] ){
                if ( numPiuFreqTemp != numPiuFreq ){
                        numPiuFreqVolteTemp = 1;
                }
                numPiuFreqTemp = arrayOrdinato[i];
                numPiuFreqVolteTemp ++;
            }
            if ( numPiuFreqVolteTemp > numPiuFreqVolte ){
                numPiuFreqVolte = numPiuFreqVolteTemp;
                numPiuFreq = numPiuFreqTemp;
            }
        }
        return(numPiuFreqVolte);
    }
    public static int massimoInArray(int[] array){
        int[] arrayOrdinato = Utilità.selectionSort(array);
        return(arrayOrdinato[array.length-1]);
    }
    public static int minimoInArray(int[] array){
        int[] arrayOrdinato = Utilità.selectionSort(array);
        return(arrayOrdinato[0]);
    }
    public static int[] inversoDiUnArray(int[] array){
        int[] arrayInverso = new int[array.length];
        for ( int i = 0; i < array.length; i++ ){
                arrayInverso[i] = array[array.length-i-1];
            }
        return(arrayInverso);
    }
    public static void stampaDiUnArray(int[] array){
        for ( int i = 0; i < array.length; i++ ){
            if ( i == array.length -1){
                System.out.println(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        
    }
}
