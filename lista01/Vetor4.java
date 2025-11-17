package aulaVetores;
import java.util.Scanner;
public class Vetor4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM=10;
		int a[],soma = 0, media=0,i;
		a = new int[TAM];
	
		
		//laço do vetor A
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"valor do vetor A");
			a[i] = ler.nextInt();
			//soma
			soma= soma+ a[i];
			
		}
		
		//apresentação
			media= soma/TAM;
			System.out.println("A média da soma dos valores é"+ media);
		}
	
	}

	


