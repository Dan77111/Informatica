
/**
 *
 */
public class DataOrario extends Orario 
{
    //attributi
    private int giorno, mese, anno;
    private int[] giorniPerMese = {31,28,31,30,31,30,31,31,30,31,31,31};
    private int formato = 1;
    //costruttori
    public DataOrario(){
        this(0,0,0,1,1,1900);
    }
    public DataOrario(int giorno,int mese, int anno){
        this(0,0,0,giorno,mese,anno);
    }
    public DataOrario(int ore, int minuti, int secondi, int giorno, int mese, int anno){
        super(ore, minuti, secondi);
        setAnno(anno);
        setMese(mese);
        setGiorno(giorno);
    }
    //metodi
    public void setGiorno(int giorno){
        if ( giorno > 0 && giorno <= giorniPerMese[mese-1]){
            this.giorno = giorno;
        }
    }
    public void setMese(int mese){
        if ( mese > 0 && mese < 13 ){
            this.mese = mese;
        }
    }
    public void setAnno(int anno){
        if ( anno < 2100 && anno > 1900 ){
            this.anno = anno;
        }
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
    public void setFormato(int formato){
        if ( formato <= 4 && formato >= 1 ){
            this.formato = formato;
        }
    }
    public String getNomeGiorno(){
        return "PLACEHOLDER";
    }
    public String getNomeMese(){
        return "PLACEHOLDER";
    }
    public int getFormato(){
        return formato;
    }
    public String toString(){
        switch ( formato ){
            case 1:
                return String.format("%s %d %s %d", getNomeGiorno(), getGiorno(), getNomeMese(), getAnno());
            case 2:
                return String.format("%s %d %s %d (%02d:%02d)", getNomeGiorno(), getGiorno(), getNomeMese(), getAnno(), getOre(), getMinuti());
            case 3:
                return String.format("%02d/%02d/%d - %02d:%02d", getGiorno(), getMese(), getAnno(), getOre(), getMinuti());
            default:
                return String.format("%02d/%02d/%d - %02d:%02d:%02d", getGiorno(), getMese(), getAnno(), getOre(), getMinuti(), getSecondi());
        }
    }
    public void stampa(){
        System.out.println(this);
    }
}
