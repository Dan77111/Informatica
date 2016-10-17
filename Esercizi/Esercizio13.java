
/**
 * Scrivere un programma che, dati quattro numeri, determini il maggiore, il minore e la differenza tra i due
 */
public class Esercizio13
{
   public static void main1(){
       System.out.print("Inserire il primo numero: ");
       int n1 = Tastiera.leggiUnIntero();
       System.out.print("Inserire il secondo numero: ");
       int n2 = Tastiera.leggiUnIntero();
       System.out.print("Inserire il terzo numero: ");
       int n3 = Tastiera.leggiUnIntero();
       System.out.print("Inserire il quarto numero: ");
       int n4 = Tastiera.leggiUnIntero();
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
       if ( maggiore < n4 ){
           maggiore = n4;
       } else if ( minore > n4){
           minore = n4;
       } 
       int differenza = maggiore - minore;
       System.out.println("Il maggiore è: " + maggiore + ", Il minore è: " + minore +
                                        ", La differenza tra i due è: " + differenza);
   }
   public static void main2(){
       System.out.print("Inserire il primo numero: ");
       int n1 = Tastiera.leggiUnIntero();
       System.out.print("Inserire il secondo numero: ");
       int n2 = Tastiera.leggiUnIntero();
       System.out.print("Inserire il terzo numero: ");
       int n3 = Tastiera.leggiUnIntero();
       System.out.print("Inserire il quarto numero: ");
       int n4 = Tastiera.leggiUnIntero();
       
       int maggiore = ( n1 > n2) ? n1 : n2;
       maggiore = ( maggiore > n3 ) ? maggiore : n3;
       maggiore = ( maggiore > n4 ) ? maggiore : n4;
       
       int minore = ( n1 < n2) ? n1 : n2;
       minore = ( minore < n3 ) ? minore : n3;
       minore = ( minore < n4 ) ? minore : n4;
       
       int differenza = maggiore - minore;
       System.out.println("Il maggiore è: " + maggiore + ", Il minore è: " + minore +
                                        ", La differenza tra i due è: " + differenza);
    }
   public static void main3(){
       System.out.print("Inserire il numero di numeri da leggere: ");
       int n = Tastiera.leggiUnIntero();
       int[] numeri = new int[n];
       for ( int i = 0; i < numeri.length; i++ ){
           System.out.print("Inserire un numero: ");
           numeri[i] = Tastiera.leggiUnIntero();
       }
       numeri = Utilità.bubbleSort(numeri);
       int differenza = numeri[numeri.length - 1] - numeri[0];
       System.out.println("Il maggiore è: " + numeri[numeri.length - 1] + ", Il minore è: " + numeri[0] +
                                        ", La differenza tra i due è: " + differenza);
    }
}
