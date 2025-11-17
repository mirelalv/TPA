import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
    
        
        Scanner ler=new Scanner(System.in);
        final int TAM=11;
        int a[], i=0;
        a= new int [TAM];
    


        for(i=0;i<TAM;i++){
            a[i]=(int)Math.pow(2,i);
            
        }
        
         System.out.print("Vetor A = [");
          for(i=0;i<TAM;i++){
              System.out.print(a[i]+ ",");
          }
        System.out.print("]");
}
        }


