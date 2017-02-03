
/**
 *
 */
public class Test
{
    public static void main(){
        Cilindro a = new Cilindro(1.0,1.0);
        System.out.printf("Raggio: %f, Altezza: %f, Circonferenza: %f, Area: %f, Volume: %f \n",
                          a.getRaggio(), a.getAltezza(), a.getCirconferenza(), a.getArea(), a.getVolume());
    }
}
