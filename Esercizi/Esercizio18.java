
/**
 * 
 */
public class Esercizio18
{
    public static void main1(){
        System.out.println("Inserisci una temperatura");
        int temperatura = Tastiera.leggiUnIntero();
        if ( temperatura < 0 ){
            System.out.println("attenti al ghiaccio!");
        } else if ( temperatura == 0 ){
            System.out.println("si va a sciare!");
        } else if ( temperatura > 0 && temperatura <= 5 ){
            System.out.println("ci vuole il cappellino!");
        } else if ( temperatura > 5 && temperatura <= 10 ){
            System.out.println("basta il piumino!");
        } else if ( temperatura > 10 && temperatura <= 15 ){
            System.out.println("solo il maglioncino!");
        } else if ( temperatura > 15 && temperatura <= 20 ){
            System.out.println("magari!");
        } else if ( temperatura > 20 && temperatura <= 25 ){
            System.out.println("tutti al mare!");
        } else if ( temperatura > 25 ){
            System.out.println("condizionatore a manetta!");
        }
    }
    public static void main2(){
        System.out.println("Inserisci una temperatura");
        int temperatura = Tastiera.leggiUnIntero();
        if ( temperatura > 25 ){
            System.out.println("condizionatore a manetta!");
        } else if ( temperatura > 20 && temperatura <= 25 ){
            System.out.println("tutti al mare!");
        } else if ( temperatura > 15 && temperatura <= 20 ){
            System.out.println("magari!");
        } else if ( temperatura > 10 && temperatura <= 15 ){
            System.out.println("solo il maglioncino!");
        } else if ( temperatura > 5 && temperatura <= 10 ){
            System.out.println("basta il piumino!");
        } else if ( temperatura > 0 && temperatura <= 5 ){
            System.out.println("ci vuole il cappellino!");
        } else if ( temperatura == 0 ){
            System.out.println("si va a sciare!");
        } else if ( temperatura < 0 ){
            System.out.println("attenti al ghiaccio!");
        }
    }
}
