import java.time.LocalDate;

public class Bootcamp {
    private LocalDate dataInicial;
    private LocalDate dataFinal;
    private String nome;
    private String descricao;
    private int cargaHoraria;

    public Bootcamp(){

    }

    public Bootcamp(LocalDate dataInicial, LocalDate dataFinal, String nome, String descricao) {
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.nome = nome;
        this.descricao = descricao;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
                "\nNome = " + nome +
                "\nDescricao = " + descricao  +
                "\nCarga horária = " + cargaHoraria +
                "\nData Inicial = " + dataInicial +
                "\nData Final = " + dataFinal +
                "\n====================================\n";
    }
}
