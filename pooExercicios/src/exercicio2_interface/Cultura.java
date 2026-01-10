package exercicio2_interface;

public record Cultura(double valor) implements Imposto {
	
	public double calcularImposto() {
		double porcentagemImposto = 0.04;
		return porcentagemImposto * valor;		
	}

}
