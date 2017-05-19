
/**
 *
 */
public class Pila
{
    public final int DIMENSIONE = 10;
    private int[] valori;
    private int testa;
    public Pila(){
        valori = new int[DIMENSIONE];
        testa = 0;
    }
    public boolean isEmpty(){
        return testa == 0;
    }
    public boolean isFull(){
        return testa == DIMENSIONE;
    }
    public int pop(){
        if ( !isEmpty() ){
            testa --;
            return valori[testa];
        } else {
            return -1;
        }
    }
    public void push(int x){
        if ( !isFull() ){
            valori[testa] = x;
            testa ++;
        }
    }
    public String toString(){
        String toBeReturned = "------------------------------\n";
        if ( isEmpty() ){
            toBeReturned += "--------- Pila Vuota ---------\n";
        } else {
            for ( int i = 0; i < testa; i ++ ){
                toBeReturned = String.format("%sElemento in posizione %3d: %3d\n", toBeReturned, i+1, valori[i]);
            }
        }
        return toBeReturned + "------------------------------\n";
    }
}
