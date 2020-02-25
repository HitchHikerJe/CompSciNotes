public class Marsupial extends Mammal{
   private int pouchSize;
   public Marsupial(int l, int e, boolean w, String f, int p){
      super(l,e,w,f);
      pouchSize=p;
   }
   @Override
   public String toString(){
      return super.toString()+"PouchSize: "+pouchSize+"\n";
   }
   public static void main(String[] args){
      Marsupial koala = new Marsupial(8,24,true,"tangerine",15);
      System.out.println(koala.toString());
      System.out.println(koala.getLegs());
   }
}