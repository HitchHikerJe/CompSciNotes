public class BenjaminButton implements LivingThing{
   private int age;
   public BenjaminButton(int a){
      age=a;
   }
   public String speak(){
      return "I'm Benjamin Button";
   }
   public int birthday(){
      return age+10;
   }
}