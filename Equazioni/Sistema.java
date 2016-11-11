
/**
 * 
 */
public class Sistema
{
    private int x;
    private int y;
    private int[][] equazione = new int[2][3];
    public Sistema(int x1, int y1, int costante1, int x2, int y2, int costante2){
        equazione[0][0] = x1;
        equazione[0][1] = y1;
        equazione[0][2] = costante1;
        equazione[1][0] = x2;
        equazione[1][1] = y2;
        equazione[1][2] = costante2;
    }
    public void esegui(){
        int delta, deltax, deltay;
        delta = (equazione[0][0]*equazione[1][1])-(equazione[0][1]*equazione[1][0]);
        deltax = (equazione[0][2]*equazione[1][1])-(equazione[1][2]*equazione[0][1]);
        deltay = (equazione[0][0]*equazione[1][2])-(equazione[1][0]*equazione[0][2]);
        x = deltax/delta;
        y = deltay/delta;
    }
    public int getX(){
        return(x);
    }
    public int getY(){
        return(y);
    }
    public void setEquazione(int x, int i, int j){
        equazione[i][j] = x;
    }
}
