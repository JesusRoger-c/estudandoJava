package ExerciciosAula2;
import java.util.Scanner;



public class LacoWhile {
	
	private static String name =  "";
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(!name.equals("exit")) {
			
			System.out.println("Digite um nome: ");
			name = scanner.next();
			
			System.out.println(name);
			
		}
		

	}

}
