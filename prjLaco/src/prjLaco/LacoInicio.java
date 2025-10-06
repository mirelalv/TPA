package prjLaco;

import java.util.Scanner;

public class LacoInicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int i = 1, t;
		double n;
		
		System.out.println("Entre com o número");
		n= ler.nextDouble();
		
		while(i<=10) {
			t= (int) (n*i);
			System.out.println(+t);
			
			i = i+1;
			
		}
		
	}

}
