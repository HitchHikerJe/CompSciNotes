public class InsertionSort{
   public static void main(String[] args){
      int[] stuff = new int[10];
      for(int i=0; i<stuff.length; i++){
         stuff[i]=(int)(Math.random()*10);
      }
      System.out.print("Original array: ");
      for(int i=0; i<stuff.length; i++){
         System.out.print(stuff[i]+" ");
      }
      for(int i=1; i<stuff.length; i++){
         for(int j=i; j>0; j--){
            if(stuff[j-1]>stuff[j]){
               int tem=stuff[j];
               stuff[j]=stuff[j-1];
               stuff[j-1]=tem;
            }
         }
      }
      System.out.print("\nSorted: ");
      for(int i=0; i<stuff.length; i++){
         System.out.print(stuff[i]+" ");
      }
   }
}