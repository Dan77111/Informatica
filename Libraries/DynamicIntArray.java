
/**
 * Prova Array Dinamico
 *
 * @author Daniele
 * @version 0.1
 */
public class DynamicIntArray
{
    private int[] array;
    public DynamicIntArray( int[] elementi){
        array = new int[elementi.length];
        for ( int i = 0; i < elementi.length; i ++ ){
            array[i] = elementi[i];
        }
    }
    public void append(int elemento){
        int[] arrayTemp = new int[array.length];
        for ( int i = 0; i < array.length; i ++ ){
            arrayTemp[i] = array[i];
        }
        array = new int[array.length+1];
        for ( int i = 0; i < arrayTemp.length; i ++ ){
            array[i] = arrayTemp[i];
        }
        array[array.length-1] = elemento;
    }
    public void changeValue(int indice, int valore){
        array[indice] = valore;
    }
    public void printArray(){
        for ( int i = 0; i < array.length; i ++ ){
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
    public void sort(){
        int temp;
        for ( int i = 0; i < array.length-1; i++ ){
            for ( int j = i+1; j < array.length; j++ ){
                if ( array[i] > array[j] ){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    public int length(){
        return(array.length);
    }
    public int[] getArray(){
        return(array);
    }
}
