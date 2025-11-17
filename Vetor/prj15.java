import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
    
        
        Scanner ler=new Scanner(System.in);
        final int TAM=10;
        int a[], b[],c[],i=0;
        a= new int [TAM];
        b= new int [TAM];
        c= new int [TAM];

        System.out.println("Digite o "+(i+1)+"° valor do vetor A");
            a[i]=ler.nextInt();

        System.out.println("Digite o "+(i+1)+"° valor do vetor B");
            b[i]=ler.nextInt();

        for(i=0;i<TAM;i++){
            if(a[i]==b[i]){
                c[i]=0;
            }
    
        else if(a[i]>b[i]){
            c[i]=1;
        }
        
            else{
                c[i]=-1;
            }
            }

         System.out.print("Vetor C = [");
          for(i=0;i<TAM;i++){
              System.out.print(c[i]+ ",");
          }
        System.out.print("]");
}
}

