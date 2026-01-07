package aula2;
import java.util.Scanner;

public class aula2dio {

	public static void main (String [] args) {
		while (1 > 0){
			Scanner scanner = new Scanner(System.in);
			int classificationPoint = 0;
			
			System.out.println("Você telefonou para vítima? (0- não | 1- sim)");
			int called = scanner.nextInt();
			
			if (called == 1){
				classificationPoint++;
			}
			
			System.out.println("Você esteve no local do crime? (0- não | 1- sim)");
			int beenThere = scanner.nextInt();
			
			if (beenThere == 1) {
				classificationPoint++;
			}
			
			System.out.println("Você mora perto da vítima? (0- não | 1- sim)");
			int liveNear = scanner.nextInt();
			
			if (liveNear == 1) {
				classificationPoint++;
			}
			
			System.out.println("Você trabalhava com a vítima? (0- não | 1- sim)");
			int workWith = scanner.nextInt();
			
			if (workWith == 1) {
				classificationPoint++;
			}
			
			if (classificationPoint == 0){
				System.out.println("Você é inocente");
			} else if (classificationPoint > 0 && classificationPoint < 3){
				System.out.println("Você é suspeito");
			} else if (classificationPoint >= 3 && classificationPoint < 4){
				System.out.println("Você é cúmplice");
			} else{
				System.out.println("Você está preso em nome da lei!!");
			}
		
		}

	}

}
