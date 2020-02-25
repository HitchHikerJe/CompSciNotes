public class WarCard extends Card{
   public WarCard(int f, String s){
      super(f,s);
   }
   public int getValue(){
      if(getFace()==1){
         return 14;
      }
      return getFace();
   }
   public static void main(String[] args){
      WarCard card2 = new WarCard(8,"clubs");
      System.out.print(card2);
   }
}