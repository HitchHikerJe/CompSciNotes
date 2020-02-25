public class Duck{
   private String name, color;
   private int earNum;
   private char letter;
   private boolean hair;
   public Duck(String n, String c, int ear, char alpha, boolean h){
      name=n;
      color=c;
      earNum=ear;
      letter=alpha;
      hair=h;
   }
   public String getName(){
      return name;
   }
   public String getColor(){
      return color;
   }
   public int getEars(){
      return earNum;
   }
   public char getLetter(){
      return letter;
   }
   public boolean getHair(){
      return hair;
   }
   public String toString(){
      return ""+name+" "+color+" "+earNum+" "+letter+" "+hair;
   }
   public void setName(String n){
      name=n;
   }
   public void setColor(String c){
      color=c;
   }
   public void setEars(int ear){
      earNum=ear;
   }
   public void setLetter(char l){
      letter=l;
   }
   public void setHair(boolean h){
      hair=h;
   }
   public static void main(String[] args){
      Duck mittens = new Duck("cat", "black", 2, 'C', false);
      Duck walley = new Duck("walrus", "brown", 0, 'W', false);
      Duck jerry = new Duck("disappointment", "violet", 42, 'J', false);
      dP(mittens.toString(),50);
      delay(1000);
      dP(walley.toString(),50);
      delay(1000);
      dP(jerry.toString(),50);
      mittens.setHair(true);
      walley.setEars(3);
      jerry.setLetter('D');
      delay(500);
      System.out.println(mittens.getHair());
      delay(500);
      System.out.println(walley.getLetter());
      delay(500);
      System.out.print(jerry.getLetter());
   }
   public static void delay(int x){
      try{
         Thread.sleep(x);
      }
      catch(Exception e){}
   }
   public static void dP(String s, int x){
      for(int i = 0; i < s.length(); i++){
         System.out.print(s.charAt(i));
         delay(x);
      }
      System.out.println();
   }
}