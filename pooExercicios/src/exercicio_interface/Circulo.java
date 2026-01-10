package exercicio_interface;

public record Circulo(double raio) implements Area{
	
	private static final double pi = 3.14;

	@Override
	public double calcularArea() {
		return pi * (raio * raio);  
	}
}
