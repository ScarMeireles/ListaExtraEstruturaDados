package ListaExtra1;

public class mainPonto {
    public static void main(String[] args) {
        Ponto ponto1 = new Ponto();
        ponto1.setX(10);
        ponto1.setY(15);
        System.out.println(ponto1.getX());
        System.out.println(ponto1.getY());

        Ponto ponto2 = new Ponto();
        ponto2.setX(5);
        ponto2.setY(10);
        System.out.println(ponto2.getX());
        System.out.println(ponto2.getY());

        Ponto ponto3 = new Ponto();
        ponto3.setX(0);
        ponto3.setY(10);
        System.out.println(ponto3.getX());
        System.out.println(ponto3.getY());
    }
}
