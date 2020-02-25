import java.util.*;
public class AnimalList{
   public static void main(String[] args){
      ArrayList<Animal> ani = new ArrayList<Animal>();
      ani.add(new Animal(8,"brown",true));
      ani.add(new Animal(4,"gray",true));
      ani.add(new Animal(2,"blue",false));
      ani.add(new Animal(3,"green",true));
      ani.add(new Animal(7,"pink",false));
      System.out.println(ani);
      int num=newNum();
      ani.get(num).setLegs(13);
      System.out.println("Updated animal at index "+num+": "+ani.get(num).toString());
      num=newNum();
      System.out.println("Color of animal at index "+num+": "+ani.get(num).getColor()+"\n");
      num=newNum();
      ani.get(num).setColor("purple");
      System.out.println("Updated animal at index "+num+": "+ani.get(num).toString());
      num=newNum();
      System.out.println("Animal at index "+num+" breathes air: "+ani.get(num).getAir()+"\n");
      num=newNum();
      System.out.println("Information on animal at index "+num+" : "+ani.get(num).toString());
   }
   public static int newNum(){
      return (int)(Math.random()*5);
   }
}