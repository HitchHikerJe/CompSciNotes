import java.util.Scanner;
public class AllTheThings{
   static Scanner input = new Scanner(System.in);
   public static void main(String[] args){
      System.out.println("Enter your favorite string of characters!");
      String str = input.nextLine();
      backwards(str);
      System.out.println(odd(str));
      vowelRemover(str);
      coolString(str);
   }
   public static void backwards(String s){
      for(int i = s.length()-1; i >= 0; i--){
         System.out.print(s.charAt(i));
      }
      System.out.println();
   }
   public static boolean odd(String s){
      if(s.length()%2 == 1){
         return true;
      }
      else{
         return false;
      }
   }
   public static void vowelRemover(String s){
      for(int i = 0; i < s.length(); i++){
         if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'){
            s = s.substring(0,i) + s.substring(i+1);
            i--;
         }
      }
      System.out.println(s);
   }
   public static void coolString(String s){
      int count = 0;
      if(s.length()%2 == 0){
         count++;
      }
      if(s.length()%3 == 0){
         count++;
      }
      if(s.length()%4 == 0){
         count++;
      }
      switch(count){
         default:
            System.out.println("Your string is lame.");
            break;
         case 1:
            System.out.println("Your string is cool.");
            break;
         case 2:
            System.out.println("Your string is cooler.");
            break;
         case 3:
            System.out.println("Your string is coolest");
            break;
      }
   }
}