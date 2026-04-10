package aulas;



public class Main {
    static void main() {

        Carro carro1 = new Carro ();

        carro1.marca = "Toyota";
        carro1.modelo = "Hilux";
        carro1.ano = 2025;
        carro1.preco = 22222.00;

        System.out.println("marca: " + carro1.marca);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Ano do veiculo: " + carro1.ano);
        System.out.println("Preço: " + carro1.preco);
    }
}
