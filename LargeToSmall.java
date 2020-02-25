import java.util.Scanner;
public class LargeToSmall{
   static Scanner input = new Scanner(System.in);
   public static void main(String[]args){
      while(true){
         int a = intCheck("What is your first integer?");
         int b = intCheck("What is your second integer?");
         int c = intCheck("What is your third integer?");
         finalCheck(a,b,c);
      }
   }
   public static int intCheck(String s){
      while(true){
         System.out.println(s);
         try{
            return input.nextInt();
         }
         catch(Exception e){
            System.out.println("That is not a valid input, try again");
            input.next();
            try{
               Thread.sleep(1000);
            }
            catch(Exception f){
                
            }
         }
      }
   }
   public static void finalCheck(int a, int b, int c){
      if(a == b && b == c){
         System.out.println(a+" "+a+" "+a);
      }
      else if(a == b){
         if(a > c){
            System.out.println(a+" "+a+" "+c);
         }
         else{
            System.out.println(c+" "+a+" "+a);
         }
      }
      else if(a == c){
         if(a > b){
            System.out.println(a+" "+a+" "+b);
         }
         else{
            System.out.println(b+" "+a+" "+a);
         }
      }
      else if(b == c){
         if(a > b){
            System.out.println(a+" "+b+" "+b);
         }
         else{
            System.out.println(b+" "+b+" "+a);
         }
      }
      else{
         if(a > b){
            if(a > c){
               if(b > c){
                  System.out.println(a+" "+b+" "+c);
               }
               else{
                  System.out.println(a+" "+c+" "+b);
               }
            }
            else{
               System.out.println(c+" "+a+" "+b);
            }
         }
         else{
            if(a > c){
                  System.out.println(b+" "+a+" "+c);
            }
            else{
               if(b > c){
                  System.out.println(b+" "+c+" "+a);
               }
               else{
                  System.out.println(c+" "+b+" "+a);
               }
            }
         }
      }
   }
}