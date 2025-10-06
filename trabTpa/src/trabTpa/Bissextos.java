package trabTpa;
import java.util.Scanner;
public class Bissextos {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		
		int i=1, anoInicial, anoFinal,bissexto=0,total;
		
		System.out.println("Digite o ano inicial");
		anoInicial= ler.nextInt();
		
		System.out.println("Digite o ano final");
		anoFinal= ler.nextInt();
		
		total= anoFinal-anoInicial;
		
		while(i<=total) {
			
			if(anoInicial%4==0) {
				
				bissexto=bissexto+1;
				System.out.println("O ano bissexto é "+anoInicial);
		
			}
			
			anoInicial=anoInicial+1;
			i++;
		}
		System.out.println("O total de anos bissextos é "+bissexto);
	}

}
