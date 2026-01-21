package Domain;

public class Atividades extends Conteudo{

    private int cargaHoraria;



    public Atividades() {
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {

        return XP_PADRAO + 10d;
    }

    @Override
    public String toString() {
        return "Atividades: \n" +
                "Título: " + getTitulo() +
                "\nDescrição: " + getDescricao() +
                "\nCarga Horária=" + getCargaHoraria() +
                "\n====================================\n";
    }
}
