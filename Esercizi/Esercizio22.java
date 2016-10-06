
/**
 * Scrivere un programma che, dato in ingresso il numero n dei lati di un poligono equilatero (con n
 * compreso tra 3 e 6) e la lunghezza l del lato del poligono (con l>0), stabilire di che tipo di poligono
 * si tratta e calcolarne il perimetro.
 */
public class Esercizio22
{
   public static void main(){
       System.out.print("Inserire il numero di lati: ");
       int n = Tastiera.leggiUnIntero();
       String poligono = "";
       int perimetro = 0;
       if ( n < 3 || n > 6){
           System.out.println("I lati devono essere tra 3 e 6!");
       } else {
           System.out.print("Inserire la lunghezza dei lati: ");
           int l = Tastiera.leggiUnIntero();
           if ( l <= 0 ){
               System.out.println("La lunghezza deve essere positiva!");
           } else {
               switch( n ){
                  case (3):
                    poligono = "triangolo";
                    perimetro = 3 * l;
                    break;
                  case (4):
                    poligono = "quadrato";
                    perimetro = 4 * l;
                    break;
                  case (5):
                    poligono = "pentagono";
                    perimetro = 5 * l;
                    break;
                  case (6):
                    poligono = "esagono";
                    perimetro = 6 * l;
               }
               System.out.println("Il poligono è un " + poligono + " e il suo perimetro è " + perimetro);
           }
       }
   }
}