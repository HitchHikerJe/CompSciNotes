public class Pizza{
   private String type;
   private int size;
   private boolean burnt;
   public Pizza(String t, int s, boolean b){
      type=t;
      size=s;
      burnt=b;
   }
   public String getType(){
      return type;
   }
   public int getSize(){
      return size;
   }
   public boolean getBurnt(){
      return burnt;
   }
   public void setType(String s){
      type=s;
   }
   public void setSize(int i){
      size=i;
   }
   public void setBurnt(boolean b){
      burnt=b;
   }
   public String toString(){
      String burn;
      if(burnt){
         burn="yes";
      }
      else{
         burn="no";
      }
      return "Size: "+size+"in\nType: "+type+" pizza\nBurnt: "+burn+"\n";
   }
}