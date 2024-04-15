package ListaExtra2;

public class mainContato {
    public static void main(String[] args) {
        Contato contato1 = new Contato("José da Silva", "9999-9909");
        Contato contato2 = new Contato("Mariana da Silva", "89898-9909");
        Contato contato3 = new Contato("Joana Siqueria", "9999-8666");

        contato1.retornaContato();
        contato2.retornaContato();
        contato3.retornaContato();
    }
}
