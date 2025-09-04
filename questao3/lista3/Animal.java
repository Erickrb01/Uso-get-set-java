package lista3;

public class Animal {

	String nomeAnimal;
	String animal;
	String tipoAnimal;
	String cor;
	String raca;
	int quantidade;
	
	
	public void setnomeAnimal(String nomeAnimal) {
		
		this.nomeAnimal= nomeAnimal; 
	}
	
	public void settipoAnimal(String tipoAnimal) {
		
		
		this.tipoAnimal= tipoAnimal;
	}
	
	public void setcor(String cor) {
		
		this.cor= cor;
	}
	
	public void setraca(String raca) {
		
		this.raca = raca;
	}
	
	public void setquantidade(int quantidade) {
		
		this.quantidade = quantidade;
	}
	
	
	public String getnomeAnimal() {
		
		return nomeAnimal;
	}
	
	public String gettipoAnimal() {
		
		return tipoAnimal;
	}
	
	public String getcor() {
		
		return cor;
	}
	
	public String getraca() {
		
		return raca;
	}
	
	public int getquantidade() {
		
		return quantidade;
	}
	
	public void setanimal(String animal) {
		
		this.animal= animal; 
	}
	
public String getanimal() {
		
		return animal;
	}
	
	
}
