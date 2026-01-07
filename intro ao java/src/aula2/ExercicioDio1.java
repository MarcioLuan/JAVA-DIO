package aula2;
import java.util.Scanner;
public class ExercicioDio1 {
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe a idade do primeiro usuário: ");
		int ageOne = scanner.nextInt();
		
		System.out.println("Informe a idade do segundo usuário: ");
		int ageTwo = scanner.nextInt();
		
		int ageDifference = (ageOne - ageTwo);
		
		if (ageDifference<0) {
			ageDifference = ageDifference * -1;
		}
		
		System.out.printf("A diferença de idades é de %s anos", ageDifference);
		
		
		
		
	}

}
