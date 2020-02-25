import java.util.Scanner;
public class StringChanger{
   public static void pigLatin(String s){
      System.out.println(s.substring(1) + s.charAt(0) + "ay");
   }
   public static void pirate(String s){
      System.out.println("arrrrr, "+s+"!");
   }
   public static void middle(String s){
      int locate = s.length() - (s.length()/2);
      System.out.println(s.charAt(locate));
   }
   public static void yelling(String s){
      System.out.println(s.toUpperCase()+"!!!!!");
   }
   public static void babyTalk(String s){
      String nS = s.replaceAll("r","w");     //the stuff that is commented out probably uses less memory to run. However, i am uncertain
      nS = nS.replaceAll("R","W");
      if(nS.equals(s)){
         System.out.println("Your string is baby-proof.");
      }
      else{
         System.out.println(nS);
      }
      /*boolean check = false;
      for(int i = 0; i < s.length(); i++){
         if(s.charAt(i) == 'r' || s.charAt(i) == 'R'){
            check = true;
            break;
         }
      }
      if(check == true){
         s = s.replaceAll("r","w");
         s = s.replaceAll("R","W");
         System.out.println(s);
      }
      else{
         System.out.println("Your string is baby-proof.");
      }*/
   }
   public static void alphabetize(String s){
      s = s.toLowerCase();
      int check = s.compareTo("onomatopoeia");
      if(check < 0){
         System.out.println("before");
      }
      else if(check > 0){
         System.out.println("after");
      }
      else{
         System.out.println("same");
      }
   }
   public static void main(String[]args){
      Scanner input = new Scanner(System.in);
      System.out.println("Enter any string that you want.");
      String s = input.nextLine();
      pigLatin(s);
      pirate(s);
      middle(s);
      yelling(s);
      babyTalk(s);
      alphabetize(s);
   }
}