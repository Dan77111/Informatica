
/**
 * Scrivere un programma che, dato un numero intero, visualizzi tutti i suoi divisori e il numero di tali
 * divisori. FOR
 */
public class Esercizio33
{
    public static void main(){
        System.out.print("Inserire un numero: ");
        int n = Tastiera.leggiUnIntero();
        int ndivisori = 0, j = 0;
        for ( int i = 1; i <= n/2; i++ ){
            if ( n % i == 0 ){
                ndivisori++;
            }
        }
        int[] divisori = new int[ndivisori];
        for ( int i = 1; i <= n/2; i++ ){
            if ( n % i == 0 ){
                divisori[j] = i;
                j++;
            }
        }
        System.out.println("I divisori di n sono " + (ndivisori + 1) + " e sono: ");
        for ( int i = 0; i < ndivisori; i++ ){
            System.out.println(divisori[i] + ", ");
        }
        System.out.println(n);
    }
}
