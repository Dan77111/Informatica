/**
 * La classe Punto ha gli attributi x e y di tipo double che rappresentano le coordinate 
 * di un punto sul piano cartesiano, tutti i metodi necessari a gestire queste due variabili 
 * ed un metodo toString che mostra a video le istanze della classe secondo il classico 
 * formato “(x;y)”. Questa classe espone inoltre un metodo statico che si chiamerà 
 * calcolaDistanza (Punto a, Punto b) e restituisce la lunghezza del segmento che unisce i 
 * due punti (formule a fine esercizio). Ovviamente si possono aggiungere tutti gli attributi 
 * e i metodi che si ritiene necessari.
 * 
 * @author Alessandro Ursomando
 * @version 1.0
 */
public class Punto
{
    // attributi
    private double x, y;

    /**
     *  Costruttore di base che colloca il punto nell'origine degli assi
     */
    public Punto() {
        this(0,0);
    }

    /**
     *  Costruttore proprio di tipo 1 (con valori)
     */
    public Punto(double x, double y) {
        setPunto(x,y);
    }
    
    /**
     *  Costruttore proprio di tipo 2 (con un'istanza di Punto)
     */
    public Punto(Punto p) {
        this(p.getAscissa(), p.getOrdinata());
    }   

    /**
     *  Metodo per l'impostazione dell'ascissa
     */
    public void setAscissa(double x) {
        this.x = x;
    }
    
    /**
     *  Metodo per l'impostazione dell'ordinata
     */
    public void setOrdinata(double y) {
        this.y = y;
    }
    
    /**
     *  Metodo per il recupero dell'ascissa
     */
    public double getAscissa() {
        return x;
    }
    
    /**
     *  Metodo per il recupero dell'ordinata
     */
    public double getOrdinata() {
        return y;
    }
    
    /**
     *  Metodo per impostare entrambe le coordinate
     */    
    public void setPunto(double x,double y)
    {
        setAscissa(x);
        setOrdinata(y);
    }
    
    /**
     *  Metodo per il confronto di questo punto con un altro punto p dato
     */    
    public boolean equals(Punto p)
    {
        return(getAscissa()==p.getAscissa() && getOrdinata()==p.getOrdinata());
    }
    
    /**
     *  Metodo statico che verifica l'uguaglianza di due punti dati
     */    
    public static boolean sonoUguali(Punto a,Punto b)
    {   
        return a.equals(b);
    }
    
    /**
     *  Metodo per la stampa a video
     */
    public String toString() {
        String s = String.format("(%5.2f; %5.2f)", getAscissa(), getOrdinata());
        return s;
    }
    
    /**
     *  Metodo per la copia dei valori da un punto dato a questo punto
     */
    public void copia (Punto p) {
        setAscissa( p.getAscissa() );
        setOrdinata( p.getOrdinata() );
    }
    
    /**
     *  Metodo di classe con il quale si stabilisce se fissato un certo punto p,
     *  questo si trovi al di sopra della retta indicata dagli altri due punti a e b
     *  (restituendo 1), al di sotto (restituendo -1) o se semplicemente p giace sulla
     *  retta che passa per a e b (restituendo 0).
     */
    static int segno (Punto a, Punto b, Punto p) {       
        // la retta dell'equazione passante per due punti
        //  (y2-y1)x + (x1-x2)y - x1y2 + x2y1 = 0
        double coeffA = b.getOrdinata()-a.getOrdinata();
        double coeffB = a.getAscissa()-b.getAscissa();
        double termineNoto = (-a.getAscissa()*b.getOrdinata())+(b.getAscissa()*a.getOrdinata());
       
        // sostituisco il punto P nella retta che passava per gli altri due punti
        double segno = (coeffA*p.getAscissa())+(coeffB*p.getOrdinata())+termineNoto;
        if (Math.abs(segno) < 0.000001)
            return 0;
        else if (segno > 0)
            return 1;
        else
            return -1;       
    }    
    
    /**
     * Metodo di classe con il quale si potrà calcolare la distanza tra due punti dati
     */
    static double calcolaDistanza (Punto a, Punto b) {
        double primoQuadrato = Math.pow((b.getAscissa() - a.getAscissa()),2);
        double secondoQuadrato = Math.pow((b.getOrdinata() - a.getOrdinata()),2);        
        return Math.sqrt( primoQuadrato + secondoQuadrato );
    }
}
