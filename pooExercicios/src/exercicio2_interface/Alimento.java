package exercicio2_interface;

public record Alimento(double valor) implements Imposto {
	public double calcularImposto() {
		double porcentagemImposto = 0.01;
		return porcentagemImposto * valor;
	}
	

}
