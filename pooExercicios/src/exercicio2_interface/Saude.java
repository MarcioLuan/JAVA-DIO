package exercicio2_interface;

public record Saude(double valor) implements Imposto{
	public  double calcularImposto() {
		double porcentagemImposto = 0.015;
		return porcentagemImposto * valor;
	}

}
