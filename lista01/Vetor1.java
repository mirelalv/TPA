package aulaVetores;

import java.util.Scanner;

public class Vetor1 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		final int TAM=10;
		int a[],b[],i;
		a = new int[TAM];
		b = new int[TAM];
		
		//laço do vetor A
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"valor do vetor A");
			a[i] = ler.nextInt();
		}
		
		//laço do B e cálculo do B
		for(i=0; i<TAM; i++) {
			//fazendo a soma
			b[i]= a[i]*a[i];
		}
		
		//apresentação de B
		System.out.print("\nB = ");
		for(i=0; i<TAM; i++) {
			System.out.print(b[i]+" ");
		}
	}

}
