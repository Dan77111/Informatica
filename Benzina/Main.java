import java.util.Random;
/**
 *
 */
public class Main
{
    public static void main(){
        Random rand = new Random();
        String a;
        Car macchina1 = new Car("Macchina1", 2.0, "benzina", 100.0);
        Car macchina2 = new Car("Macchina2", 3.8, "gasolio", 78.9);
        Car macchina3 = new Car("Macchina3", 4.9, "benzina", 159.9);
        DistributoreBenzina distributore1 = new DistributoreBenzina(1.56, 1.34, "distributore1");
        distributore1.rifornisci(1000.0, 1000.0);
        macchina1.setSerbatoioAttuale(macchina1.getSerbatoioTotale());
        macchina2.setSerbatoioAttuale(macchina2.getSerbatoioTotale());
        macchina3.setSerbatoioAttuale(macchina3.getSerbatoioTotale());
        do {
            System.out.print(">");
            a = Tastiera.leggiUnaStringa();
            if ( a.equals("stato") ){
                macchina1.printStato();
                macchina2.printStato();
                macchina3.printStato();
            } else if ( a.equals("") ){
                System.out.println( macchina1.viaggia( rand.nextInt(100), distributore1 ) );
                System.out.println( macchina2.viaggia( rand.nextInt(100), distributore1 ) );
                System.out.println( macchina3.viaggia( rand.nextInt(100), distributore1 ) );
                if ( distributore1.getDepositoGasolio() < 300 ){
                    distributore1.rifornisci(0,1000);
                } else if ( distributore1.getDepositoBenzina() < 300 ){
                    distributore1.rifornisci(1000, 0);
                }
                if ( rand.nextInt(20) == 0 ){
                    distributore1.aggiorna( (double) rand.nextInt(200)/100, (double) rand.nextInt(200)/100 );
                }
            }
        } while ( !a.equals("exit") );
    }
}
