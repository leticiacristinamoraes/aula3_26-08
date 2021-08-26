package br.com.zup;

import java.util.Scanner;

public class Aula3_Exemplo4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Por favor, digite a primeira nota:");
        double nota1 = leitor.nextDouble();
        System.out.println("Por favor, digite a segunda nota:");
        double nota2 = leitor.nextDouble();

        // Calculando a média
        double media = (nota1 + nota2)/2;

        if (nota1 >= 0 & nota2 >= 0 & nota1 <= 10 & nota2 <= 10) {
            if (media >= 0 & media < 7) {
                System.out.println("Você foi reprovado com a nota:" + media);
            }
            else if (media >= 7 & media < 10) {
                System.out.println("Você foi aprovado com a nota:" + media);
            }
            else if (media == 10) {
                System.out.println("Você foi aprovado com distinção! Parabéns pelo desempenho!!!");
            }
        }
        else{
            System.out.println("Por favor, digite uma nota entre 0 e 10!");
        }
    }
}
