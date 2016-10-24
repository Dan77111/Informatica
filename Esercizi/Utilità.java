
/**
 * Robe utili
 */
public class Utilità
{
    public static int[] exchangeSort(int[] arrayTemp){
        int temp = 0;
        int[] array = Utilità.copiaDiUnArray(arrayTemp);
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
    public static int[] bubbleSort(int[] arrayTemp){
        int[] array = Utilità.copiaDiUnArray(arrayTemp);
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
    public static int[] selectionSort(int[] arrayTemp){
        int[] array = Utilità.copiaDiUnArray(arrayTemp);
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
    public static int piuFrequenteInArray_old(int[] array){
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
    public static int piuFrequenteInArray(int[] array){
        /*
        int[] occ = new int[array.length * 2];
        for ( int i = 0; i < array.length; i +=2 ){
            if ( i == )
                occ[i] = 
        }
        */
       return(1);
    }
    public static int piuFrequenteInArrayVolte_old(int[] array){
        int n = array.length, numPiuFreqVolteTemp = 1, numPiuFreqVolte = 1, 
            numPiuFreqTemp = array[0], numPiuFreq = array[0];
        boolean noDoppi = true;
        int[] arrayOrdinato = Utilità.selectionSort(array);
        for ( int i = 0; i < n - 1; i++ ){
            if ( arrayOrdinato[i] == arrayOrdinato[i+1] ){
                noDoppi = false;
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
        if ( noDoppi == true ){
            return(1);
        } else {
            return(numPiuFreqVolte);
        }
    }
    public static int piuFrequenteInArrayVolte(int[] array){
        int[] arrayOrdinato = Utilità.exchangeSort(array);
        int numPiuFreq = arrayOrdinato[0], numPiuFreqTemp = arrayOrdinato[0], numPiuFreqVolte = 1, numPiuFreqVolteTemp = 1;
        for ( int i = 1; i < array.length; i++ ){
            if ( arrayOrdinato[i] == numPiuFreqTemp ){
                numPiuFreqVolteTemp ++;
            } else {
                numPiuFreqVolteTemp = 1;
                numPiuFreqTemp = arrayOrdinato[i];
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
    public static int[] copiaDiUnArray(int[] arrayTemp){
        int[] array = new int[arrayTemp.length];
        for (int i = 0; i < array.length; i++){
            array[i] = arrayTemp[i];
        }
        return(array);
    }
}
