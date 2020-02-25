public class Rectangle extends Shape{
   public Rectangle(double x, double y){
      super(x,y);
   }
   public double area(){
      return getX()*getY();
   }
}