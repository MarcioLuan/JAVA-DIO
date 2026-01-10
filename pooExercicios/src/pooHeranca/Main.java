package pooHeranca;

public class Main {

	public static void main(String[] args) {
		RelogioBrasileiro relogio = new RelogioBrasileiro(14, 20, 30);
		RelogioAmericano clock = new RelogioAmericano(20, 30, 40);
		relogio.retornarHora();
		clock.retornarHora();
		clock.converter(null);

	}

}
