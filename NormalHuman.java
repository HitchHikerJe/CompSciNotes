public class NormalHuman implements LivingThing{
   private int age;
   public NormalHuman(int a){
      age=a;
   }
   public String speak(){
      return "sup";
   }
   public int birthday(){
      return age+1;
   }
}