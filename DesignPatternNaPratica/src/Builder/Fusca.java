package Builder;

public class Fusca {

	private String color;
	private int ano;
	private String tipoMotor;
	private boolean temPlacaPreta;
	
	public String getColor() {
		return color;
	}
	
	public int getAno() {
		return ano;
	}
	
	public String getTipoMotor() {
		return tipoMotor;
	}
	
	public boolean isTemPlacaPreta() {
		return temPlacaPreta;
	}
	
	public Fusca(FuscaBuilder fuscaBuilder) {
		this.color = fuscaBuilder.color;
		this.ano = fuscaBuilder.ano;
		this.tipoMotor = fuscaBuilder.tipoMotor;
		this.temPlacaPreta = fuscaBuilder.temPlacaPreta;
	}

	//Builder Class static
	public static class FuscaBuilder {
		
		private String color;
		private int ano;
		private String tipoMotor;
		private boolean temPlacaPreta;
		
		public FuscaBuilder color(String color) {
			this.color = color;
			return this;
		}
		
		public FuscaBuilder ano (int ano) {
			this.ano = ano;
			return this;
		}
		
		public FuscaBuilder tipoMotor(String tipoMotor) {
			this.tipoMotor = tipoMotor;
			return this;
		}
		
		public FuscaBuilder temPlacaPreta(boolean temPlacaPreta) {
			this.temPlacaPreta = temPlacaPreta;
			return this;
		}
		
		public Fusca build() {
			return new Fusca(this);
		}
	}
}
