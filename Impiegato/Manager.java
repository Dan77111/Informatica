import java.util.Random;
/**
 *
 */
public class Manager extends Impiegato
{
    public Manager(String nome, int stipendio, Data data){
        super(nome, stipendio, data);
        super.stipendio += premioProduzione();
    }
    public void premioProduzione(){
        LocalDate dataAttuale = super.data.getCurrentDate();
        int nAnni = dataAttuale.getYear() - super.data.getAnno();
        Random rand = new Random();
        int prPr = 0;
        int temp = 0;
        for ( int i = 0; i < nAnni; i ++ ){
            temp = 300 + ( prPr / 100 * 7 );
            if ( rand.nextInt(2) == 1 ){
                temp = temp * 2;
            } else {
                temp = temp * 4;
            }
            prPr += temp;
        }
    }
}
