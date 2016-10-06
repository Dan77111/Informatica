
/**
 * 
 */
public class Esercizio15
{
    public static void main1(){
        System.out.print("Inserire la misura del primo lato: ");
        int lato1 = Tastiera.leggiUnIntero();
        System.out.print("Inserire la misura del secondo lato: ");
        int lato2 = Tastiera.leggiUnIntero();
        System.out.print("Inserire la misura del terzo lato: ");
        int lato3 = Tastiera.leggiUnIntero();
        String tipo;
        if ( lato1 == lato2 && lato2 == lato3 ){
            tipo = "equilatero";
        } else if ( lato1 == lato2 || lato2 == lato3 || lato1 == lato3 ){
            tipo = "isoscele";
        } else {
            tipo = "scaleno";
        }
        System.out.println("Il triangolo inserito è " + tipo);
    }
}
