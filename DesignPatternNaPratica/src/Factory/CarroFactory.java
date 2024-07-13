package Factory;

public class CarroFactory {

	public Carro getCarro(String tipoCarro) {
		if(tipoCarro == null) {
			return null;
		}
		
		if(tipoCarro.equalsIgnoreCase("Fusca")) {
			return new Fusca();
		}
		return null;
	}
}
