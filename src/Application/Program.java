package Application;


import Entity.Car;

import java.util.Scanner;

public class Program {

    static void main() {

        Car c = new Car();

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a marca: ");
        String marca = sc.nextLine();

        c.setMarca(marca);

        System.out.println("marca: " + c.getMarca());

    }
}
