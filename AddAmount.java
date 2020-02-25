public class AddAmount{
   private double amount=50;
   public AddAmount(double x){
      amount+=x;
   }
   public double getAmount(){
      return amount;
   }
   public void setAmount(double a){
      amount=a;
   }
   public void amountPlus(double a){
      amount+=a;
   }
   public static void main(String[] args){
      AddAmount banko = new AddAmount(30);
      System.out.println("The piggy bank contains $"+banko.getAmount());
      banko.amountPlus(30.55);
      System.out.println("The piggy bank now contains $"+banko.getAmount());
      banko.setAmount(115);
      System.out.print("The piggy bank now contains $"+banko.getAmount());
   }
}