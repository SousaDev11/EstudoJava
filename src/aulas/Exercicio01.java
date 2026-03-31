package aulas;

import java.util.Scanner;

public class Exercicio01 {
    static void main() {

            // Variáveis da pessoa
        String nome = "Ricardo";
        int idade = 20;
        double salario = 200.00;
        boolean carteiraAssinada = true;


            // Verifica se é menor de idade
        if (idade < 18) {
            System.out.println("Menor de idade, não pode trabalhar");

            // Verifica se é maior de idade e tem carteira assinada
        } else if (idade >= 18 && carteiraAssinada) {
            System.out.println("Maior de idade e empregado com carteira");

            // Maior de idade mas sem carteira assinada
        } else {
            System.out.println("Maior de idade mas sem carteira assinada");
        }

    }
}
