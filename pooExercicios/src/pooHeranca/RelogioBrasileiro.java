package pooHeranca;

public class RelogioBrasileiro extends Relogio{
	
	public RelogioBrasileiro(int hora, int minuto, int segundo) {
		super(hora,minuto, segundo);
	}

	public void retornarHora() {
		System.out.printf("%s : %s : %s", this.hora, this.minuto, this.segundo);
	}
	
	
	@Override
	public void converter (final Relogio relogio) {
		if (relogio instanceof RelogioAmericano) {
			RelogioAmericano americano = (RelogioAmericano)relogio;
			
			this.setMinuto(americano.getMinuto());
			this.setSegundo(americano.getSegundo());

			if ("PM".equals(americano.getPeriodo())) {
			    this.setHora(americano.getHora() + 12);
			} else {
			    this.setHora(americano.getHora());
			}

		}
	}
}
