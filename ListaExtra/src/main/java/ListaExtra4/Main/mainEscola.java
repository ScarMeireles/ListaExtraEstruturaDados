package ListaExtra4.Main;

import ListaExtra4.Escola.Estudante;
import ListaExtra4.Escola.Professor;

import java.util.Scanner;

public class mainEscola {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o Nome do Estudante: ");
        String nomeA = in.nextLine();
        estudante.setNome(nomeA);

        System.out.println("Digite o Curso do Estudante: ");
        String cursoA = in.nextLine();
        estudante.setCurso(cursoA);

        System.out.println("Digite o Ano de ingresso do Estudante: ");
        Integer ano = in.nextInt();
        estudante.setAnoIngresso(ano);
        estudante.retornaEstudante();


        Professor professor = new Professor();

        System.out.println("Digite o Nome do Professor: ");
        String nome = in.nextLine();
        professor.setNome(nome);

        System.out.println("Digite o Departamento do Professor: ");
        String departamentoP = in.nextLine();
        professor.setDepartamento(departamentoP);

        System.out.println("Digite o Titulo do Professor: ");
        String tituloP = in.nextLine();
        professor.setTitulacao(tituloP);
        professor.retornaProfessor();
    }
}
