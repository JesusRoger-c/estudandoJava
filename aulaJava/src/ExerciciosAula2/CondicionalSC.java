package ExerciciosAula2;

import java.util.Scanner;

public class CondicionalSC {
	
	private static Scanner scanner;
	

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		System.out.println("Informe um valor de 1 até 7");
		int opcao = scanner.nextInt();
		
		
		switch(opcao) {
		
		case 1: 
			System.out.print("Sabado");
		
		break;
		
		case 2:
			System.out.print("Domingo");
			
		break;
		case 3:
			System.out.print("segunda");
			
		break;
		case 4:
			System.out.print("terca");
			
		break;
		case 5:
			System.out.print("quarta");
			
		break;
		case 6:
			System.out.print("quinta");
			
		break;
		case 7:
			System.out.print("sexta");
			
		break;
			
			default: 
				System.out.println("Valor informado não corresponde");
			
			
			
			
			
			
			
			
		}
		

	}

}
