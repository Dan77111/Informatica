
/**
 * 
 */
public class Frazione
{
    private int num;
    private int den = 1;
    public Frazione(){
        this(0,1);
    }
    public Frazione( int num, int den ){
        setNumeratore(num);
        setDenominatore(den);
    }
    public Frazione( Frazione frazione ){
        this(frazione.getNumeratore(), frazione.getDenominatore());
    }
    private void semplifica(){
       int mcd = mcd(num, den);
       num /= mcd;
       den /= mcd;
    }
    private int mcd(int a, int b){
        if (b == 0){
            return a;
        } else {
            return mcd(b, a % b); 
        }
    }
    public void setNumeratore(int num){
        this.num = num;
        if ( den != 1 ){
            semplifica();
        }
    }
    public void setDenominatore(int den){
        if ( den != 0 ){
            this.den = den;
        } else {
            return;
        }
        semplifica();
    }
    public int getNumeratore(){
        return num;
    }
    public int getDenominatore(){
        return den;
    }
    public void setFrazione(int num, int den){
        setNumeratore(num);
        setDenominatore(den);
    }
    public void setToOpposto(){
        num *= -1;
    }
    
    public Frazione getOpposto(){
        setToOpposto();
        Frazione opposto = new Frazione(this);
        setToOpposto();
        return opposto;
    }
    
    public void aggiungi(Frazione f2){
        if ( den == f2.getDenominatore() ){
            num += f2.getNumeratore();
        } else {
            num = ( num * f2.getDenominatore() ) + ( f2.getNumeratore() * den );
            den *= f2.den;
        }
        semplifica();
    }
    
    public Frazione somma(Frazione f2){
        if ( den == f2.getDenominatore() ){
            num += f2.getNumeratore();
        } else {
            num = ( num * f2.getDenominatore() ) + ( f2.getNumeratore() * den );
            den *= f2.den;
        }
        semplifica();
        return this;
    }
    public static Frazione sommaStatica(Frazione f1, Frazione f2){
        Frazione somma = new Frazione();
        if ( f1.getDenominatore() == f2.getDenominatore() ){
            somma.setNumeratore(f1.getNumeratore() + f2.getNumeratore());
            somma.setDenominatore(f1.getDenominatore());
        } else {
            somma.setNumeratore((f1.getNumeratore() * f2.getDenominatore()) + 
                                (f2.getNumeratore() * f1.getDenominatore()));
            somma.setDenominatore(f1.getDenominatore() * f2.getDenominatore());
        }
        return somma;
    }
    
    public void sottrai(Frazione f2){
        if ( den == f2.getDenominatore() ){
            num -= f2.getNumeratore();
        } else {
            num = ( num * f2.getDenominatore() ) - ( f2.getNumeratore() * den );
            den *= f2.getDenominatore();
        }
        semplifica();
    }
    
    public Frazione differenza(Frazione f2){
        if ( den == f2.getDenominatore() ){
            num -= f2.getNumeratore();
        } else {
            num = ( num * f2.getDenominatore() ) - ( f2.getNumeratore() * den );
            den *= f2.den;
        }
        semplifica();
        return this;
    }
    public static Frazione differenzaStatica(Frazione f1, Frazione f2){
        Frazione somma = new Frazione();
        if ( f1.getDenominatore() == f2.getDenominatore() ){
            somma.setNumeratore(f1.getNumeratore() - f2.getNumeratore());
        } else {
            somma.setNumeratore((f1.getNumeratore() * f2.getDenominatore()) -
                                (f2.getNumeratore() * f1.getDenominatore()));
            somma.setDenominatore(f1.getDenominatore() * f2.getDenominatore());
        }
        return somma;
    }
    
    public String toString(){
        return String.format("%1$d / %2$d", num, den);
    }
    public boolean equals(Frazione f2){
        if ( num == f2.getNumeratore() && den == f2.getDenominatore() ){
            return true;
        } else {
            return false;
        }
    }
}
