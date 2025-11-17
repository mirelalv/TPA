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
        System.out.print("Digite o vetor A");
        a[i]=ler.nextInt();

        System.out.print("Digite o vetor B");
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
        //apresentar C
}
}
