import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
    
        
        Scanner ler=new Scanner(System.in);
        final int TAM=10;
        int a[], i=0, j;
        boolean palíndromo=true;
        a= new int [TAM];

        for (i=0; i<TAM; i++) {
            System.out.println("Digite o "+(i+1)+"° valor do vetor A");
            a[i]=ler.nextInt();
        }
            
        for (i=0; i<TAM; i++) {
          if (a[i]!=a[9-i]) {
              palíndromo= false;
          }
        }
        
        
        System.out.println("Essa sequência é um palíndromo?"+a[i]);

            if(palíndromo){
                System.out.println(" Sim");
                }
                
            else{
          System.out.println("NÃO ");
            }
        
            }
    
}
