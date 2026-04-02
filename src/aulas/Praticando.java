package aulas;


import java.util.Scanner;

public class Praticando {

    static void main() {

        String nome = "Ricardo";
        int senha = 1234;

        Scanner sc = new Scanner(System.in);

        System.out.println("digite seu nome: ");
        nome = sc.nextLine();

        System.out.println("Informe sua senha: ");
        senha = sc.nextInt();

        if (nome != "Ricardo " && senha != 1234 ) {
            System.out.println("nome ou senha incorreto");
        } else {
            System.out.println("usuario encontrado");
        }

    }
}
