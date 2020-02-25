import java.util.*;
public class ListLoopLab{
   public static void listFiller(ArrayList<Integer> list, int num){
      while(list.size()<num){
         list.add((int)(Math.random()*10+1));
      }
      System.out.println("Here is your list: "+list);
   }
   public static int counter(ArrayList<Integer> list, int num){
      int i=0,c=0;
      while(i<list.size()){
         if(num==list.get(i)){
            c++;
         }
         i++;
      }
      return c;
   }
   public static void remover(ArrayList<Integer> list, int num){
      for(int i=list.size()-1; i>=0; i--){
         if(list.get(i)==num){
            list.remove(i);
         }
      }
      System.out.println("Here is your list with every instance of "+num+" removed:\n"+list);
   }
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      ArrayList thing = new ArrayList<Integer>();
      System.out.println("How big do you want your list to be?");
      listFiller(thing,input.nextInt());
      System.out.println("What do you want to search for?");
      System.out.println("That element shows up in your list "+counter(thing,input.nextInt())+" times");
      System.out.println("What element do you want to remove?");
      remover(thing,input.nextInt());
   }
}