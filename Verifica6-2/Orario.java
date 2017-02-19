
/**
 * @author Daniele Dalla Rosa
 * @version 1.1
 */
public class Orario
{
    //attributi
    private int ore, minuti, secondi;
    //costruttori
    public Orario(){
        //costruttore vuoto, inizializza tutti i parametri a 0;
        this(0,0,0);
    }
    public Orario(Orario orario){
        //costruttore che crea una copia di un altro oggetto Orario;
        this(orario.getOre(), orario.getMinuti(), orario.getSecondi());
    }
    public Orario(int ore, int minuti){
        //costruttore che assegna ore e minuti, i secondi sono impostati a 0;
        //in caso di parametri non validi il valore di default è 0;
        this(ore, minuti, 0);
    }
    public Orario(int ore, int minuti, int secondi){
        //costruttore proprio, in caso di parametri non validi il valore di default è 0;
        setOrario(ore, minuti, secondi);
    }
    //metodi
    public String toString(){
        //restituisce l'orario in formato "hh : mm : ss";
        return String.format("%02d : %02d : %02d", getOre(), getMinuti(), getSecondi());
    }
    public boolean equals(Orario orario){
        //invoca il metodo confronta usando come parametri l'oggetto su cui è stato
        //invocato e l'oggetto passato come parametro;
        //se confronta restituisce 0 i due orari sono uguali, quindi equals deve
        //restituire true;
        return confronta(this, orario) == 0;
    }
    //metodi set
    public void setOre(int ore){
        //imposta le ore, se il valore passato non è valido l'attributo
        //rimane invariato;
        if ( ore < 24 && ore >= 0 ){
            this.ore = ore;
        }
    }
    public void setMinuti(int minuti){
        //imposta i minuti, se il valore passato non è valido l'attributo
        //rimane invariato;
        if ( minuti < 60 && minuti >= 0 ){
            this.minuti = minuti;
        }
    }
    public void setSecondi(int secondi){
        //imposta i secondi, se il valore passato non è valido l'attributo
        //rimane invariato;
        if ( secondi < 60 && secondi >= 0 ){
            this.secondi = secondi;
        }
    }
    public void setOrario(int ore, int minuti){
        //imposta i minuti e le ore; i secondi ed eventuali parametri non validi
        //rimangono invariati;
        setOre(ore);
        setMinuti(minuti);
    }
    public void setOrario(int ore, int minuti, int secondi){
        //imposta i minuti, le ore e i secondi; eventuali parametri non validi
        //rimangono invariati;
        setOrario(ore, minuti);
        setSecondi(secondi);
    }
    //metodi get
    public int getOre(){
        return ore;
    }
    public int getMinuti(){
        return minuti;
    }
    public int getSecondi(){
        return secondi;
    }
    //metodi "modifica"
    public void modificaDiUnSecondo(boolean aggiungi){
        //boolean aggiungi è "true" se deve essere aggiunto un secondo, se deve essere tolto è false
        if ( aggiungi == true ){
            if ( getSecondi() == 59 ){
                modificaDiUnMinuto(true);
                setSecondi( 0 );
            } else {
                setSecondi( getSecondi() + 1 );
            }
        } else {
            if ( getSecondi() == 0 ){
                modificaDiUnMinuto(false);
                setSecondi( 59 );
            } else {
                setSecondi( getSecondi() - 1 );
            }
        }
    }
    public void aggiungiSecondi(int secondi){
        if ( secondi > 0 ){
            for ( int i = 0; i < secondi; i ++ ){
                modificaDiUnSecondo(true);
            }
        } else {
            for ( int i = 0; i > secondi; i -- ){
                modificaDiUnSecondo(false);
            }
        }
    }
    public void modificaDiUnMinuto(boolean aggiungi){
        //vedi modificaDiUnSecondo
        if ( aggiungi == true ){
            if ( getMinuti() == 59 ){
                modificaDiUnOra(true);
                setMinuti( 0 );
            } else {
                setMinuti( getMinuti() + 1 );
            }
        } else {
            if ( getMinuti() == 0 ){
                modificaDiUnOra(false);
                setMinuti( 59 );
            } else {
                setMinuti(  getMinuti() - 1 );
            }
        }
    }
    public void aggiungiMinuti(int minuti){
        if ( minuti > 0 ){
            for ( int i = 0; i < minuti; i ++ ){
                modificaDiUnMinuto(true);
            }
        } else {
            for ( int i = 0; i > minuti; i -- ){
                modificaDiUnMinuto(false);
            }
        }
    }
    public void modificaDiUnOra(boolean aggiungi){
        //vedi modificaDiUnSecondo
        if ( aggiungi == true ){
            if ( getOre() == 23 ){
                setOre( 0 );
            } else {
                setOre( getOre() + 1 );
            }
        } else {
            if ( getOre() == 0 ){
                setOre( 23 );
            } else {
                setOre( getOre() - 1 );
            }
        }
    }
    public void aggiungiOre(int ore){
        if ( ore > 0 ){
            for ( int i = 0; i < ore; i ++ ){
                modificaDiUnOra(true);
            }
        } else {
            for ( int i = 0; i > ore; i -- ){
                modificaDiUnOra(false);
            }
        }
    }
    public void aggiungiOrario(Orario orario){
        //aggiunge un orario a quello dell'oggetto attuale, eseguendo tutti i
        //controlli che garantiscono che l'oggetto abbia sempre dei valori di
        //ore, minuti e secondi validi
        aggiungiSecondi(orario.getSecondi());
        aggiungiMinuti(orario.getMinuti());
        aggiungiOre(orario.getOre());
    }
    //metodi statici
    public static Orario somma(Orario orario1, Orario orario2){
        //restituisce la somma tra due orari senza modificarne nessuno dei due
        //istanziando un nuovo oggetto somma di classe Orario, inizializzandolo
        //come copia di orario1 e aggiungendogli orario2 con il metodo aggiungiOrario
        Orario somma = new Orario(orario1);
        somma.aggiungiOrario(orario2);
        return somma;
    }
    public static int confronta(Orario orario1, Orario orario2){
        //restituisce 0 se i due orari sono uguali, 1 se orario1 è maggiore di
        //orario2 e -1 se orario2 è maggiore di orario1;
        //i controlli vengono fatti partendo dal caso di uguaglianza e poi eseguendo
        //gli altri in ordine secondi->minuti->ore
        if ( orario1.getOre() == orario2.getOre() ){
            if ( orario1.getMinuti() == orario2.getMinuti() ){
                if ( orario1.getSecondi() == orario2.getSecondi() ){
                    return 0;
                } else if ( orario1.getSecondi() > orario2.getSecondi() ){
                    return 1;
                } else {
                    return -1;
                }
            } else if ( orario1.getMinuti() > orario2.getMinuti() ){
                return 1;
            } else {
                return -1;
            }
        } else if ( orario1.getOre() > orario2.getOre() ){
            return 1;
        } else {
            return -1;
        }
    }
}
