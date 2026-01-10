package exercicio2_interface;
import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	public static void main (String []args) {
		
		while (true) {
			System.out.println("#####################");
			System.out.println("Informe o tipo de imposto que você quer calcular: ");
			System.out.println("1 - Alimentação");
			System.out.println("2 - Saúde");
			System.out.println("3 - Vestuário");
			System.out.println("4 - Cultura");
			
			int opcao = scanner.nextInt();
			
			if (opcao == 1) {
				calcularAlimentacao();
			} else if (opcao == 2) {
				calcularSaude();
			} else if (opcao == 3) {
				calcularVestuario();
			} else if (opcao == 4) {
				calcularCultura();
			} else {
				System.out.println("Opção inválida! Tente novamente.");
			}
		}
	}

	
	public static void calcularAlimentacao() {
		System.out.println("Informe o valor gasto em alimentação: ");
		double valor = scanner.nextDouble();
		Alimento alimento = new Alimento(valor);
		System.out.println("O valor a ser pago em imposto é de R$ " + alimento.calcularImposto());
	}
	
	public static void calcularSaude() {
		System.out.println("Informe o valor gasto em Saúde e bem estar: ");
		double valor = scanner.nextDouble();
		Saude saude = new Saude(valor);
		System.out.println("O valor gasto em imposto foi de R$" + saude.calcularImposto());		
	}
	
	public static void calcularVestuario() {
		System.out.println("Informe o valor gasto em vestuário: ");
		double valor = scanner.nextDouble();
		Vestuario vestuario = new Vestuario(valor);
		System.out.println("O valor a ser pago em imposto é de R$ " + vestuario.calcularImposto());
	}
	
	public static void calcularCultura() {
		System.out.println("Informe o valor gasto em Cultura: ");
		double valor = scanner.nextDouble();
		Cultura cultura = new Cultura(valor);
		System.out.println("O valor a ser pago em imposto foi de R$" + cultura.calcularImposto());		
	}
}
