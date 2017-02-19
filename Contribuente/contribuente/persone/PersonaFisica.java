package contribuente.persone;
import contribuente.Contribuente;

/**
 *
 */
public class PersonaFisica extends Contribuente
{
    private String codiceFiscale, nome, cognome;
    private char[] validChars = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','1','2','3','4','5','6','7','8','9','0'};
    public PersonaFisica( double entrate, double uscite, String codiceFiscale, String nome, String cognome ){
        super(entrate, uscite);
        setCodiceFiscale(codiceFiscale);
        this.nome = nome;
        this.cognome = cognome;
    }
    private void setCodiceFiscale(String codiceFiscale){
        boolean isValid;
        if ( codiceFiscale.length() != 16 ){
            return;
        } else {
            for ( int i = 0; i < 16; i ++ ){
                isValid = false;
                for ( int j = 0; j < validChars.length; j ++ ){
                    if ( codiceFiscale.charAt(i) == validChars[j] ){ 
                        isValid = true;
                        break;
                    }
                }
                if ( !isValid ){
                    return;
                }
            }
        }
        this.codiceFiscale = codiceFiscale;
    }
    public String id(){
        return codiceFiscale;
    }
    public String getNome(){
        return nome;
    }
    public String getCognome(){
        return cognome;
    }
    protected double fattoreDiSconto(){
        return 0.8;
    }
    protected double aliquota(){
        if ( imponibile() <= 5000 ){
            return 0;
        } else {
            return 0.3;
        }
    }
}
