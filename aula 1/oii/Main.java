import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Fazendo comentário de uma linha
        /*
        Comentario de mais de 1 linha
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Diga seu nome: ");
        String name = scanner.next();

        System.out.print("Informe sua idade: ");
        int idade = scanner.nextInt();
        System.out.printf("Olá %s sua idade é %s anos\n", name, idade);



    }
}
 