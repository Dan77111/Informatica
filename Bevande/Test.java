
/**
 *
 */
public class Test
{
    public static void main(){
        String[] coloranti1 = {"colorante1","colorante2","colorante3"};
        Bevanda[] b = new Bevanda[5];
        b[0] = new Acqua(1,1.1,1);
        b[1] = new Bibita(1,1.1,1,"bibita1",1.1,coloranti1);
        b[2] = new Birra(1,"tipo1","marca1");
        b[3] = new Vino(1,"tipo1","cantina1");
        b[4] = new Prosecco(1,"tipo1","cantina1");
        for ( int i = 0; i < 5; i ++ ){
            System.out.println(b[i]);
        }
    }
}
