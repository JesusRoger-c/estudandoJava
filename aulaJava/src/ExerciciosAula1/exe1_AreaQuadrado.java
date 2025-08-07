package ExerciciosAula1;
import java.util.Scanner;

public class exe1_AreaQuadrado {
	
	public static double area;
	public static double lado1;
	public static double lado2;
	public static Scanner scanner;
	public static String name;

	public static void main(String[] args) {
		scanner = new Scanner(System.in); 
		
		
		System.out.println("Olá, qual o seu nome? ");
		name = scanner.next();
		
		System.out.println("==============================================");
		System.out.println("   ");
		
		System.out.println("Por favor, Me informe qual é o tamanho de um dos lados");
		lado2 = scanner.nextDouble();		
		
	
		System.out.println("===============================================");
		System.out.println("   ");
		
		
		lado1 = lado2;
		area = lado1 * lado2;
		
		System.out.println(name + ", seu quadrado possui uma área de: " + area);
		
		

	}

}
