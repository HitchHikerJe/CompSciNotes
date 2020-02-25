public class SelectionSort{
   public static void main(String[] args){
      int transit;
      int[] stuff = new int[10];
      for(int i=0; i<stuff.length; i++){        //sets array values to random integers
         stuff[i]=(int)(Math.random()*10);
      }
      for(int i=0; i<stuff.length; i++){        //prints array values
         System.out.print(stuff[i]+" ");
      }
      System.out.println();                     //switches the second and seventh values;
      transit=stuff[2];
      stuff[2]=stuff[7];
      stuff[7]=transit;
      for(int i=0; i<stuff.length; i++){        //prints array values
         System.out.print(stuff[i]+" ");
      }
      /*for(int i=0; i<stuff.length; i++){        //sorting array least to greatest
         for(int j=i+1; j<stuff.length; j++){   //loop-ception (loops in loops in loops in loops)
            if(stuff[j]<stuff[i]){              //Selertion sort
               transit=stuff[i];
               stuff[i]=stuff[j];
               stuff[j]=transit;
            }
         }
      }*/
      for(int i=0; i<stuff.length; i++){        //THIS IS SELECTION SORTING
         int mini=i;
         for(int j=i+1; j<stuff.length-1; j++){
            if(stuff[j]<stuff[mini]){
               mini = j;
            }
         }
         transit=stuff[i];
         stuff[i]=stuff[mini];
         stuff[mini]=transit;
      }
      System.out.println();
      for(int i=0; i<stuff.length; i++){        //prints array values
         System.out.print(stuff[i]+" ");
      }
   }
}