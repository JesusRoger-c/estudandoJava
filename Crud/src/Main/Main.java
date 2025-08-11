package Main;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import br.com.dio.dao.UserDAO;
import br.com.dio.dao.Exception.EmptyStorageException;
import br.com.dio.dao.Exception.UserNotFoundException;
import br.com.dio.dao.Model.MenuOption;
import br.com.dio.dao.Model.UserModel;

public class Main {
	
	private final static UserDAO dao = new UserDAO();
	private final static Scanner scanner = new Scanner(System.in);
	
	
	
	public static void main (String[] args) {
		
		
		while(true) {
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
			//Runnable runneble = () -> System.out.println("teste");
			var opcaoSelecionada = MenuOption.values()[input - 1];
			
			
			//Validador de caso e executor para cada questão 
			switch(opcaoSelecionada) {
			
				case SAVE -> {
					var user = requestUserInfo();
					dao.save(user);
					System.out.println("SALVO");
					
			     }
				
				case UPDATE -> {
					try {
					var user = dao.upDate(requestUserUpDate());
					System.out.println("ATUALIZADO");
					}catch (UserNotFoundException | EmptyStorageException ex) {
						System.out.println(ex.getMessage());
					}
				}
				
				
				case DELETE -> {
					 try {
					 dao.delete(requestId());
					 System.out.println("EXCLUIDO");
					 }catch (UserNotFoundException | EmptyStorageException ex) {
							System.out.println(ex.getMessage());
						}
				}
				
				
				case FIND_BY_ID -> {
					try {
					  var id = requestId();
					  var user = dao.findById(id);
					  System.out.printf("Cadastrado %s", id);
					  System.out.println(user);
					
					}catch (UserNotFoundException | EmptyStorageException ex) {
						System.out.println(ex.getMessage());
					}
						
					}
				
				case FIND_ALL -> {
					var users = dao.findAll();
					System.out.println("");
					users.forEach(System.out::println);
					
				}
				
				case EXIT -> {
					System.exit(0);
					System.out.println("Saiu!");
				}
					
		    }
					
				
	  }
				
}
			
				
			
			
		//Metodo do delete
	   private static long requestId() {
		   System.out.print("Informe o id do usuário: ");
			return scanner.nextLong();
	    }
		   

		
	 
	   //Metodo para save
	   private static UserModel requestUserInfo(){
		
		System.out.print("Informe o nome do usuário: ");
		var name = scanner.next();
		
		System.out.print("Informe o email do usuário: ");
		var email = scanner.next();
		
		System.out.print("Informe a data de nascimento do usuário (dd/MM/aaaa): ");
		var aniversario = scanner.next();
		
		var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //DateTimeFormatter
		var aniversarioData = LocalDate.parse(aniversario, formatter);
		
		return new UserModel(0, name, email, aniversarioData);
	
	   }
	    
		//Metodo para update 
		 private static UserModel requestUserUpDate(){
				
		System.out.print("Informe o id do usuário: ");
		var id = scanner.nextLong();
		
		System.out.print("Informe o nome do usuário: ");
		var name = scanner.next();
				
		System.out.print("Informe o email do usuário: ");
		var email = scanner.next();
				
		System.out.print("Informe a data de nascimento do usuário (dd/mm/aaaa): ");
		var aniversario = scanner.next();
				
		var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //DateTimeFormatter
		var aniversarioData = LocalDate.parse(aniversario, formatter);
				
		return new UserModel(id, name, email, aniversarioData);
		
	
	
	}
	
	

}
