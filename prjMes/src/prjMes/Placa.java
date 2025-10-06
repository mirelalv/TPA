package prjMes;
import java.util.Scanner;

public class Placa {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int np;
		System.out.println("Coloque o último digito da sua placa");
		np = in.nextInt();
		switch (np) {
		case 1:
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
		case 4:
			System.out.println("Terça");
			break;
		case 5:
		case 6:
			System.out.println("Quarta");
			break;
		case 7:
	    case 8:
	    	System.out.println("Quinta");
	    	break;
	    case 9:
	    case 0:
	    	System.out.println("Sexta");
	    	break;
	    	default:
	    		System.out.println("Placa inválida");
	    		
			
		}

	}

}
