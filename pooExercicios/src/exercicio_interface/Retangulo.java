package exercicio_interface;

public record Retangulo(double altura, double largura) implements Area{
	
	@Override
	public double calcularArea() {
		return altura * largura;
		
	}
	
}
