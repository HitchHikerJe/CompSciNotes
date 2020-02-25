public class Triangle extends Shape{
   public Triangle(double b, double h){
      super(b,h);
   }
   public double area(){
      return .5*getX()*getY();
   }
}