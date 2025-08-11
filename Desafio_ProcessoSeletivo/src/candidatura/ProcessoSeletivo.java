package candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		System.out.println("PROCESSO SELETIVO");
		

	}
	
	static void selecaoCandidatos() {
		String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"}; 
	    int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		while(candidatosSelecionados < 5) {
			String candidato = candidatos[candidatoAtual];
			double salarioSugerido = valorPretendido(); 
			
			System.out.println("O candidato " + candidato + "Solicitou este valor de salario:" + salarioSugerido);
		}
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800,2200);
	}
	
	
	
	
	
	
	//Metodo para analisar caso 
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		
		if(salarioBase > salarioPretendido) {
			System.out.println("Ligar para o candidato");
		}else if(salarioBase == salarioPretendido) {
			System.out.println("Ligar para o candidato com contra proposta");
			
		}else  {
			System.out.println("Aguardando demais candidatos");
			
		}
	}

}
