public class TwoDArrays{
   public static void main(String[] args){
      int[][] stuff = new int[5][3];
      for(int i=0; i<stuff.length; i++){
         for(int j=0; j<stuff[i].length; j++){
            stuff[i][j]=(int)(Math.random()*3+1);
         }
      }
      for(int i=0; i<stuff.length; i++){
         for(int j=0; j<stuff[i].length; j++){
            System.out.print(stuff[i][j]+" ");
         }
         System.out.println();
      }
      System.out.println("*************");
      for(int i=0; i<stuff[3].length; i++){
         System.out.print(stuff[3][i]+" ");
      }
      int count2=0;
      for(int i=0; i<stuff.length; i++){
         for(int j=0; j<stuff[i].length; j++){
            if(stuff[i][j]==2){
               count2++;
            }
         }
      }
      System.out.println("\n"+count2);
      int total=0;
      for(int i=0; i<stuff.length; i++){
         for(int j=0; j<stuff[i].length; j++){
            total+=stuff[i][j];
         }
      }
      System.out.println(total);
      int count1=0;
      for(int i=0; i<stuff.length; i++){
         for(int j=0; j<stuff[i].length; j++){
            if(stuff[i][j]==1){
               count1++;
            }
         }
      }
      int count3=0;
      for(int i=0; i<stuff.length; i++){
         for(int j=0; j<stuff[i].length; j++){
            if(stuff[i][j]==3){
               count3++;
            }
         }
      }
      /*if(count3>count2&&count3>count1){
         System.out.println("3 is the most prevalent, occuring "+count3+" times");   
      }
      else{
         if(count2>count1){
            System.out.println("2 is the most prevalent, occuring "+count2);
         }
      }*/
   }
}