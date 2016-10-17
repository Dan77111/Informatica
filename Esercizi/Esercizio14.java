
/**
 * Scrivere un programma che, dati tre numeri, li visualizzi in ordine crescente e decrescente
 */
public class Esercizio14
{
    public static void main1(){
       System.out.print("Inserire il primo numero: ");
       int n1 = Tastiera.leggiUnIntero();
       System.out.print("Inserire il secondo numero: ");
       int n2 = Tastiera.leggiUnIntero();
       System.out.print("Inserire il terzo numero: ");
       int n3 = Tastiera.leggiUnIntero();
       int maggiore = n1;
       int minore = n1;
       if ( maggiore < n2){
           maggiore = n2;
       } else {
           minore = n2;
       }
       if ( maggiore < n3 ){
           maggiore = n3;
       } else if ( minore > n3 ) {
           minore = n3;
       }
       int medio = n1 + n2 + n3 - maggiore - minore;
       System.out.println("I tre numeri inseriti in ordine crescente: " + minore +
                                                                    ", " + medio + ", " + maggiore);
       System.out.println("I tre numeri inseriti in ordine decrescente: " + maggiore +
                                                                    ", " + medio + ", " + minore);
    }
    public static void main2(){
       System.out.print("Inserire il numero di numeri da leggere: ");
       int n = Tastiera.leggiUnIntero();
       int[] numeri = new int[n];
       for ( int i = 0; i < numeri.length; i++ ){
           System.out.print("Inserire un numero: ");
           numeri[i] = Tastiera.leggiUnIntero();
       }
       numeri = Utilità.bubbleSort(numeri);
       for ( int i = 0; i < numeri.length; i ++){
           System.out.print(numeri[i]);
           if ( i != numeri.length - 1){
               System.out.print(", ");
           } else {
               System.out.println(".");
           }
       }
       
    }
}
