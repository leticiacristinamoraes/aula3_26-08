package br.com.zup;

import java.util.Scanner;

public class Aula3_Exemplo6 {
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
        int diaDesejado = leitor.nextInt();

        switch (diaDesejado){
            case 1:
                System.out.println("É Domingo!");
                break;
            case 2:
                System.out.println("É Segunda!");
                break;
            case 3:
                System.out.println("É Terça!");
                break;
            case 4:
                System.out.println("É Quarta!");
                break;
            case 5:
                System.out.println("É Quinta!");
                break;
            case 6:
                System.out.println("É Sexta!");
                break;
            case 7:
                System.out.println("É Sábado!");
                break;
        }

    }
}
