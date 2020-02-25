public class Animal{
   private int eyes, legs;
   private boolean wings;
   public Animal(int l, int e, boolean w){
      legs=l;
      eyes=e;
      wings=w;
   }
   public int getLegs(){
      return legs;
   }
   public int getEyes(){
      return eyes;
   }
   public boolean getWings(){
      return wings;
   }
   public String toString(){
      return "Legs: "+legs+"\nEyes: "+eyes+"\nWings: "+wings+"\n";
   }
}