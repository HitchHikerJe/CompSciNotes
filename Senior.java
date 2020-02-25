public class Senior extends Student{
   private String postGrad;
   public Senior(String n, int a, double g, String p){
      super(n,a,g);
      postGrad=p;
   }
   public String getPostGrad(){
      return postGrad;
   }
   public void setPostGrad(String p){
      postGrad=p;
   }
   public String toString(){
      return super.toString()+"Post-Grad Plans: "+postGrad+"\n";
   }
}