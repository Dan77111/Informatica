/**

 */

public class Orario
{
    // Attributi
    private int ore = 0;            // l'ora: 'orario viene mantenuto SEMPRE in formato 24 ore
    private int minuti = 0;         // i minuti
    private int secondi = 0;        // i secondi
    

    /**
     * Costruttore di default.
     * Inizializza l'oggetto con valori di defalut
     */
    public Orario()  {
        this(0,0,0);
    }
    
    /**
     * Costruttore con argomenti 
     * L'utente userà questo costruttore se vuole inizializzare direttamente
     * ad un orario passando le ore e i minuti
     */
    public Orario(int h, int m) {
        this(h,m,0);
    }    
    
    /**
     * Costruttore con argomenti 
     * L'utente userà questo costruttore se vuole inizializzare direttamente
     * ad un orario passando le ore, i minuti e i secondi
     */
    public Orario(int h, int m, int s) {
        if ( orarioValido(h,m,s) ){
            setOre(h);
            setMinuti(m);
            setSecondi(s);
        }
    }
    
    /**
     * Costruttore con argomenti 
     * L'utente user� questo costruttore se vuole inizializzare direttamente
     * ad un orario passando un oggetto di tipo Orario
     */
    public Orario(Orario o) {
        this(o.getOre(), o.getMinuti(), o.getSecondi());
    }
    
    private boolean orarioValido(int h, int m, int s){
        return ( (h>=0) && (h<=23) && (m>=0) && (m<=59) && (s>=0) && (s<=59) );
    }
    
    /**
     * Con questo metodo setOrario l'utente modifica l'orario stesso.
     */
    public void setOrario(int h, int m) {
        setOre(h);
        setMinuti(m);        
    }

    /**
     * Con questo metodo setOrario l'utente modifica l'orario stesso.
     */
    public void setOrario(int h, int m, int s) {
        setOre(h);
        setMinuti(m);
        setSecondi(s);
    }

    /**
     *  Con questo metodo SetOra l'utente imposta l'ora di un orario 
     */
    public void setOre(int h) {
        if ( (h>=0) && (h<=23) ) {
            ore = h;
        }            
    }    
    
    /**
     *  Con il metodo setMinuti l'utente imposta i minuti
     */
    public void setMinuti(int m) {
        if ( (m>=0) && (m<=59) ) {
            minuti = m;
        }
    }
    
    /**
     *  Con il metodo setMinuti l'utente imposta i minuti
     */
    public void setSecondi(int s) {
        if ( (s>=0) && (s<=59) ) {
            secondi = s;
        }
    }    
   
    /**
     *  Metodo che stampa a video l'orario in modo tale che le 
     *  componenti minuti e secondi se ad una sola cifra vengano 
     *  presentati con uno zero non significativo davanti. 
     *  Per esempio: 13:04:08
     */
    public String toString () {
        String daRestituire;
        daRestituire = ore + ":";
        if (minuti < 10)
            daRestituire = daRestituire+"0"+minuti;
        else
            daRestituire = daRestituire+minuti;
        if (secondi < 10)
            daRestituire = daRestituire+":0"+secondi;
        else
            daRestituire = daRestituire+":"+secondi;
        return daRestituire;
    }
    
    /**
     *  Con questo metodo restituisco l'attributo indicato
     */
    public int getOre(){
        return ore;
    }
    
    /**
     *  Con questo metodo restituisco l'attributo indicato
     */
    public int getMinuti() {
        return minuti;
    }

    /**
     *  Con questo metodo restituisco l'attributo indicato
     */
    public int getSecondi() {
        return secondi;
    }

    /**
     *  Con questo metodo verifico l'uguaglianza tra il presente oggetto
     *  e l'oggetto passato
     */
    public boolean equals(Orario o) {
        if ( (o.getOre()==getOre()) && (o.getMinuti()==getMinuti()) && (o.getSecondi()==getSecondi()) ) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * L'invocazione di questo metodo aggiunge un secondo all'orario 
     */
    public void aggiungiUnSecondo() {
        if (getSecondi()==59) {
            setSecondi(0);
            aggiungiUnMinuto();
        } else {
            setSecondi(getSecondi()+1);
        }
    }
    
    /**
     * L'invocazione di questo metodo aggiunge la quantit� di secondi
     * specificata all'orario 
     */
    public void aggiungiSecondi(int tot) {
        for (int i=0; i<tot; i++) {
            aggiungiUnSecondo();
        }
    }
    
    /**
     * L'invocazione di questo metodo aggiunge un minuto all'orario 
     */
    public void aggiungiUnMinuto() {
        if (getMinuti()==59) {
            setMinuti(0);
            aggiungiUnOra();
        } else {
            setMinuti(getMinuti()+1);
        }
    }
    
    /**
     * L'invocazione di questo metodo aggiunge la quantit� di minuti
     * specificata all'orario 
     */
    public void aggiungiMinuti(int tot) {
        for (int i=0; i<tot; i++) {
            aggiungiUnMinuto();
        }
    }
    
    /**
     * L'invocazione di questo metodo aggiunge un'ora all'orario 
     */
    public void aggiungiUnOra() {
        if (getOre()==23) {
            setOre(0);
        } else {
            setOre(getOre()+1);
        }
    }
    
    /**
     * L'invocazione di questo metodo aggiunge la quantit� di ore
     * specificata all'orario 
     */
    public void aggiungiOre(int tot) {
        for (int i=0; i<tot; i++) {
            aggiungiUnOra();
        }
    }
    
    /**
     * L'invocazione di questo metodo somma all'orario presente quello passato
     * come parametro
     */
    public void aggiungiOrario(Orario o) {
        aggiungiSecondi(o.getSecondi());
        aggiungiMinuti(o.getMinuti());
        aggiungiOre(o.getOre());
    }
    
    /**
     * Questo metodo statico esegue la somma di due orari passati
     * come parametro
     */
    public static Orario somma(Orario x, Orario y) {
        Orario tmp = new Orario(x);
        tmp.aggiungiOrario(y);
        return tmp;
    }

    /**
     * Questo metodo statico confronta i due orari x e y passati
     * come parametri e restituisce -1 se x<y, restituisce 0 se
     * sono uguali, restituisce 1 se x>y
     */
    public static int confronta(Orario x, Orario y) {
        if (x.equals(y)) {
            return 0;
        }
        if ( (x.getOre()<y.getOre()) || 
             ( (x.getOre()==y.getOre()) && (x.getMinuti()<y.getMinuti()) ) ||
             ( (x.getOre()==y.getOre()) && (x.getMinuti()==y.getMinuti()) && (x.getSecondi()<y.getSecondi()) )
             ) {
            return -1;        
        } else {
            return 1;
        }        
    }
    
    /**
     * Questo metodo statico restituisce la differenza (in
     * secondi) tra i due orari passati.
     */
    public static int differenza(Orario x, Orario y) {
        // metto le due variabili in ordine crescente
        if (Orario.confronta(x,y)>0) {
            Orario temp = x;
            x = y;
            y = temp;            
        }       
        
        return ( ((y.getOre()-x.getOre())*60*60) + ((y.getMinuti()-x.getMinuti())*60) + (y.getSecondi()-x.getSecondi()) );    
    }    
    
}

