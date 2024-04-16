package ListaExtra5.Calculadora;

public class Calculadora {
    public float valor1;
    public float valor2;
    public float resultado;

    public void adicao() {
        resultado = valor1 + valor2;
    }

    public void subtracao() {
        resultado = valor1 - valor2;
    }

    public void multiplicacao() {
        resultado = valor1 * valor2;
    }

    public void divisao() {
        if (valor2 > valor1) {
            System.out.println("Não é possível realizar a divisão!");
        } else if (valor2 == 0) {
            System.out.println("Imagine que você tem 0 biscoitos e vai dividir entre 0 amigos... Tá vendo? isso não faz sentido!");
            System.out.println("Come-come fica triste porquê não tem biscoitos, e você fica triste porquê não tem amigos. :(");
        } else{
            resultado = valor1/valor2;
        }
    }


    public Calculadora() {
    }

    public Calculadora(float valor1, float valor2, float resultado) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.resultado = resultado;
    }

    public float getValor1() {
        return valor1;
    }

    public void setValor1(float valor1) {
        this.valor1 = valor1;
    }

    public float getValor2() {
        return valor2;
    }

    public void setValor2(float valor2) {
        this.valor2 = valor2;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
}
