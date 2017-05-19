import java.util.Random;
/**
 *
 */
public class Test
{
    public static void main(){
        Random rand = new Random();
        int type = rand.nextInt(1);
        Figura3d figura;
        if ( type == 0 ){
            figura = Cilindro.creaCasuale();
        } else {
            figura = Parallelepipedo.creaCasuale();
        }
        System.out.printf("Area: %f, Volume: %f \n", figura.getAreaTotale(), figura.getVolume());
        System.out.println(figura);
    }
}
