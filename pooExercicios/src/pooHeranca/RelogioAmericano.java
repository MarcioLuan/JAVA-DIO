package pooHeranca;

public class RelogioAmericano extends Relogio{
	private String periodo;
	
	public RelogioAmericano(int hora, int minuto, int segundo){
		super(hora, minuto, segundo);
		
		if (hora < 12) {
			this.periodo = "AM";
		} else if (hora >= 12) {
			this.periodo = "PM";
		}
		
		
		
		if (hora > 12 && hora < 25) {
			this.hora = hora - 12;
		} else if (hora > 24) {
			this.hora = 0;
		}
	}
	
	public String getPeriodo() {
		return this.periodo;
	}
	
	@Override
	public void converter (final Relogio relogio) {

	}
	
	public void retornarHora() {
		System.out.printf("%s : %s : %s  %s", this.hora, this.minuto, this.segundo, this.periodo);
	}
}
