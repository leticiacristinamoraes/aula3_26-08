package br.com.zup;

import java.util.Scanner;

public class Aula3_Exemplo5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Para saber de quanto será o seu amento, informe o valor do seu salário:");
        double salarioAtual = leitor.nextDouble();

        if (salarioAtual > 0 & salarioAtual  <= 280.00) {
            double aumento20 = (0.2 * salarioAtual);
            double novoSalario = aumento20 + salarioAtual;
            System.out.println("Seu salário atual é de: R$" + salarioAtual);
            System.out.println("O percentual de aumento foi de 20%");
            System.out.println("O valor de aumento foi de: R$" + aumento20);
            System.out.println("A partir de agora seu novo salário será de R$" + novoSalario);
        }
        else if (salarioAtual > 280.00 & salarioAtual <= 700.00) {
            double aumento15 = (0.15 * salarioAtual);
            double novoSalario = aumento15 + salarioAtual;
            System.out.println("Seu salário atual é de: R$" + salarioAtual);
            System.out.println("O percentual de aumento foi de 15%");
            System.out.println("O valor de aumento foi de: R$" + aumento15);
            System.out.println("A partir de agora seu novo salário será de R$" + novoSalario);
        }
        else if (salarioAtual > 700.00 & salarioAtual <= 1500.00) {
            double aumento10 = (0.1 * salarioAtual);
            double novoSalario = aumento10 + salarioAtual;
            System.out.println("Seu salário atual é de: R$" + salarioAtual);
            System.out.println("O percentual de aumento foi de 10%");
            System.out.println("O valor de aumento foi de: R$" + aumento10);
            System.out.println("A partir de agora seu novo salário será de R$" + novoSalario);
        }
        else if (salarioAtual > 1500.00) {
            double aumento5 = (0.05 * salarioAtual);
            double novoSalario = aumento5 + salarioAtual;
            System.out.println("Seu salário atual é de: R$" + salarioAtual);
            System.out.println("O percentual de aumento foi de 5%");
            System.out.println("O valor de aumento foi de: R$" + aumento5);
            System.out.println("A partir de agora seu novo salário será de R$" + novoSalario);
        }
        else {
            System.out.println("Por favor, digite um valor válido!");
        }
    }
}
