public class ShapeTester{
   public static void main(String[] args){
      Rectangle rectangle = new Rectangle(3,4);
      System.out.println("Rectangle area: "+rectangle.area());
      Triangle triangle = new Triangle(5,8);
      System.out.println("Triangle area: "+triangle.area());
      Cylinder cylinder = new Cylinder(3,7);
      System.out.println("Cylinder surface area: "+cylinder.area());
   }
}