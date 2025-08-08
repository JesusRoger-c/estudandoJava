import java.util.Scanner;

public class ContaTerminal {
	
	
	private static String nomeCliente;
	private static int numeroConta;
	private static String agencia;
	private static double saldo = 2.869;
	private static Scanner scanner;
	

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		System.out.println("BANCO DO DEV");
		System.out.println("                            ");
		
		System.out.print("Digite seu nome: ");
		nomeCliente = scanner.next();
		
		System.out.print("Digite o número da agencia: ");
		numeroConta = scanner.nextInt();
		
		System.out.print("Digite a sua agencia: ");
		agencia = scanner.next();
		System.out.println("                            ");
		
		System.out.println("BEM VINDO(A) " + nomeCliente);
		System.out.println("                            ");
		
		
		System.out.println("Seu saldo é: " + saldo);
		
		
		
		
		
    
	}

}
