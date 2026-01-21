import Domain.Atividades;
import Domain.Bootcamp;
import Domain.Devs;
import Domain.Mentorias;

import java.time.LocalDate;

public class Main {
    public static void main (String[] args){
        Bootcamp curso1 = new Bootcamp();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso de Java");
        curso1.setCargaHoraria(54);

        Bootcamp curso2 = new Bootcamp();
        curso2.setTitulo("Python");
        curso2.setDescricao("Curso de Python");
        curso2.setCargaHoraria(34);

        Atividades atividade1 = new Atividades();
        atividade1.setTitulo("Intro ao Java");
        atividade1.setDescricao("Introdução ao Intellij");
        atividade1.setCargaHoraria(4);

        Mentorias mentoria1 = new Mentorias();
        mentoria1.setTitulo("Dicas de Java");
        mentoria1.setDescricao("Dicas importantes no Java");
        mentoria1.setDataMentoria(LocalDate.parse("2026-12-03"));

        Devs dev1 = new Devs();
        dev1.setNome("Luan");


        System.out.println(curso1.toString());
        System.out.println(curso2.toString());
        System.out.println(atividade1.toString());
        System.out.println(mentoria1.toString());

        System.out.println(dev1.toString());
        dev1.inscreverBootcamp(curso1);
        dev1.inscreverBootcamp(curso2);
        dev1.finalizarAtividade(atividade1);
        dev1.finalizarMentoria(mentoria1);
        System.out.println(dev1.toString());
    }

}
