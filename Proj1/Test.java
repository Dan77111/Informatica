import java.util.Random;

/**
*
*/

public class Test
{

  public static void main(){
    ScaffaleDiPoligoni scaffale = new ScaffaleDiPoligoni();
    Random rand = new Random();
    int nPoligoni = rand.nextInt(6) + 5;
    for ( int i = 0; i < nPoligoni; i ++){
      scaffale.sistemaPoligono(( rand.nextInt(2) == 0 ) ? Cerchio.creaCasuale() : ( ( rand.nextInt(2) == 0 ) ? Triangolo.creaCasuale() : Rettangolo.creaCasuale()));
    }
    System.out.println(scaffale);
  }
}
