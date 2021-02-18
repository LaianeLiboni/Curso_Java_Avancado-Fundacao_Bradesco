package Animal;

public class TesteAnimal {

	public static void main(String[] args) {
		
		System.out.println("O som dos meus animais!");
		
		Gato meuGato = new Gato();
		System.out.println("Meu gato faz");
		meuGato.som();
		
		Sapo meuSapo = new Sapo();
		System.out.println("Meu sapo faz");
		meuSapo.som();
		
		Galinha minhaGalinha = new Galinha();
		System.out.println("Minha galinha faz");
		minhaGalinha.som();
		
		
		

	}

}
