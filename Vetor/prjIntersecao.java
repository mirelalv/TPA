import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
    
        
        Scanner ler=new Scanner(System.in);
        final int TAM=10;
        int a[], b[],c[], i=0, j, f;
        a= new int [TAM];
        b= new int [TAM];
        c= new int [TAM];
        f=0;

          System.out.println("Digite o"+(i+1)+"valor de A");
            a[i]= ler.nextInt();

          System.out.println("Digite o"+(i+1)+"valor de B");
            b[i]= ler.nextInt();


            
        for(j=0;j<TAM;j++){
            if(a[i]==b[i]){
                c[f] = a[i];

                f=f+1;
            }
    }
         System.out.print("Interseção A e B = [");
          for(i=0;i<TAM;i++){
              System.out.print(c[f]+ ",");
          }
        System.out.print("]");
}
}

