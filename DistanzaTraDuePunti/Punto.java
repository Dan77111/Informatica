/**
 * 
 */
public class Punto
{
   protected int x, y;
   protected double distanza;
   public Punto(int x, int y){
       setX(x);
       setY(y);
   }
   public void setX(int x){
       this.x = x;
   }
   public void setY(int y){
       this.y = y;
   }
   public int getX(){
       return x;
   }
   public int getY(){
       return y;
   }
   public double getDistanza(){
       return distanza;
   }
}
