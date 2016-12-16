
/**
 *
 */
public class main
{
  public static void main(){
    Data data = new Data(12,2,29);
    System.out.printf( "%d/%d/%d \n",
                        data.getGiorno(), data.getMese(), data.getAnno() );
    Equazioni equazione = new Equazioni(21,43,6);
    System.out.printf( "x1 = %f, x2 = %f \n",
                        equazione.getX1(), equazione.getX2() );
  }
}
