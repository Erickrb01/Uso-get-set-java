package lista3;

public class Main {

	public static void main(String[] args) {
		
		Animal gato = new Animal();
			gato.setanimal("gato");
		    gato.setnomeAnimal("frajola");
			gato.settipoAnimal("mamifero");
			gato.setcor("preto e branco");
			gato.setraca("Siames");
			
			System.out.println(gato.getanimal());
			System.out.println(gato.getnomeAnimal());
			System.out.println(gato.gettipoAnimal());
			System.out.println(gato.getcor());
			System.out.println(gato.getraca()+"\n");
			
		Animal cachorro = new Animal();
			cachorro.setanimal("cachorro");
			cachorro.setnomeAnimal("scoobydoo");
			cachorro.settipoAnimal("mamifero");
			cachorro.setcor("marrom");
			cachorro.setraca("labrador");
			
			System.out.println(cachorro.getanimal());
			System.out.println(cachorro.getnomeAnimal());
			System.out.println(cachorro.gettipoAnimal());
			System.out.println(cachorro.getcor());
			System.out.println(cachorro.getraca()+"\n");
			
		Animal passaro = new Animal();
			passaro.setanimal("pássaro");
			passaro.setnomeAnimal("piu piu");
			passaro.settipoAnimal("Oviparo");
			passaro.setcor("amarelo");
			passaro.setraca("canario");
			
			System.out.println(passaro.getanimal());
			System.out.println(passaro.getnomeAnimal());
			System.out.println(passaro.gettipoAnimal());
			System.out.println(passaro.getcor());
			System.out.println(passaro.getraca());
	}

}
