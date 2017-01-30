
/**
 * 
 */
public class TestSemaforo
{
    public static void main(){
        Semaforo s = new Semaforo();
        System.out.println(s);
        for ( int i = 0; i < 30; i ++ ){
            s.passatoUnSecondo();
        }
        System.out.println(s);
        for ( int i = 0; i < 30; i ++ ){
            s.passatoUnSecondo();
        }
        System.out.println(s);
        s.passatoUnSecondo();
        s.passatoUnSecondo();
        s.passatoUnSecondo();
        s.passatoUnSecondo();
        s.passatoUnSecondo();
        System.out.println(s);
        s.passatoUnSecondo();
        System.out.println(s);
        for ( int i = 0; i < 70; i ++ ){
            s.passatoUnSecondo();
        }
        System.out.println(s);
    }
}
