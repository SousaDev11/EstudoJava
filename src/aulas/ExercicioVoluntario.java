package aulas;

public class ExercicioVoluntario {

    static void main() {

        int quantidadeDeMarmitasDisponiveis = 20;
        int quantidadeDePessoasNoLocal = 19;
        boolean estaChovendo = true;

        if (quantidadeDeMarmitasDisponiveis > quantidadeDePessoasNoLocal) {
            System.out.println("Todos serão atendidos");

        } else if (quantidadeDeMarmitasDisponiveis < quantidadeDePessoasNoLocal) {
            System.out.println("Marmitas insuficientes, precisamos de mais doações");

        } if (estaChovendo) {
            System.out.println("Levar cobertas e agasalhos também");
        }
    }
}
