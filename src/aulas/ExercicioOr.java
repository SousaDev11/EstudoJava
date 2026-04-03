package aulas;

public class ExercicioOr {

    static void main() {

            // Dados do funcionário
        String nome = "Ricardo";
        double salario = 3000.00;
        boolean seEstaDeFerias = false;
        boolean estaDeAtestado = true;

            // Verifica se o salário está fora do padrão (abaixo de 1000 OU acima de 8000)
        if (salario < 1000.00 || salario > 8000.00) {
            System.out.println("Salario fora do padrao");

            // Verifica se está ausente (de férias OU de atestado)
        } else if (seEstaDeFerias || estaDeAtestado ) {
            System.out.println("Funcionário ausente");

            // Funcionário disponível para trabalho
        }else {
            System.out.println("Funcionário disponível");
        }


    }
}
