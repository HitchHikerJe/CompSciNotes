import java.util.*;
public class ArrayListNotes{
   public static void main(String[] args){
      ArrayList listy = new ArrayList<String>();
      System.out.println(listy.size());
      
      listy.add("Someone");
      System.out.println(listy.size());
      
      System.out.println(listy.get(0));
      listy.add("SomeoneElse");
      System.out.println(listy);
      
      listy.add(1,"AntherOne");
      System.out.println(listy);
      
      listy.set(0,"DifferentOne");
      System.out.println(listy);
      
      listy.remove(1);
      System.out.println(listy);
   }
}