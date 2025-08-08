package ExerciciosAula2;

import java.util.Scanner;

public class Tabuada {

  public static void main(String[] args) {
	  
	   Scanner scanner = new Scanner(System.in);
	   int valor;
	   
	   System.out.print("Digite o valor: ");
	   valor = scanner.nextInt();	
	   System.out.println("             ");
	   
	   
	   System.out.println("Tabuada do " + valor);
	   System.out.println("             ");


   for(int i = 1;i <= 10; i++) {
	   
	   int result = valor * i;
	   System.out.println(valor + " x " + i + " = " + result);
   }
   
   
   scanner.close();

	}

}
