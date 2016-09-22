
/**
 * Scrivere un programme che, dati tre numeri interi, ne calcoli la somma e la media aritmetica.
 */
public class Esercizio03
{
    public static void main(){
        System.out.print("Inserisci un intero: ");
        int x = Tastiera.leggiUnIntero();
        System.out.print("Inserisci un intero: ");
        int y = Tastiera.leggiUnIntero();
        System.out.print("Inserisci un intero: ");
        int z = Tastiera.leggiUnIntero();
        int somma = x + y + z;
        double media = (double) somma / 3;
        System.out.println("La somma dei tre numeri inseriti è: " + somma);
        System.out.println("La media tra i tre numeri inseriti è: " + media);
    }
}
