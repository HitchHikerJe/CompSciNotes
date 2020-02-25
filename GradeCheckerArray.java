import java.util.Scanner;
public class GradeCheckerArray{
   static boolean valid = false;
   static int[] grades;
   static char desire;
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      while(!valid){
         System.out.println("What are your current quiz grades? Please separate each value with a space.");
         getGrade(input.nextLine());
      }
      System.out.println("Your current average is "+current(grades));
      System.out.println("Therefore, you have a "+letter(current(grades))+" in the class.");
      System.out.println("What letter grade do you want in the class?");
      int x = goal(current(grades), input.nextLine().toUpperCase().charAt(0));
      if(x > 100){
         System.out.println("It is impossible for you to earn your desired grade with another test. No matter how good it is.");
      }
      else{
         System.out.println("if you want a "+desire+" in the class, then you must get a "+x+" on the next quiz.");
      }
   }
   public static void getGrade(String s){
      try{
         int findLen = 1;
         for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' ' && s.charAt(i-1) != ' '){
               findLen += 1;
            }
         }
         int[] grades = new int[findLen];
         System.out.println(grades);
         if(s.indexOf("100") == -1){
            
         }
         else{
            
         }
         valid = true;
      }
      catch(Exception e){
         System.out.println("There was an error. Try again.");
         try{
            Thread.sleep(300);
         }catch(Exception f){}
      }
   }
   public static int current(int[] a){
      int sum = 0;
      for(int i = 0; i < a.length; i++){
         sum += a[i];
      }
      return sum/a.length;
   }
   public static char letter(int x){
      if(x>=90){
         return 'A';
      }
      else if(x>=80){
         return 'B';
      }
      else if(x>=70){
         return 'C';
      }
      else if(x>=60){
         return 'D';
      }
      else{
         return 'F';
      }
   }
   public static int goal(int x, char y){
      desire = y;
      switch(y){
         case 'A':
            return 180-x;
         case 'B':
            return 160-x;
         case 'C':
            return 140-x;
         case 'D':
            return 120-x;
         default:
            return 100-x;
      }
   }
}