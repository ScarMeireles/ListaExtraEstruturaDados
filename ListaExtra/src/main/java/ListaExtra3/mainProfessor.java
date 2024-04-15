package ListaExtra3;

public class mainProfessor {
    public static void main(String[] args) {
        professor professor = new professor("Fabricio", 1000.00);
        professor.aumentarSalario(10.0);
        professor.retornarProfessor();

        professor.aumentarSalario(15.0);
        professor.retornarProfessor();
    }
}
