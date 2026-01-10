package exercicio_interface;
import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner (System.in);
	public static void main (String [] args) {

			while (true) {
			System.out.println("\n##############");
			System.out.println("Escolha uma forma geométrica a ser calculada: ");
			System.out.println("1 - Quadrado");
			System.out.println("2 - Retângulo");
			System.out.println("3 - Círculo\n");
			
			int opcao = scanner.nextInt();
			
			if (opcao == 1) {
				criarQuadrado();
			} else if (opcao == 2) {
				criarRetangulo();
			} else if (opcao == 3) {
				criarCirculo();
			} else {
				System.out.println("Opção inválida. Tente novamente.");
			}
			
			

}
	}
	
	private static void criarQuadrado() {
		System.out.println("Informe o lado do quadrado: ");
		double lado = scanner.nextDouble();
		Quadrado quadrado = new Quadrado (lado);
		System.out.printf("O quadrado tem área de %s", quadrado.calcularArea());
		
	}
	
	private static void criarRetangulo() {
		System.out.println("Informe a altura do retângulo: ");
		double altura = scanner.nextDouble();
		System.out.println("Informe a largura do retângulo: ");
		double largura = scanner.nextDouble();
		Retangulo retangulo = new Retangulo (altura, largura);
		System.out.printf("O retângulo tem área de %s", retangulo.calcularArea());
	}
	
	private static void criarCirculo() {
		System.out.println("Informe o raio do círculo: ");
		double raio = scanner.nextDouble();
		Circulo circulo = new Circulo(raio);
		System.out.println("A área do círculo é de " + circulo.calcularArea());
	}
}
	


