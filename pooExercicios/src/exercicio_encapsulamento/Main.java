package exercicio_encapsulamento;
import java.util.Scanner;


public class Main {
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		Conta conta1 = new Conta("Luan", 5000);
	
		while (true) {
			System.out.println("\n###################################");
			System.out.println("Selecione a opção desejada: ");
			System.out.println("1 - Saldo\n2 - Consultar cheque especial ");
			System.out.println("3 - Depositar\n4 - Sacar\n5 - Pagar boleto\n0 - Sair ");
			int opcao = scanner.nextInt();
			
			if (opcao == 0) {
				break;
			} else if (opcao == 1) {
				conta1.consultarSaldo();
			} else if (opcao == 2) {
				conta1.consultarChequeEspecial();
			} else if (opcao == 3) {
				conta1.depositar();
			} else if (opcao == 4) {
				conta1.sacar();
			}
		}
	}
}
