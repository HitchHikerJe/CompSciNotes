import java.util.Scanner;
public class ArrayIntro{
   public static void main(String[] args){
      Scanner sadness= new Scanner(System.in);
      int[] stuff;
      while(true){
         System.out.println("How long do you want your array to be?");
         try{
            stuff = new int[sadness.nextInt()];
            break;
         }
         catch(Exception e){
            System.out.println("Invalid Response, try again.");
            sadness.next();
         }
      }
      for(int i=0; i<stuff.length; i++){
         System.out.println("What value do you want in the "+i+" spot?");
         try{
            stuff[i]=sadness.nextInt();
         }
         catch(Exception e){
            System.out.println("Invalid Response, try again.");
            sadness.next();
            i--;
         }
      }
      System.out.print("Here are your array values:");
      for(int i=0; i<stuff.length; i++){
         System.out.print(""+stuff[i]+" ");
      }
      int max=0,min=2147483647,sum=0;
      for(int i=0; i<stuff.length; i++){
         max=Math.max(max,stuff[i]);
         min=Math.min(min,stuff[i]);
         sum+=stuff[i];
      }
      System.out.println("\nThe largest value in your array is "+max);
      System.out.println("The smallest value in your array is "+min);
      System.out.println("The sum of the values in your array is "+sum);
   }
}