public class Human{
   private String name;
   private int age;
   public Human(String n, int a){
      name=n;
      age=a;
   }
   public String getName(){
      return name;
   }
   public int getAge(){
      return age;
   }
   public void setName(String n){
      name=n;
   }
   public void setAge(int a){
      age=a;
   }
   public String toString(){
      return "Name: "+name+"\nAge: "+age+"\n";
   }
}