
/**
 * 
 */
public class Esercizi
{
    public static void main(){
        Aritmetica es1 = new Aritmetica();
        Aritmetica es2 = new Aritmetica();
        Aritmetica es3 = new Aritmetica();
        Aritmetica es4 = new Aritmetica();
        es1.Somma(2,6);
        es2.Sottrazione(7,4);
        es3.Moltiplicazione(3,6);
        es4.Divisione(9,2);
        System.out.println("Il risultato dell'es1 è " + es1.risultato);
        System.out.println("Il risultato dell'es2 è " + es2.risultato);
        System.out.println("Il risultato dell'es3 è " + es3.risultato);
        System.out.println("Il risultato dell'es4 è " + es4.risultato);
    }
}
