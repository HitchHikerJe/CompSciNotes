public class Mammal extends Animal{
   private String furColor;
   public Mammal(int l, int e, boolean w, String f){
      super(l,e,w);
      furColor=f;
   }
   public String getFurColor(){
      return furColor;
   }
   @Override
   public String toString(){
      return super.toString()+"Fur Color: "+furColor+"\n";
   }
   public static void main(String[] args){
      Animal turtle = new Animal(4,8,true);
      System.out.println(turtle.toString());
      Mammal bear = new Mammal(4,74,true,"violet");
      System.out.println(bear.toString());
      Animal cow = new Mammal(0,2,false,"red");
      System.out.println(cow.toString());
      //Mammal platypus = new Animal(2,7,false);
   }
}