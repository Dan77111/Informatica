
/**
 * Scrivere un programma che, dati tre numeri, determini il maggiore.
 */
public class Esercizio12
{
    public static void main1(){
        System.out.print("Inserire il primo numero: ");
        int x = Tastiera.leggiUnIntero();
        System.out.print("Inserire il secondo numero: ");
        int y = Tastiera.leggiUnIntero();
        System.out.print("Inserire il terzo numero: ");
        int z = Tastiera.leggiUnIntero();
        int maggiore = x;
        if ( maggiore < y ){
            maggiore = y;
        }
        if ( maggiore < z ){
            maggiore = z;
        }
        System.out.println("Il maggiore tra i numeri inseriti è: " + maggiore);
    }
     public static void main2(){
        System.out.print("Inserire il primo numero: ");
        int x = Tastiera.leggiUnIntero();
        System.out.print("Inserire il secondo numero: ");
        int y = Tastiera.leggiUnIntero();
        System.out.print("Inserire il terzo numero: ");
        int z = Tastiera.leggiUnIntero();
        int maggiore = 0;
        if ( x > y && x > z ){
            maggiore = x;
        } else if ( x < y && x > z ){
            maggiore = y;
        } else if ( x > y && x < z ){
            maggiore = z;
        }
        System.out.println("Il maggiore tra i numeri inseriti è: " + maggiore);
    }
     public static void main3(){
        System.out.print("Inserire il primo numero: ");
        int x = Tastiera.leggiUnIntero();
        System.out.print("Inserire il secondo numero: ");
        int y = Tastiera.leggiUnIntero();
        System.out.print("Inserire il terzo numero: ");
        int z = Tastiera.leggiUnIntero();
        int maggiore = 0;
        if ( x > y){
            if ( x > z ){
                maggiore = x;
            } else {
                maggiore = z;
            }
        } else if ( y > z ){
            maggiore = y;
        } else {
            maggiore = z;
        }
        System.out.println("Il maggiore tra i numeri inseriti è: " + maggiore);
    }
}
