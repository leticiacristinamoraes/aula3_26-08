package br.com.zup;

import java.util.Scanner;

public class Aula3_Exemplo3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um dos seguintes valores para os respectivos dias da semana:");
        System.out.println("1 - Domingo");
        System.out.println("2 - Segunda");
        System.out.println("3 - Terça");
        System.out.println("4 - Quarta");
        System.out.println("5 - Quinta");
        System.out.println("6 - Sexta");
        System.out.println("7 - Sábado");

        System.out.println("Digite o número do dia desejado:");
        double diaDesejado = leitor.nextDouble();

        if (diaDesejado == 1) {
            System.out.println("O dia é Domingo.");
            }
        else if (diaDesejado == 2) {
            System.out.println("O dia é Segunda");
        }
        else if (diaDesejado == 3) {
            System.out.println("O dia é Terça");
        }
        else if (diaDesejado == 4) {
            System.out.println("O dia é Quarta");
        }
        else if (diaDesejado == 5) {
            System.out.println("O dia é Quinta");
        }
        else if (diaDesejado == 6) {
            System.out.println("O dia é Sexta");
        }
        else if (diaDesejado == 7) {
            System.out.println("O dia é Sábado");
        }
        else {
            System.out.println("Valor inválido! Por favor digite um número da lista exibida.");
        }



    }
}
