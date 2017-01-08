
/**
 *
 */
public class Stampa
{
    public static void stampa(String string){
        for ( int i = 0 ; i < string.length() ; i++ ){
            System.out.print(string.charAt(i));
            try {
                Thread.sleep(30);
            }
            catch ( InterruptedException e ){
                e.printStackTrace();
            }
        }
    }
}
