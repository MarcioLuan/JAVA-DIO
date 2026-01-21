package Domain;

import java.time.LocalDate;

public class Bootcamp extends Conteudo{
    private LocalDate dataInicial;
    private LocalDate dataFinal;
    private int cargaHoraria;

    public Bootcamp(){

    }


    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(LocalDate dataInicial) {
        this.dataInicial = dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }


    @Override
    public double calcularXp() {
        return XP_PADRAO + 50;
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Bootcamp" +
                "\nNome = " + getTitulo() +
                "\nDescrição = " + getDescricao()  +
                "\nCarga horária = " + getCargaHoraria() +
                "\nData Inicial = " + getDataInicial() +
                "\nData Final = " + getDataFinal() +
                "\n====================================\n";
    }
}
