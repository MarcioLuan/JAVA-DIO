package aula2;
import java.util.Scanner;

public class exercicios_for_while_dowhile {
	public static void main (String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe um número: ");
		double number = scanner.nextDouble();
		String message = "";
		
		while (number != 0) {
			if (number < 0) {
				message = "Você digitou um número negativo!";
			}else if (number > 0) {
				message = "Você digitou um número positivo!";
			}
			
			System.out.println(message);
			System.out.println("Informe um número: ");
			number = scanner.nextDouble();
		}
		
		System.out.println("Programa encerrado!");
		
		
	}
}
