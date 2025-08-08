package ExerciciosAula2;
import java.util.Scanner;


public class LacoFor {
	
	private static String name;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0;i<= 100;i++) {
			System.out.println(i);
			
			if(i == 100){
			System.out.println("Processo finalizado!");
			break;	
			
			}
			
					
			
		}
	}

}
