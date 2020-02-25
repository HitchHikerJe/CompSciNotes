public class Search{                      //for if it's there...
   public static void main(String[] args){
      int[] stuff = new int[10];
      for(int i=0; i<stuff.length; i++){
         stuff[i]=(int)(Math.random()*10);
      }
      System.out.print("Here is your array:");
      for(int i=0; i<stuff.length; i++){
         System.out.print(stuff[i]+" ");
      }
      int s=8;
      for(int i=0; i<stuff.length; i++){
         if(stuff[i]==s){
            System.out.print("\nWhat you search for is at "+i);
            break;
         }
         else if(i==stuff.length-1){
            System.out.print("\nYour element is not in this array");
         }
      }
      for(int i=1; i<stuff.length; i++){
         for(int j=i; j>0; j--){
            if(stuff[j]<stuff[j-1]){
               int t=stuff[j];
               stuff[j]=stuff[j-1];
               stuff[j-1]=t;
            }
         }
      }
      System.out.print("\nHere is your sorted array: ");
      for(int i=0; i<stuff.length; i++){
         System.out.print(stuff[i]+" ");
      }
      int s2=4;
      int star=0, end=stuff.length-1, mid;
      for(int i=0; i<stuff.length; i++){
         mid=(end+star)/2;
         if(stuff[mid]==s2){
            System.out.print("\nWhat you search for is at "+mid);
            break;
         }
         else if(stuff[mid]>s2){
            end=mid-1;
         }
         else{
            star=mid+1;
         }
         if(i==stuff.length-1){
            System.out.print("\nYour element is not in this array");
         }
      } 
   }
}