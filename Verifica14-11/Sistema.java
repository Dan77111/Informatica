import java.util.Random;
/**
 * 
 */
public class Sistema
{
    private int x1, x2, delta, max = 0, altezza, base, lato2, lato3, area, perimetro;
    private String tipo;
    private int[][] matrice;
    Random rand = new Random();
    public Sistema(int righe, int colonne, int base, int altezza, int lato2, int lato3, String  tipo){
        matrice = new int[righe][colonne];
        for ( int i = 0; i < righe; i ++ ){
            for ( int j = 0; j < colonne; j ++ ){
                matrice[i][j] = rand.nextInt(100);
            }
        }
        for ( int i = 0; i < righe; i ++ ){
            for ( int j = 0; j < colonne; j ++ ){
                if ( max < matrice[i][j] ){
                    max = matrice[i][j];
                }
            }
        }
        this.base = base;
        this.altezza = altezza;
        this.lato2 = lato2;
        this.lato3 = lato3;
        this.tipo = tipo;
    }
    public Sistema(int righe, int colonne){
        this(righe, colonne, 0, 0, 0, 0, "");
    }
    public Sistema(int base, int altezza, int lato2, int lato3, String  tipo ){
        this(0, 0, base, altezza, lato2, lato3, tipo);
    }
    public void eseguiSistema(){
        int deltaX2, deltaX1;
        deltaX1 = ( matrice[0][2]*matrice[1][1] ) - ( matrice[1][2]*matrice[0][1] );
        deltaX2 = ( matrice[0][0]*matrice[1][2] ) - ( matrice[1][0]*matrice[0][2] );
        delta = ( matrice[0][0]*matrice[1][1] ) - ( matrice[1][0]*matrice[0][1] );
        x1 = deltaX1/delta;
        x2 = deltaX2/delta;
    }
    public void eseguiTriangolo(){
        switch(tipo){
            case "area":
                area = base*altezza/2;
                break;
            case "perimetro":
                perimetro = base + lato2 + lato3;
                break;
        }
    }
    public int getX1(){
        return(x1);
    }
    public int getX2(){
        return(x2);
    }
    public int getMax(){
        return(max);
    }
    public int getDelta(){
        return(delta);
    }
    public int getPerimetro(){
        return(perimetro);
    }
    public int getArea(){
        return(area);
    }
}
