package contribuente.persone;
import contribuente.Contribuente;

/**
 *
 */

public class PersonaFisica extends Contribuente
{
    private String codiceFiscale, nome, cognome;
    private char[] validLetters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    private char[] validNumbers = {'1','2','3','4','5','6','7','8','9','0'};

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
                if ( ( i >= 0 && i < 6 ) || i == 8 || i == 11 || i == 15 ){
                    for ( int j = 0; j < validLetters.length; j ++ ){
                        if ( codiceFiscale.charAt(i) == validLetters[j] ){
                            isValid = true;
                            break;
                        }
                    }
                } else {
                  for ( int j = 0; j < validNumbers.length; j ++ ){
                      if ( codiceFiscale.charAt(i) == validNumbers[j] ){
                          isValid = true;
                          break;
                      }
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
