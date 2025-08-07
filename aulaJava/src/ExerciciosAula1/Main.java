package ExerciciosAula1;
import java.util.Scanner;

public class Main {

	private static Scanner scanner;

	public static void main(String[] args) {
			scanner = new Scanner(System.in); 
	        System.out.println("Olá, informe seu nome: ");
	        String name = scanner.next();

	        System.out.println("Olá, informe sua idade: ");
	        int idade = scanner.nextInt();

	        System.out.println("Olá, "+ name + ".  " + "Sua idade é: " + idade);

	}

}
