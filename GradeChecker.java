import java.util.Scanner;
public class GradeChecker{
   static int one, two, three;
   static char desire;
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("What are your current 3 quiz grades? Please separate each value with a space.");
      getGrade(input.nextLine().trim());
      System.out.println("Your current average is "+current(one, two, three));
      System.out.println("Therefore, you have a "+letter(current(one, two, three))+" in the class.");
      System.out.println("What letter grade do you want in the class?");
      int x = goal(current(one, two, three), input.nextLine().trim().toUpperCase().charAt(0));
      System.out.println("if you want a "+desire+" in the class, then you must get at least a "+x+" on the next quiz.");
   }
   public static void getGrade(String s){
      s += " ";
      int spaces = 0;
      int later;
      for(int i = 0; i + 1 < s.length(); i++){
         later = 0;
         if(s.charAt(i) == ' '){
            spaces++;
         }
         else if(s.charAt(i) == '1' && s.charAt(i+1) == '0' && s.charAt(i+2) == '0'){
            later += 100;
         }
         else{
            switch(s.charAt(i)){
               case '1':
                  if(s.charAt(i+1) == ' '){
                     later += 1;
                  }
                  else{
                     later += 10;
                  }
                  break;
               case '2':
                  if(s.charAt(i+1) == ' '){
                     later += 2;
                  }
                  else{
                     later += 20;
                  }
                  break;
               case '3':
                  if(s.charAt(i+1) == ' '){
                     later += 3;
                  }
                  else{
                     later += 30;
                  }
                  break;
               case '4':
                  if(s.charAt(i+1) == ' '){
                     later += 4;
                  }
                  else{
                     later += 40;
                  }
                  break;
               case '5':
                  if(s.charAt(i+1) == ' '){
                     later += 5;
                  }
                  else{
                     later += 50;
                  }
                  break;
               case '6':
                  if(s.charAt(i+1) == ' '){
                     later += 6;
                  }
                  else{
                     later += 60;
                  }
                  break;
               case '7':
                  if(s.charAt(i+1) == ' '){
                     later += 7;
                  }
                  else{
                     later += 70;
                  }
                  break;
               case '8':
                  if(s.charAt(i+1) == ' '){
                     later += 8;
                  }
                  else{
                     later += 80;
                  }
                  break;
               case '9':
                  if(s.charAt(i+1) == ' '){
                     later += 9;
                  }
                  else{
                     later += 90;
                  }
                  break;
               default:
                  later += 0;
                  break;
            }
         }
         if(spaces == 0){
            one += later;
         }
         else if(spaces == 1){
            two += later;
         }
         else{
            three += later;
         }
      }
   }
      public static int current(int a, int b, int c){
      return (a+b+c)/3;
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