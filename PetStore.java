import java.util.Scanner;
public class PetStore{
   private Dog[] pets;
   public PetStore(int n){
      pets = new Dog[n];
   }
   public static void main(String[] args){
      Scanner sad = new Scanner(System.in);
      PetStore buy;
      while(true){
         System.out.println("How many dogs are in the pet store?");
         try{
            buy = new PetStore(sad.nextInt());
            break;
         }
         catch(Exception e){
            System.out.println("There was an error, try again.");
            sad.next();
         }
      }
      for(int i=0; i<buy.pets.length; i++){
         String n;
         int a;
         System.out.println("What do you want to name the dog in spot "+i+"?");
         n=sad.next();
         while(true){
            System.out.println("How old is "+n+"?");
            try{
               a=sad.nextInt();
               break;
            }
            catch(Exception e){
               System.out.println("There was an error, try again.");
               sad.next();
            }
         }
         buy.pets[i]= new Dog(n,a);
      }
      System.out.println("Here are the dogs in your pet store:");
      for(int i=0; i<buy.pets.length; i++){
         System.out.println(buy.pets[i].toString());
      }
   }
}