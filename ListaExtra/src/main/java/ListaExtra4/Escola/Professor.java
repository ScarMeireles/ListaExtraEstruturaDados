package ListaExtra4.Escola;

public class Professor {
    private String nome;
    private String Departamento;
    private  String Titulacao;

    public void retornaProfessor() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.Departamento);
        System.out.println("Titulação: " + this.Titulacao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }

    public String getTitulacao() {
        return Titulacao;
    }

    public void setTitulacao(String titulacao) {
        Titulacao = titulacao;
    }
}
