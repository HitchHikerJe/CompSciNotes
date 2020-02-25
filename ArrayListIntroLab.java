import java.util.*;
public class ArrayListIntroLab{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      ArrayList listy = new ArrayList<Integer>();
      boolean stop=false;
      while(!stop){
         int choice;
         while(true){
            System.out.println("What would you like to do? (Type the number of your choice)");
            System.out.println("1: add an item\n2: replace an item\n3: remove an item\n4: stop");
            try{
               choice=input.nextInt();
               if(choice>4||choice<1){
                  System.out.println("That is not a valid input. Try Again.");
               }
               else{
                  break;
               }
            }
            catch(Exception e){
               System.out.println("That is not a valid input. Try Again.");
               input.next();
            }
         }
         switch(choice){
            case 1:
               while(true){
                  System.out.println("What would you like to add to the list?");
                  try{
                     listy.add(input.nextInt());
                     break;
                  }
                  catch(Exception e){
                     System.out.println("That is not a valid input. Try Again.");
                     input.next();
                  }
               }
               System.out.println("Here is your updated list: "+listy);
               break;
            case 2:
               if(listy.size()==0){
                  System.out.println("This option cannot occur with the list in its current state.");
                  break;
               }
               while(true){
                  System.out.println("Which item do you want to replace?");
                  try{
                     int rep=input.nextInt();
                     System.out.println("A "+listy.get(rep)+" is currently in spot "+rep+". What would you like to replace it with?");
                     listy.set(rep,input.nextInt());
                     break;
                  }
                  catch(Exception e){
                     System.out.println("There was an error. Try Again.");
                     input.next();
                  }
               }
               System.out.println("Here is your updated list: "+listy);
               break;
            case 3:
               if(listy.size()==0){
                  System.out.println("This option cannot occur with the list in its current state.");
                  break;
               }
               while(true){
                  System.out.println("Which item do you want to remove?");
                  try{
                     int rem=input.nextInt();
                     if(rem>=0&&rem<listy.size()){
                        System.out.println(listy.get(rem)+" was removed from the list.");
                        listy.remove(rem);
                        break;
                     }
                     else{
                        System.out.println("That is not a valid input. Try Again.");
                     }
                  }
                  catch(Exception e){
                     System.out.println("There was an error. Try Again.");
                     input.next();
                  }
               }
               System.out.println("Here is your updated list: "+listy);
               break;
            case 4:
               stop=true;
               break;
         }
      }
      System.out.println("Au revoir");
   }
}