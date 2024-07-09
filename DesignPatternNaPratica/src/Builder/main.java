package Builder;

public class main {

	public static void main(String[] args) {
		
		Fusca fusca = new Fusca.FuscaBuilder()
						.color("Branco lotus")
						.ano(1975)
						.tipoMotor("1300")
						.temPlacaPreta(true)
						.build();
		
		System.out.println("Cor: " + fusca.getColor());
		System.out.println("Ano: " + fusca.getAno());
		System.out.println("Tipo motor: " + fusca.getTipoMotor());
		System.out.println("Tem placa preta: " + (fusca.isTemPlacaPreta() ? "Sim" : "Não"));
	}

}
