import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        
        Scanner ler=new Scanner(System.in);
        final int TAM=15;
        int a[], b[], i, j, fatorial;
        a= new int [TAM];
        b=new int [TAM];
        fatorial=1;

        for(i=0;i<TAM;i++){
            a[i]=ler.nextInt();
            
        }

        for(j=1;j<a[i];j++){

            fatorial=fatorial*j;
            b[i]=fatorial;

        }
        System.out.println("Fatorial de A"+b[i]);
    }
}