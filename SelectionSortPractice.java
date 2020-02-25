import java.util.Scanner;
public class SelectionSortPractice{
   public static void main(String[] args){
      Scanner keys = new Scanner(System.in);
      int len;
      String lets;
      char[] arr;
      while(true){
         System.out.println("How many characters do you want in your array?");
         try{
            len = keys.nextInt();
            if(len>0){
               break;
            }
            System.out.println("That is not a valid input, try again.");
         }
         catch(Exception e){
            System.out.println("There was an error, try again.");
            keys.next();
         }
      }
      arr = new char[len];
      while(true){
         System.out.println("Enter "+len+" characters without spaces:");
         lets = keys.next().toLowerCase();
         if(lets.length()==len){
            break;
         }
         System.out.println("That is not "+len+" characters, try again.");
      }
      for(int i=0; i<len; i++){
         arr[i]=lets.charAt(i);
      }
      System.out.print("Here is your original array: "+lets);
      System.out.print("\nHere is your alphabetized array: ");
      alphabetize(arr);
   }
   public static void alphabetize(char[] arr){
      for(int i=0; i<arr.length; i++){
         for(int j=i; j<arr.length; j++){
            if(arr[j]<arr[i]){
               char tem = arr[i];
               arr[i]=arr[j];
               arr[j]=tem;
            }
         }
      }
      for(int i=0; i<arr.length; i++){
         System.out.print(arr[i]);
      }
   }
}