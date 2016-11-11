/**
 * 
 */
public class testLotto2
{
    public static void main(){
        int i = 1;
        boolean x;
        do {
            x = Lotto2.main();
            i++;
            System.out.println("Tentativo " + i + "...");
        } while ( !x );
        System.out.println("Ci sono voluti " + i + " tentativi prima di fare un superenalotto!");
    }
}
