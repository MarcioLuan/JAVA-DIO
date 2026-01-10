package pooHeranca;

public abstract class Relogio {
	protected int hora;
	protected int minuto;
	protected int segundo;
	
	
	public Relogio (int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public int getHora() {
		return this.hora;
	}
	
	public void setHora(int hora) {
		if (hora >= 24) {
			this.hora = 23;
		} else if (hora <= 0) {
			this.hora = 0;
		} else {
			this.hora = hora;
		}
	}
	
	public int getMinuto() {
		return this.minuto;
	}
	
	public void setMinuto(int minuto) {
		if (minuto >=59) {
			this.minuto = 59;
		} else if (minuto <= 0) {
			this.minuto = 0;
		} else {
			this.minuto = minuto;
		}
		

	}
	
	public int getSegundo(){
		return this.segundo;
	}
	
	public void setSegundo(int segundo) {
		if (segundo >=59) {
			this.segundo = 59;
		} else if (segundo <= 0) {
			this.segundo = 0;
		} else {
			this.segundo = segundo;
		}

	}
	
	abstract public void converter (Relogio relogio);

}
