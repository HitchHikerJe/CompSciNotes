import java.util.Scanner;
public class MatrixLab{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("How many rows do you want in your matrix?");
      int r=input.nextInt();
      System.out.println("How many columns do you want in your matrix?");
      int[][] matrix = new int[r][input.nextInt()];
      for(int i=0; i<matrix.length; i++){
         for(int j=0; j<matrix[i].length; j++){
            System.out.println("Enter the number that you want in spot "+j+" of row "+i);
            matrix[i][j]=input.nextInt();
         }
      }
      System.out.println("Here is your matrix:");
      for(int i=0; i<matrix.length; i++){
         for(int j=0; j<matrix[i].length; j++){
            System.out.print(matrix[i][j]+" ");
         }
         System.out.println();
      }
      int big=matrix[0][0], small=matrix[0][0], total=0;;
      for(int i=0; i<matrix.length; i++){
         for(int j=0; j<matrix[i].length; j++){
            if(matrix[i][j]>big){
               big=matrix[i][j];
            }
            if(matrix[i][j]<small){
               small=matrix[i][j];
            }
            total+=matrix[i][j];
         }
      }
      System.out.println(big+" is the biggest element in your matrix\n"+small+" is the smallest element in your matrix");
      System.out.println("The sum of all the elements in your matrix is "+total);
   }
}