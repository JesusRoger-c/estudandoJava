package petShop;

public class PetMachine {
	
	private boolean clean;
	private int water;
	private int shampoo;
	private pet pet;
	
	
	
	//Método que verifica se o pet tomou banho ou não e retorna uma mensagem 
	public void takeShower() {
		if(this.pet == null) {
			System.out.println("Coloque o pet na máquina para iniciar o banho :) ");
			return;
		}else {
			this.water -= 10;
			this.shampoo -= 2;
			pet.setClean(true);
			System.out.println("O pet " + pet.getName() +" está limpo");
		}
		
	}
		
	//Método para verificar a capacidade de água 
	public void addAgua(){
		if(water == 30) {
	    System.out.println("A capacidade de água na máquina está no máximo! ");
	    return;
		}else {
			
			water += 2;
			
		}
	
	}
	
	
	//Método para verificar shampoo
		public void addShampoo(){
			if(shampoo == 10) {
		    System.out.println("A capacidade de shampoo na máquina está no máximo! ");
		    return;
			}else {
				
				shampoo += 2;
				
			}
		
		}
        
		//Metodo get de água e shampoo
		public int getWater() {
			return water;
		}


		public int getShampoo() {
			return shampoo;
		}

	
	
		//Método que verifica se há pet no banho 
		public boolean hasPet() {
			return pet != null;
		}
		
		
		//Método que coloca os pets na máquina para banha-los 
		public void  setPet (pet pet) {
			//verifica se a maquina está limpa antes do banho do pet 
			if(!this.clean) {
				System.out.println("A máquina está suja, para colocar o pet é necessário limpa-la :)");
				return;
			}
			if(hasPet()) {
				System.out.println("O pet" + this.pet.getName() + " está na máquina nesse momento! " );
				return;
			}
			this.pet = pet;
		}
		
		
		
		
		//Método que remove o pet 
		public void removePet() {
			this.clean = this.pet.isClean();
			System.out.println("O pet " + this.pet.getName() + " está limpo! ");
			this.pet = null;
		}
		
		
		public void wash() {
			this.water -= 10;
			this.shampoo -= 2;
			this.clean = true;
			System.out.println("A máquina está limpa");
			
		}
			
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


