import java.util.Scanner;
public class VowelInvestigator{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a phrase, any phrase.");
      String stringy = input.nextLine();
      System.out.println(vowelCounter(stringy));
      eReplacer(stringy);
      System.out.println(vowelFinder(stringy.toLowerCase()));
   }
   public static int vowelCounter(String s){
      int count = 0;
      s = s.toLowerCase();
      for(int i = 0; i < s.length(); i++){
         if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
            count++;
         }
      }
      return count;
   }
   public static void eReplacer(String s){
      for(int i = 0; i < s.length(); i++){
         if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
            s = s.substring(0,i)+"e"+s.substring(i+1);
         }
      }
      System.out.println(s);
   }
   public static int vowelFinder(String s){
      for(int i = 0; i < s.length(); i++){
         if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
            return i;
         }
      }
      return -42;
   }
}