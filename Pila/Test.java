
/**
 *
 */
public class Test
{
    public static void main(){
        Pila pila = new Pila();
        System.out.printf("isEmpty() su pila vuota: %b\n",pila.isEmpty());
        System.out.printf("isFull() su pila vuota: %b\n",pila.isFull());
        System.out.printf("%s", pila);
        for ( int i = 0; i < pila.DIMENSIONE+1; i ++ ){
            pila.push(pila.DIMENSIONE-i);
        }
        System.out.printf("isEmpty() su pila piena: %b\n",pila.isEmpty());
        System.out.printf("isFull() su pila piena: %b\n",pila.isFull());
        System.out.printf("%s", pila);
        for ( int i = 0; i < pila.DIMENSIONE+1; i ++ ){
            System.out.printf("%d\n",pila.pop());
        }
    }
}
