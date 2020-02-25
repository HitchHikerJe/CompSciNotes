import java.util.Scanner;
public class InsertionSortLab{
   public static void sortDown(int[] arr){
      for(int i=1; i<arr.length; i++){
         for(int j=i; j>0; j--){
            if(arr[j]>arr[j-1]){
               int tran=arr[j-1];
               arr[j-1]=arr[j];
               arr[j]=tran;
            }
         }
      }
      for(int i=0; i<arr.length; i++){
         System.out.print(arr[i]+" ");
      }
   }
   public static void main(String[] args){
      Scanner idk = new Scanner(System.in);
      int[] nums;
      while(true){
         System.out.println("How long would you like your array to be?");
         try{
            nums = new int[idk.nextInt()];
            break;
         }
         catch(Exception e){
            System.out.println("There was an error, try again.");
            idk.next();
         }
      }
      for(int i=0; i<nums.length; i++){
         while(true){
            System.out.println("Enter the value at spot "+i+":");
            try{
               nums[i] = idk.nextInt();
               break;
            }
            catch(Exception e){
               System.out.println("There was an error, try again.");
               idk.next();
            }
         }
      }
      System.out.print("Here is your array: ");
      for(int i=0; i<nums.length; i++){
         System.out.print(nums[i]+" ");
      }
      System.out.print("\nHere is your sorted array: ");
      sortDown(nums);
   }
}