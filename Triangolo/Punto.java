/*
 *
 */
public class Punto {
    private double x;
    private double y;

    public Punto() {
        this(0.0, 0.0);
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto(Punto p) {
        this(p.getAscissa(), p.getOrdinata());
    }

    public void setAscissa(double x) {
        this.x = x;
    }

    public void setOrdinata(double y) {
        this.y = y;
    }

    public double getAscissa() {
        return this.x;
    }

    public double getOrdinata() {
        return this.y;
    }

    public String toString() {
        String s = String.format("(%5.2f; %5.2f)", this.x, this.y);
        return s;
    }

    public void copia(Punto p) {
        this.setAscissa(p.getAscissa());
        this.setOrdinata(p.getOrdinata());
    }

    public static int segno(Punto a, Punto b, Punto p) {
        double coeffA = b.getOrdinata() - a.getOrdinata();
        double coeffB = a.getAscissa() - b.getAscissa();
        double termineNoto = (- a.getAscissa()) * b.getOrdinata() + b.getAscissa() * a.getOrdinata();
        double segno = coeffA * p.getAscissa() + coeffB * p.getOrdinata() + termineNoto;
        if (Math.abs(segno) < 1.0E-6) {
            return 0;
        }
        if (segno > 0.0) {
            return 1;
        }
        return -1;
    }
    public static double calcolaDistanza(Punto a, Punto b) {
        double primoQuadrato = Math.pow(b.getAscissa() - a.getAscissa(), 2.0);
        double secondoQuadrato = Math.pow(b.getOrdinata() - a.getOrdinata(), 2.0);
        return Math.sqrt(primoQuadrato + secondoQuadrato);
    }
    public boolean equals(Punto b){
        return getOrdinata() == b.getOrdinata() && getAscissa() == b.getAscissa();
    }
}
