package aulas;

public class ExercicioAnd {

    static void main() {

            // Dados do funcionário
        String nome = "Ricardo";
        int idade = 24;
        boolean temCarteiraAssinada = false;
        double salario = 2000.00;

           // Verifica se é funcionário registrado (maior de idade E com carteira)
        if (idade > 18 && temCarteiraAssinada) {
            System.out.println("Funcionário Registrado");

            // Verifica se é funcionário senior (maior de idade E salário alto)
        } else if (idade > 18 && salario > 3000.00) {
            System.out.println("Funcionário senior");

            // Não atende nenhuma condição
        } else {
            System.out.println("Funcionário não elegível");
        }

    }


}
