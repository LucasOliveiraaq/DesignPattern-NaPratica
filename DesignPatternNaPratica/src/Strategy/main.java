package Strategy;

public class main {

	public static void main(String[] args) {
		
		//Cria a estratégias
		Strategy strategyA = new ConcreteStrategyA();
		Strategy strategyB = new ConcreteStrategyB();
		
		//Contexto
		Context context = new Context(strategyA);
		context.executeStrategy();
		
		context.setStrategy(strategyB); //alterando em tempo de execução.
		context.executeStrategy();
	}

}
