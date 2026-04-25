package Application;

import Entity.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    static void main() {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data ");

        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Enter product data: " + product);

        System.out.print("Enter the number of products to be added in stock: ");
        product.addProducts(sc.nextInt());

        System.out.println();
        System.out.println("Update data: " + product);
        System.out.println();

        System.out.print("Enter the number of products to be removed from stock: ");
        product.removerProducts(sc.nextInt());

        System.out.println();
        System.out.println("Update data: " + product);





        sc.close();

    }
}
