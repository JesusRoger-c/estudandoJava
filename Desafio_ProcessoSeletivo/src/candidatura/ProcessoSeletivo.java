package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		System.out.println("PROCESSO SELETIVO");
		
		String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
		for(String candidato: candidatos) {
			EntrarEmContato(candidato);
			
		}
		

	}
	
	//metodo entrar em contato
	static void EntrarEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean ContinuaTentando = true;
		boolean Atendeu = false;
		
		do {
			Atendeu = atender();
			ContinuaTentando = !Atendeu;
			if(ContinuaTentando) {
				tentativasRealizadas++;
			}else {
				System.out.println("CONTATO REALIZADO COM SUCESSO!!!");
			}
			
		}while(ContinuaTentando && tentativasRealizadas < 3); 
		
		if(Atendeu) {
			System.out.println("CONSEGUIMOS CONTATO COM A(O) " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
		}else {
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MÁXIMO DE TENTATIVAS " + tentativasRealizadas + " REALIZADAS");
		}
		
	}
	
	//metodo auxiliar 
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}
	
	static void imprimirSelecionados() {
		String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
		System.out.println("Imprimindo a lista de selecionados, informando o indice do elemento.");
		
		for(int indice=0; indice < candidatos.length; indice++) {
			System.out.println("O candidato de numero " + (indice+1) + " é o (a)" + candidatos[indice]);
			
		}
		
	}
	
	
	
	
	
	
	//Selecionar colaborador
	static void selecaoCandidatos() {
		String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"}; 
	    int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioSugerido = valorPretendido(); 
			
			System.out.println("O candidato " + candidato + " Solicitou este valor de salario:" + salarioSugerido);
			if(salarioBase >= salarioSugerido) {
				System.out.println("O candidato: " + candidato + " foi selecionado para a vaga.");
				candidatosSelecionados++;
			}
			candidatoAtual++;
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
