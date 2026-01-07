package aula2;
import java.util.Scanner;

public class maior_e_menor_numero {
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		double number;
		double maior = 0;
		double menor = 200;
		int i;
		
		
		
		for (i = 0; i < 5; i++) {
			System.out.println("Informe um número: ");
			number = scanner.nextDouble();
			
			if (number > maior) {
				maior = number;
			} else if (number < menor) {
				menor = number;
			}

			
		}
		System.out.printf("O programa foi executado %s vezes\n", i);
		System.out.println("O maior número foi " + maior);
		System.out.println("O menor número foi: " + menor);
		
	}
	
	
}
