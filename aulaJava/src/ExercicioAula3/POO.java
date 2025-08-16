package ExercicioAula3;

import java.util.Scanner;

public class POO {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		var pessoa = new Pessoa();
		pessoa.setName("Roger");  
		pessoa.setIdade(20);
		
		
		System.out.println("Olá, " + pessoa.getName() + "! Você tem atualmente: " + pessoa.getIdade() + " anos!");

	}

}
