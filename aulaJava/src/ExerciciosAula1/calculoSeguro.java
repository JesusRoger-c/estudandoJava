package ExerciciosAula1;
import java.util.Scanner;


public class calculoSeguro {
	
	private static String name;
	private static int age;
	private static  int productCar = 1;
	private static Scanner scanner;
	private static double securePackagee = 5.986;
	private static double premio;
	

	public static void main(String[] args) { 
		
		scanner = new Scanner(System.in);
		
		
		System.out.println("Seja bem-vindo ao portal da Tokio Marine");
		System.out.println("======================================== ");
		System.out.println("                         ");
		
		
		System.out.print("Digite seu nome:");
		name = scanner.next();
		
		System.out.print("Digite sua idade:");
		age = scanner.nextInt();
		
		
		
		
		
		if(age >= 18) {
		System.out.println("                   ");
		System.out.println(name + "! " + "Esse é o ambiente de cotação");
		System.out.println("========================================");
		System.out.println("                   ");
		
		
		System.out.println("Produtos escolhidos:");
		System.out.println("Carro - 1");
		System.out.print("Digite qual o seu produto:");
	
		productCar = scanner.nextInt();
		
		
		if(age >= 18 && productCar == 1) {
			
		 premio = (securePackagee * (1 - 0.23));
		 System.out.println(name + "! Seu seguro ficou em: " + premio);
			
		}else {
			
			System.out.println("Produto incorreto ");
			
		}
		
		}else {
			System.out.print(name + ", Sua idade é inferior a 18 anos");
		}
		
		
	}

}
