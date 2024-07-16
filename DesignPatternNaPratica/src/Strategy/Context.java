package Strategy;

public class Context {
	
	private Strategy strategy;
	
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	// Método para alterar a Strategy em tempo de execução
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	// Método que usa a estrégia atual
	public void executeStrategy() {
		strategy.execute();
	}
}
