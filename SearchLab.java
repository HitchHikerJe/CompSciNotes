import java.util.Scanner;
public class SearchLab{
   public static int linearSearch(int[] array, int n){
      for(int i=0; i<array.length; i++){
         if(array[i]==n){
            return i;
         }
      }
      return -1;
   }
   public static int binarySearch(int[] array, int n){
      for(int i=0; i<array.length; i++){
         int mini=i;
         for(int j=i; j<array.length; j++){
            if(array[j]<array[mini]){
               mini=j;
            }
         }
         int tem=array[i];
         array[i]=array[mini];
         array[mini]=tem;
      }
      System.out.print("Here is your sorted array: ");
      for(int i=0; i<array.length; i++){
         System.out.print(array[i]+" ");
      }
      int start=0, end=array.length-1;
      for(int i=0; i<array.length; i++){
         int mid=(start+end)/2;
         if(array[mid]==n){
            return mid;
         }
         else if(array[mid]>n){
            end=mid-1;
         }
         else{
            start=mid+1;
         }
      }
      return -1;
   }
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("How many elements do you want in your array?");
      int[] stuff = new int[input.nextInt()];
      for(int i=0; i<stuff.length; i++){
         System.out.println("Enter a value for spot "+i);
         stuff[i]=input.nextInt();
      }
      System.out.print("Here is your original array: ");
      for(int i=0; i<stuff.length; i++){
         System.out.print(stuff[i]+" ");
      }
      System.out.println("\nWhat element do you want to search for with linear search?");
      int s=input.nextInt();
      if(linearSearch(stuff,s)==-1){
         System.out.println(s+" is not a part of this array");
      }
      else{
         System.out.println(s+" is at index "+linearSearch(stuff,s));
      }
      System.out.println("What element do you want to search for with binary search?");
      s=input.nextInt();
      int f=binarySearch(stuff,s);
      if(f==-1){
         System.out.println(s+" is not a part of this array");
      }
      else{
         System.out.println("\n"+s+" is at index "+f);
      }
   }
}