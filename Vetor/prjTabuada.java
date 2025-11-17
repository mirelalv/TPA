import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        final int TAM=5;
        int a[], b[], i, j;
        a= new int [TAM];
        b=new int [TAM];
        j=1;

        for(i=0; i<TAM; i++){
              System.out.println("Digite o"+(i+1)+"valor de A");
            a[i]= ler.nextInt();
            
    }
        
        for(j=1; j<=10; i++){
            System.out.println(a[i]+" x "+j+" = "+a[i]*j);
}
    }
}
