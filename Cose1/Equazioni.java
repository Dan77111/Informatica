import java.util.*;
/**
 *
 */
public class Equazioni
{
  private int a;
  private int b;
  private int c;
  private int delta;
  private double x1;
  private double x2;
  public Equazioni(int a, int b, int c){
    setTutto(a,b,c);
  }
  public void delta(){
    delta = (b ^ 2) - (4 * a * c);
  }
  public void radici(){
    delta();
    x1 = ( - b + Math.sqrt( delta ) ) / 2 * a;
    x2 = ( - b - Math.sqrt( delta ) ) / 2 * a;
  }
  public void setA(int a){
    this.a = a;
    radici();
  }
  public void setB(int b){
    this.b = b;
    radici();
  }
  public void setC(int c){
    this.c = c;
    radici();
  }
  public void setTutto(int a, int b, int c){
    setA(a);
    setB(b);
    setC(c);
  }
  public String getStatoRadici(){
    if ( delta < 0 ){
      return "Le radici sono immaginarie";
    } else if ( delta == 0 ){
      return "Le radici sono coincidenti";
    } else {
      return "Le radici sono reali e distinte";
    }
  }
  public double getX1(){
    return x1;
  }
  public double getX2(){
    return x2;
  }
}
