import java.util.Scanner;
public class PasswordChecker{
   static Scanner input = new Scanner(System.in);
   public static boolean checker(String s){
      String pw="depression";
      if(s.equals(pw)){
         return true;
      }
      return false;
   }
   public static void main(String[] args){
      int aR=3;
      String remain="";
      boolean check=false;
      while(!check&&aR>0){
         System.out.println(remain+" Enter your password.");
         check=checker(input.nextLine());
         if(!check){
            aR--;
            remain="Invalid password. You have "+aR+" attempts remaining.";
         }
      }
      if(check){
         System.out.println("Access Granted.");
      }
      else{
         System.out.println("Access Denied");
      }
   }
}