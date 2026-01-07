import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Informe o seu nome:");
        String name = scanner.next();

        System.out.println("Informe a sua idade:");
        int age = scanner.nextInt();

        boolean canDrive = age >= 18;

        System.out.printf("Seu nome é %s e tem %s anos\n", name, age);
        System.out.printf("Você pode dirigir? %s", canDrive);

    }

}
