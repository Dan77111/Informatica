
/**
 * Scrivere un programma che, dati in input n numeri interi e un numero x, determini: quanti numeri
 * sono maggiori di x, quanti minori di x e quanti uguali a x. WHILE
 */
public class Esercizio31
{
    public static void main(){
        System.out.print("Inserire il valore di x: ");
        int x = Tastiera.leggiUnIntero();
        System.out.print("Inserire il numero di numeri da inserire: ");
        int n = Tastiera.leggiUnIntero();
        int[] numeri = new int[n];
        int y = 0, z = n - 1;
        for ( int i = 0; i < n; i++ ){
            System.out.print("Inserire il numero: ");
            numeri[i] = Tastiera.leggiUnIntero();
        }
        numeri = Ordinamento.bubble(numeri);
        while ( numeri[y] < x ){
            y++;
        }
        System.out.println("Ci sono " + y + " numeri minori di x");
        while ( numeri[z] > x ){
            z--;
        }
        System.out.println("Ci sono " + ( n - y - z ) + " numeri uguali a x");
        System.out.println("Ci sono " + z + " numeri maggiori di x");
    }
}
