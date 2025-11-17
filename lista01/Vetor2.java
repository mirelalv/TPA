package aulaVetores;
import java.util.Scanner;
public class Vetor2 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		final int TAM=10;
		int a[],b[],c[],i;
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		
		//laço do vetor A
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"valor do vetor A");
			a[i] = ler.nextInt();
		}

		//laço do B 
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o"+(i+1)+"valor do vetor B");
			b[i] = ler.nextInt();
			//fazendo a soma
			c[i]= a[i]+b[i];
		}
		
		//apresentação de B
		System.out.print("\nC = ");
		for(i=0; i<TAM; i++) {
			System.out.print(c[i]+" ");
		}
	
	}

}
