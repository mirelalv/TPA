import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
    
        
        Scanner ler=new Scanner(System.in);
        final int TAM=10;
        int a[], b[],i=0;
        a= new int [TAM];
        b= new int [TAM];

        System.out.print("Escreva A");
        a[i]=ler.nextInt();

        for(i=0;i<TAM;i++){
            if(a[i]%2==0){
                b[i]=1;
            }
    
        else{
        b[i]=0;
        }
        }
        //apresentar B
}
}
