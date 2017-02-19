package contribuente.aziende;
import contribuente.Contribuente;

/**
 *
 */
public class Azienda extends Contribuente
{
    private char[] validChars = {'1','2','3','4','5','6','7','8','9','0'};
    private String partitaIva;
    public Azienda( double entrate, double uscite, String partitaIva){
        super(entrate, uscite);
        setPartitaIva(partitaIva);
    }
    private void setPartitaIva(String partitaIva){
        boolean isValid;
        if ( partitaIva.length() != 11 ){
            return;
        } else {
            for ( int i = 0; i < 11; i ++ ){
                isValid = false;
                for ( int j = 0; j < validChars.length; j ++ ){
                    if ( partitaIva.charAt(i) == validChars[j] ){ 
                        isValid = true;
                        break;
                    }
                }
                if ( !isValid ){
                    return;
                }
            }
        }
        this.partitaIva = partitaIva;
    }
    public String id(){
        return partitaIva;
    }
    protected double fattoreDiSconto(){
        return 0.9;
    }
    protected double aliquota(){
        return 0.4;
    }
}
