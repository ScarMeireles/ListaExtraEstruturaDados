package ListaExtra5.Main;

import ListaExtra5.Calculadora.Calculadora;

import java.util.Scanner;

public class calctest {
    public static void main(String[] args) {
        int opcao = -1;
        Calculadora calculadora = new Calculadora();
        Scanner in = new Scanner(System.in);
        while (opcao != 0){
            System.out.println("Bem vindo a Calculadora!");
            System.out.println("Escolha uma operação");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("0 - Sair");

            opcao = in.nextInt(); // Atualiza a opcao com a escolha do usuário

            switch (opcao){
                case 0:
                    break;
                case 1:
                    System.out.println("Você Escolheu Somar!");
                    System.out.println("Digite os valores ");
                    calculadora.valor1 = in.nextFloat();
                    calculadora.valor2 = in.nextFloat();
                    calculadora.adicao();
                    System.out.println(calculadora.resultado);
                    break; // Adiciona break para sair do switch
                case 2:
                    System.out.println("Você Escolheu Subtrair!");
                    System.out.println("Digite os valores ");
                    calculadora.valor1 = in.nextFloat();
                    calculadora.valor2 = in.nextFloat();
                    calculadora.subtracao();
                    System.out.println(calculadora.resultado);
                    break; // Adiciona break para sair do switch
                case 3:
                    System.out.println("Você Escolheu Multiplicar!");
                    System.out.println("Digite os valores ");
                    calculadora.valor1 = in.nextFloat();
                    calculadora.valor2 = in.nextFloat();
                    calculadora.multiplicacao();
                    System.out.println(calculadora.resultado);
                    break; // Adiciona break para sair do switch
                case 4:
                    System.out.println("Você Escolheu Dividir!");
                    System.out.println("Digite os valores ");
                    calculadora.valor1 = in.nextFloat();
                    calculadora.valor2 = in.nextFloat();
                    calculadora.divisao();
                    System.out.println(calculadora.resultado);
                    break; // Adiciona break para sair do switch
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}