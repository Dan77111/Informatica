
/**
 *Scrivere un programma che, dato un numero intero, stabilisca se è positivo, negativo o uguale a zero
 */
public class Esercizio11
{
    public static void main(){
        System.out.print("Inserire un intero: ");
        String s;
        int x = Tastiera.leggiUnIntero();
        if ( x < 0 ){
            s = "minore di 0";
        } else if ( x == 0){
            s = "uguale a 0";
        } else {
            s = "maggiore di 0";
        }
        System.out.println("Il numero inserito è " + s);
    }
}