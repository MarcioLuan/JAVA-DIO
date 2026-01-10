package exercicio_encapsulamento;
import java.util.Scanner;

public class Conta {
	private final String nome;
	private double saldo;
	private double chequeEspecial;
	private double chequeEspecialInicial;
	private double limite;
	private double debitoChequeEspecial;
	Scanner scanner = new Scanner(System.in);
	
	public Conta(String nome, int saldo){
		this.nome = nome;
		this.saldo = saldo;
		
		if (saldo <= 500) {
			this.chequeEspecial = 50.00;
		} else if (saldo > 500) {
			this.chequeEspecial = (saldo * 0.5);
		}
		this.chequeEspecialInicial = this.chequeEspecial;
		this.debitoChequeEspecial = this.chequeEspecialInicial - this.chequeEspecial;
		this.limite = saldo + chequeEspecial;
		
		System.out.printf("Conta criada com sucesso!\nTitular: %s\nSaldo: %s\n", this.nome, this.saldo);
		
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public double getChequeEspecial() {
		return this.chequeEspecial;
	}
	
	public double getLimite() {
		return this.limite;
	}
	
	public void informar() {
		System.out.printf("Olá, %s!\n", this.nome);
	}
	
	public void consultarSaldo() {
		informar();
		System.out.println("Saldo: " + this.saldo);
	}
	
	public void consultarChequeEspecial() {
		informar();
		System.out.println("Cheque especial: " + this.chequeEspecial);
	}
	
	public void depositar() {
		informar();
		System.out.println("Informe o valor a ser depositado: ");
		double deposito = scanner.nextDouble();
		
		if (deposito > 0) {
			if (chequeEspecial < chequeEspecialInicial) {
			double taxaCobrancaChequeEspecial = debitoChequeEspecial * 0.2;
			double usoChequeEspecial = debitoChequeEspecial + taxaCobrancaChequeEspecial;
			
				if (deposito < usoChequeEspecial) {
					double pagamentoChequeEspecial = usoChequeEspecial - deposito;
					debitoChequeEspecial = pagamentoChequeEspecial;
					System.out.println("Seu depósito pagou parte do cheque especial!");
				
				} else if (deposito == usoChequeEspecial) {
					System.out.println("Seu depósito pagou parte do cheque especial!");
					this.chequeEspecial = deposito - taxaCobrancaChequeEspecial;
					
				} else {
					deposito = deposito - usoChequeEspecial;
					this.chequeEspecial = this.debitoChequeEspecial;
					this.saldo += deposito;
				}
			
			
			} else {
				this.saldo += deposito;	
			}
			consultarSaldo();
		
		} else {
			System.out.print("O valor a ser depositado deve ser positivo!!");
		}
		}
		
	public void sacar() {
		informar();
		System.out.println("Informe o valor a ser sacado: ");
		double saque = scanner.nextDouble();
		
		if (saque <= this.saldo) {
			this.saldo -= saque;
			System.out.println("Saque realizado com sucesso.");
			consultarSaldo();
			
		} else if (saque > this.saldo && saque <= this.limite) {
			saque -= this.saldo;
			this.chequeEspecial -= saque;
			System.out.println("Você realizou o saque, porém gastou seu cheque especial.");
			consultarChequeEspecial();
			
		} else {
			System.out.println("Seu limite é de apenas " + this.limite);
			System.out.println("Saque não concluido!");
		}
	}
	
	
}
