
/**
 * 
 */
public class Semaforo
{
    private int stato, secondiTrascorsi;
    public Semaforo(){
        stato = 0;
        secondiTrascorsi = 0;
    }
    public String toString(){
        switch ( stato ){
            case 0:
                return "VERDE";
            case 1:
                return "GIALLO";
            default:
                return "ROSSO";
        }
    }
    public void passatoUnSecondo(){
        secondiTrascorsi ++;
        if ( secondiTrascorsi == 60 && ( stato == 0 || stato == 2 ) ){
            avanzaStato();
            secondiTrascorsi = 0;
        } else if ( secondiTrascorsi == 6 && stato == 1 ){
            avanzaStato();
            secondiTrascorsi = 0;
        }
    }
    public void avanzaStato(){
        if ( stato == 2 ){
            stato = 0;
        } else {
            stato ++;
        }
    }
}
