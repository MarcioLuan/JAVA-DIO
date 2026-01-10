package exercicio2_interface;

public record Vestuario(double valor) implements Imposto {
	public double calcularImposto() {
		double porcentagemImposto = 0.025;
		return porcentagemImposto * valor;
	}
	
	

}
