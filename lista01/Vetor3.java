package aulaVetores;
import java.util.Scanner;
public class Vetor3 {

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
			//fazendo a conta
			b[0]=a[9];
			b[1]=a[8];
			b[2]=a[7];
			b[3]=a[6];
			b[4]=a[5];
			b[5]=a[4];
			b[6]=a[3];
			b[7]=a[2];
			b[8]=a[1];
			b[9]=a[0];
		}
		
			
		//apresentação
		System.out.println("B=[");
		for(i=0; i<TAM; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print("]");
	}

}
