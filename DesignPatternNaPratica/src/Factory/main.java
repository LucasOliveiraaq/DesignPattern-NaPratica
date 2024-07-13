package Factory;

public class main {

	public static void main(String[] args) {
		
		CarroFactory carroFactory = new CarroFactory();
		
		Carro carro = carroFactory.getCarro("Fusca");
		carro.dirigir();
	}

}
