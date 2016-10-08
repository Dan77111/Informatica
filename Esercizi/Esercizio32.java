
/**
 * Scrivere un programma che, data una sequenza di numeri interi chiusa dallo zero, determini la
 * percentuale dei numeri positivi, negativi, pari e dispari nell’ambito della sequenza escluso lo zero.
 * DO WHILE
 */
public class Esercizio32
{
    public static void main(){
         System.out.print("Inserire il numero di numeri: ");
         int n = Tastiera.leggiUnIntero();
         int[] numeri = new int[n];
         for ( int i = 0; i < n; i++ ){
             System.out.print("Inserire un numero: ");
             numeri[i]= Tastiera.leggiUnIntero();
         }
         int pos = 0, neg = 0, pari = 0, disp = 0;
         for ( int i = 0; i < n; i ++ ){
             if ( numeri[i] == 0 ){
                 continue;
             } else {
                 if ( numeri[i] < 0 ){
                     neg ++;
                 } else {
                     pos ++;
                 }
                 if ( numeri[i] % 2 == 0){
                     pari ++;
                 } else {
                     disp ++;
                 }
             }
         }
         pari *= 100/n;
         disp *= 100/n;
         pos *= 100/n;
         neg *= 100/n;
         System.out.println("I pari sono il " + pari + "%, I dispari sono il " + disp + 
                            "%,\nI negativi sono il " + neg + "%, I positivi sono il " + pos + "%");
    }
}
