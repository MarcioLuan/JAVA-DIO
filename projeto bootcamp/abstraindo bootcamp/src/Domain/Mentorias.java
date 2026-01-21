package Domain;

import java.time.LocalDate;

public class Mentorias extends Conteudo{

    private LocalDate dataMentoria;


    public Mentorias() {
    }



    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
    }


    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "Mentorias:\n" +
                "Título: " + getTitulo() +
                "\nDescrição: " + getDescricao() +
                "\nData Mentoria: " + getDataMentoria()+
                "\n====================================\n";
    }
}
