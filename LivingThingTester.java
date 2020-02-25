public class LivingThingTester{
   public static void main(String[] args){
      NormalHuman a = new NormalHuman(5);
      System.out.println(a.speak());
      System.out.println(a.birthday());
      Dog b = new Dog(42);
      System.out.println(b.speak());
      System.out.println(b.birthday());
      BenjaminButton c = new BenjaminButton(30);
      System.out.println(c.speak());
      System.out.println(c.birthday());
   }
}