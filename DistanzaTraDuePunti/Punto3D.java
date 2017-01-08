/**
 * 
 */
public class Punto3D extends Punto
{
    protected int z;
    public Punto3D(int x, int y, int z){
        super(x, y);
        setZ(z);
    }
    public void setZ(int z){
        this.z = z;
    }
    public int getZ(){
        return z;
    }
    public double distanza(Punto3D punto2){
        return  distanza = Math.sqrt( ( ( super.x - punto2.x ) * ( super.x - punto2.x ) ) + 
                           ( ( super.y - punto2.y ) * ( super.y - punto2.y ) )  + 
                           ( ( z - punto2.z ) * ( z - punto2.z ) ) );
    }
}
