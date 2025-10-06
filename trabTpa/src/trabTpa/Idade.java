package trabTpa;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		
		Scanner ler= new Scanner (System.in);
		int anoAtual, anoNasc, opcao,idade,i=0;
		
		do {
		System.out.println("Coloque o ano atual");
		
		anoAtual=ler.nextInt();
		
		
		System.out.println("Coloque o ano de nascimento");
		
		anoNasc=ler.nextInt();
		
		idade= anoAtual-anoNasc;
		
		System.out.println("A idade é "+idade);
		
		System.out.println("Deseja continuar? 1-continuar/ 0- sair");
		opcao= ler.nextInt();
		

		i=i+1;
	
		}while(opcao!=0);
		
		
	}

}
