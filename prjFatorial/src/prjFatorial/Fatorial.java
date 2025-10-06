package prjFatorial;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
	
		Scanner ler= new Scanner(System.in);
		System.out.println("Escreva o número");
		int n = ler.nextInt();
		
		int i = 1;
	
		int fatorial = 1;
		
		do {
		
			fatorial = fatorial * i; 
			i++;
		}while (i<=n);
		
		System.out.println("Fatorial de" +n+ "é" +fatorial);
		
	}

}
