import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
    
        
        Scanner ler=new Scanner(System.in);
        final int TAM=10;
        int a[], i=0, j;
        boolean primo=true;
        a= new int [TAM];

        for (i =0; i<10; i++) {
            System.out.println("Digite o "+(i+1)+"° valor do vetor A");
            a[i]=ler.nextInt();
        }
            
        for (i =0; i<10; i++) {
          if (a[i]< 2) {
              primo = false;
          }
        }
        
        for (j=2; j<a[i]; j++) {
          if (a[i]%j== 0) {
                primo = false;
                }
            }
        

            if(primo){
                System.out.println(a[i] + " é primo");
                }
                
            else{
          System.out.println(a[i] + " não é primo");
            }
        
            }
    }

