import java.util.*;
import java.time.*;
/**
 * 
 */
public class Data
{
    private int giorno, mese, anno;
    private int[] mesi = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public Data(int gg, int mm, int aa){
        setAnno(aa);
        setMese(mm);
        setGiorno(gg);
    }
    public void setAnno(int anno){
        this.anno = anno;
    }
    public void setMese(int mese){
        if ( mese < 13 && mese > 0 ){
            this.mese = mese;
        } else {
            System.out.println("Errore! Il mese inserito non è valido");
        }
    }
    public void setGiorno(int giorno){
        if ( mese == 2 ){
            if ( anno%4 == 0 ){
                if ( giorno > 0 && giorno <= 29 ){
                    this.giorno = giorno;
                } else {
                    System.out.println("Errore! Il giorno inserito non è valido");
                }
            } else {
                if ( giorno > 0 && giorno <= 28 ){
                    this.giorno = giorno;
                } else {
                    System.out.println("Errore! Il giorno inserito non è valido");
                }
            }
        } else if ( mese == 4 || mese == 6 || mese == 9 || mese == 11 ){
            if ( giorno > 0 && giorno <= 30 ){
                this.giorno = giorno;
            } else {
                System.out.println("Errore! Il giorno inserito non è valido");
            }
        } else {
            if ( giorno > 0 && giorno <= 31 ){
                this.giorno = giorno;
            } else {
                System.out.println("Errore! Il giorno inserito non è valido");
            }
        }
    }
    public static LocalDate getCurrentDate(){
        Date input = new Date();
        LocalDate date = input.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return date;
    }
    public int getGiorno(){
        return giorno;
    }
    public int getMese(){
        return mese;
    }
    public int getAnno(){
        return anno;
    }
}
