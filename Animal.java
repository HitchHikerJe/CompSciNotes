public class Animal{
   private int legs;
   private String color;
   private boolean air;
   public Animal(int l, String c, boolean a){
      legs=l;
      color=c;
      air=a;
   }
   public int getLegs(){
      return legs;
   }
   public String getColor(){
      return color;
   }
   public boolean getAir(){
      return air;
   }
   public void setLegs(int l){
      legs=l;
   }
   public void setColor(String c){
      color=c;
   }
   public void setAir(boolean a){
      air=a;
   }
   public String toString(){
      return "Legs: "+legs+"\tColor: "+color+"\tBreathes air: "+air+"\n";
   }
}