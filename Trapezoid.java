public class Trapezoid implements TwoDShape{
   private double b1, b2, h, side;
   public Trapezoid(double base1, double base2, double height, double s){
      b1=base1;
      b2=base2;
      h=height;
      side=s;
   }
   public double perimeter(){
      return b1+b2+2*side;
   }
   public double area(){
      return .5*(b1+b2)*h;
   }
}