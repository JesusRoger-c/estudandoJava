package petShop;

import java.util.Scanner;
public class Main {
	

	private final  static Scanner scanner= new Scanner(System.in);
	
	private final static PetMachine petMachine = new PetMachine();

	public static void main(String[] args) {
		var menu = -1;
		
		
		do {
			System.out.println("Escolha uma das opções");
			System.out.println("========================");
			System.out.println("1 - dar banho no pet");
			System.out.println("2 - Abastecer a máquina com água");
			System.out.println("3 - Abastecer a máquina com shampoo");
			System.out.println("4 - Verificar água da máquina");
			System.out.println("5 - Verificar shampoo da máquina");
			System.out.println("6 - Verificar se tem pet no banho");
			System.out.println("7 - Colocar pet na máquina ");
			System.out.println("8 - Retirar pet da máquina");
			System.out.println("9 - Limpar a máquina");
			System.out.println("0 - Sair");
			menu = scanner.nextInt();
			
			switch(menu) {
			case 7 -> ColocaPetNaMaquina();
			
			}
			
		}while(menu != 0);

	}
	
	public static void ColocaPetNaMaquina() {
		System.out.println("Informe o nome do pet");
		var name = scanner.next();
		var pet = new pet(name);
		
		petMachine.setPet(pet);
		
		
	}

}
