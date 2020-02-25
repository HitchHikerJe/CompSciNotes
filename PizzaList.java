import java.util.*;
public class PizzaList{
   public static void main(String[] args){
      ArrayList<Pizza> menu = new ArrayList<Pizza>();
      menu.add(new Pizza("Cheese", 12, false));
      menu.add(new Pizza("Sausage", 42, true));
      menu.add(1,new Pizza("White", 6, false));
      //System.out.println(menu);
      System.out.println(menu.get(2).getType());
   }
}