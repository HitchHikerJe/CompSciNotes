public class HumanTester{
   public static void main(String[] args){
      Human a = new Human("Robert",42);
      System.out.println(a.toString());
      Human b = new Student("Amy",18,78);
      System.out.println(b.toString());
      Human c = new Senior("Mitch",17,6,"College");
      System.out.println(c.toString());
      Student d = new Student("Kim",15,3.5);
      System.out.println(d.toString());
      Student e = new Senior("George",18,2.75,"McDonalds");
      System.out.println(e.toString());
      Senior f = new Senior("Zuri",17,5,"College");
      System.out.println(f.toString());
   }
}