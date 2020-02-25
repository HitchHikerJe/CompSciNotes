public class Student extends Human{
   private double gPA;
   public Student(String n, int a, double g){
      super(n,a);
      gPA=g;
   }
   public double getGPA(){
      return gPA;
   }
   public void setGPA(int g){
      gPA=g;
   }
   public String toString(){
      return super.toString()+"GPA: "+gPA+"\n";
   }
}