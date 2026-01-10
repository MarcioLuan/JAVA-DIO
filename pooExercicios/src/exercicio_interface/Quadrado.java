package exercicio_interface;

public record Quadrado(double lado) implements Area{
	
	@Override
	public double calcularArea() {
		return lado * lado;
	}
}
