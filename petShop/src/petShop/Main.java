package petShop;

import java.util.Scanner;
public class Main {
	

	private final  static Scanner scanner= new Scanner(System.in);
	
	private final static PetMachine petMachine = new PetMachine();

	public static void main(String[] args) {
		//Responsável por permitir que use espaço na resposta no
		scanner.useDelimiter("\\n");
	
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
			case 0 -> System.exit(0);
			case 1 -> petMachine.takeShower();
			case 2 -> setWater();
			case 3 -> setShampoo();
			case 4 -> verifyWater();
			case 5 -> verifyShampoo();
			case 6 -> checkIfHasPetInMachine();
			case 7 -> ColocaPetNaMaquina();
			case 8 -> petMachine.removePet();
			case 9 -> petMachine.wash();
			default -> System.out.println("Opção inválida");
			
			}
			
		}while(true);

	}
	
	
	
	
	
	private static void setWater() {
		System.out.println("Tentando colocar água na máquina");
		petMachine.addAgua();
	}
	
	private static void setShampoo() {
		System.out.println("Tentando colocar shampoo na máquina");
		petMachine.addShampoo();
	}
	
	private static void verifyWater() {
		var amout = petMachine.getWater();
		System.out.println("A máquina está com " + amout +" litro(s) de água");
	}

	private static void verifyShampoo() {
		var amout = petMachine.getShampoo();
		System.out.println("A máquina está com " + amout +" litro(s) de shampoo");
	}

	private static void checkIfHasPetInMachine() {
		var hasPet = petMachine.hasPet();
		System.out.println(hasPet ? " Tem pet na máquina" : "Não tem pet na máquina");
	}
	
	public static void ColocaPetNaMaquina() {
		var name = "";
		
		//Condicional para validação
		while(name == null ||name.isEmpty() ) {
			
		System.out.println("Informe o nome do pet");
		name = scanner.next();
		}
		
		
		var pet = new pet(name);
		petMachine.setPet(pet);
		System.out.println("O Pet: " + pet.getName() + "! Foi colocado na máquina");
		
	}
	
	


}
