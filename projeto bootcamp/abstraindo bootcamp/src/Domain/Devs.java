package Domain;
import java.util.HashSet;
import java.util.Set;

public class Devs {

    private String nome;
    private double xp = 0;
    private final Set<Mentorias> mentorias = new HashSet<>();
    private final Set<Atividades> atividades= new HashSet<>();
    private final Set<Bootcamp> bootcamps= new HashSet<>();

    public Devs(String nome) {
        this.nome = nome;
    }

    public Devs() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getXp() {
        return xp;
    }

    public Set<Mentorias> getMentorias() {
        return mentorias;
    }

    public Set<Atividades> getAtividades() {
        return atividades;
    }

    public Set<Bootcamp> getBootcamps() {
        return bootcamps;
    }

    public void inscreverBootcamp(Bootcamp bootcamp){
        bootcamps.add(bootcamp);
        System.out.printf("Inscrição no Bootcamp %s concluída com sucesso\n", bootcamp.getTitulo());
    }

    public void finalizarAtividade (Atividades atividade){
        atividades.add(atividade);
        xp = xp + atividade.calcularXp();
        System.out.printf("Atividade %s concluída\n", atividade.getTitulo());
    }

    public void finalizarMentoria (Mentorias mentoria){
        mentorias.add(mentoria);
        xp = xp + mentoria.calcularXp();
        System.out.printf("Mentoria %s realizada com sucesso\n", mentoria.getTitulo());
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() +
                "\nXp : " + getXp() +
                "\nMentorias=" + getMentorias() +
                "\natividades=" + getAtividades() +
                "\nbootcamps=" + getBootcamps() +
                '}';
    }
}
