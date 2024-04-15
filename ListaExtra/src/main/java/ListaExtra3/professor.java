package ListaExtra3;

public class professor {
    private String nome;
    private Double salario;

    public professor(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public Double aumentarSalario(Double valorAumento) {
        double aumento = this.salario * (valorAumento / 100);
        this.salario += aumento;
        return salario;
    }
    public void retornarProfessor(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: " + this.salario);
    }
}
