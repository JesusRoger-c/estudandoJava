package ExerciciosAula1;
import java.time.OffsetDateTime;
import java.util.Scanner;


public class exe1_Idade {
	
	public static String name;
	public static int year; 
	public static Scanner scanner;
	public static int yearActually = OffsetDateTime.now().getYear();
	public static int age;
	
	
	
	 
	public static void main (String[] args)  {
		
		scanner = new Scanner(System.in); 
		
		System.out.println("Qual o seu primeiro nome? ");
		name = scanner.next();
		
		
		
		System.out.println("Diga seu ano de nascimento: ");
		year = scanner.nextInt();
		
		 
		age = yearActually - year;
		
		
		System.out.printf("Olá, " + name + "! você tem " + age + " anos de idade" );
		
		
		
		
		
		
		
	}

}
