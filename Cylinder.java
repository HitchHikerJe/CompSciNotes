public class Cylinder extends Shape{
   public Cylinder(double r, double h){
      super(r,h);
   }
   public double area(){      //Surface Area
      return Math.PI*Math.pow(getX(),2)*getY();
   }
}