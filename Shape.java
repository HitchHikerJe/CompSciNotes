public abstract class Shape{
   private double x,y;
   public Shape(double xn, double yn){
      x=xn;
      y=yn;
   }
   public double getX(){
      return x;
   }
   public double getY(){
      return y;
   }
   public abstract double area();
}