package Singleton;

public class Singleton {

	//Instancia static e private
	private static Singleton uniqueInstance;
	
	//Contrutor sempre privado
	private Singleton() {
	}
	
	/*
	 * Unico metodo public.
	 * 
	 * Metodo static para fornecer acesso global
	 */
	public static Singleton getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
	
	//Para teste
	public void printMessage() {
		System.out.println("Funcionou Singleton");
	}
}
