public class Dog implements LivingThing{
   private int age;
   public Dog(int a){
      age=a;
   }
   public String speak(){
      return "woof";
   }
   public int birthday(){
      return age+7;
   }
}