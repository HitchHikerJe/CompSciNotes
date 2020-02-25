import java.util.Scanner;
public class NumberFun{
   static Scanner input = new Scanner(System.in);
   public static void main(String[] args){
      boolean cont = true, perfect;
      int take;
      do{
         System.out.println("Enter an integer.");
         take = input.nextInt();
         input.nextLine();
         perfect = perfectNumber(take);
         if(perfect){
            System.out.println(take + " is a perfect number.");
         }
         else{
            System.out.println(take + " is not a perfect number.");
         }
         cont = yN("Do you want to try a different integer?");
      }while(cont);
      System.out.println("Bye!");
   }
   public static boolean perfectNumber(int x){
      int sum = 0, div = 1;
      while(div<x){
         if(x%div==0){
            sum+=div;
         }
         div++;
      }
      if(sum==x){
         return true;
      }
      else{
         return false;
      }
   }
   public static boolean yN(String s){
      String str;
      while(true){
         System.out.println(s + " yes or no.");
         str = input.nextLine().trim().toLowerCase();
         if(str.equals("yes")){
            return true;
         }
         else if(str.equals("no")){
            return false;
         }
         else{
            System.out.println("That is not a correct response.");
         }
      }
   }
}