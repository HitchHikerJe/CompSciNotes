public class CrazyEightCard extends Card{
   public CrazyEightCard(int f, String s){
      super(f,s);
   }
   public int getValue(){
      if(getFace()==8){
         return 0;
      }
      return getFace();
   }
   public static void main(String[] args){
      CrazyEightCard card1 = new CrazyEightCard(8,"clubs");
      System.out.print(card1);
   }
}