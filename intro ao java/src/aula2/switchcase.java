package aula2;

import java.util.Scanner;

public class switchcase {
	public static void main (String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe a opção: ");
		var option = scanner.nextInt();
		
		var message = switch (option) {
			case 1-> "aa";
			case 2 -> "bb";
			default -> "uuu";
		};
		
		System.out.print(message);
		
		
		
		
	}
}
