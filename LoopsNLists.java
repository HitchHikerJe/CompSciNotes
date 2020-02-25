import java.util.*;
public class LoopsNLists{
   public static void main(String[] args){
      ArrayList list = new ArrayList<Integer>();
      //printing
      for(int i=0; i<list.size(); i++){
         System.out.print(list.get(i));
      }
      int i=0;
      while(i<list.size()){
         System.out.print(list.get(i));
         i++;
      }
      
      //counting
      int c=0;
      for(int j=0; j<list.size(); j++){
         if(list.get(j)==4){
            c++;
         }
      }
      i=0,c=0;
      while(i<list.size()){
         if(list.get(j)==4){
            c++;
         }
         i++;
      }
      
      //removing
      while(list.size()>0){
         list.remove(0);
      }
      for(int j=list.size()/*-1*/; j>/*=*/0; j--){
         list.remove(0);
         //list.remove(i);
      }
   }
}