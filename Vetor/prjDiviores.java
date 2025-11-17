import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
    
        
        Scanner ler=new Scanner(System.in);
        final int TAM=10;
        int a[], i=0, j;
        a= new int [TAM];

        System.out.println("Digite o vetor A");
          a[i]=ler.nextInt();
        System.out.println("Os divisores de "+a[i]+":");
       
        for(j=(a[i]-1);j<TAM;j--){
            if(a[i]%j==0){
                System.out.println(j);
            }
            
        }
        
}
}
