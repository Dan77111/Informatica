
/**
 * 
 */
public class Main
{
    public static void main(){
        Sistema sis1 = new Sistema(2,4,6,3,5,8);
        sis1.esegui();
        System.out.println("La x è: " + sis1.getX() + ", la y è: " + sis1.getY());
    }
    public static void main2(){
        System.out.println("Inserire i dati:");
        Sistema sis1 = new Sistema(Tastiera.leggiUnIntero(),Tastiera.leggiUnIntero(),Tastiera.leggiUnIntero(),Tastiera.leggiUnIntero(),Tastiera.leggiUnIntero(),Tastiera.leggiUnIntero());
        sis1.esegui();
        System.out.println("La x è: " + sis1.getX() + ", la y è: " + sis1.getY());
    }
}
