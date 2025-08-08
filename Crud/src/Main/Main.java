package Main;
import java.util.Scanner;

import br.com.dio.dao.UserDAO;
import br.com.dio.dao.Model.MenuOption;

public class Main {
	
	private final static UserDAO dao = new UserDAO();
	
	
	public static void main (String[] args) {
		var scanner = new Scanner(System.in);
		
		System.out.println("Seja Bem-vindo ao cadastro de usuários!");
		System.out.println("========================================");
		System.out.println("                                        ");
		
		
		System.out.println("Selecione a operação desejada: ");
		System.out.println("1 - Cadastrar");
		System.out.println("2 - Atualizar");
		System.out.println("3 - Excluir");
		System.out.println("4 - Buscar");
		System.out.println("5 - Listar");
		System.out.println("6 - Sair");
		
		var input = scanner.nextInt();
		
		
		
		while(true) {
			var opcaoSelecionada = MenuOption.values()[input - 1];
			
			
			//if(opcaoSelecionada == EXIT)
			
			
		}
		
	}
	
	//private static void 

}
