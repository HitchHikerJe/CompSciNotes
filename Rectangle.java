public class Rectangle{
   private double length,width;
   public Rectangle(double len, double wid){
      length=len;
      width=wid;
   }
   public double getLength(){
      return length;
   }
   public double getWidth(){
      return width;
   }
   public void setLength(double l){
      length=l;
   }
   public void setWidth(double w){
      width=w;
   }
   public String toString(){
      return ""+length+" "+width;
   }
   public static void main(String[] args){
      Rectangle rec = new  Rectangle(3,4);
      System.out.println(rec.toString());
      rec.setLength(2);
      System.out.println("The length has been changed to "+rec.getLength());
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