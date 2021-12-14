package application;

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class App {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 550.0));
        list.add(new Product("HD Case", 80.0));

        //Predicate<Product> productPredicate = (product -> product.getValue() >= 100.0);

        list.removeIf( product -> product.getValue() >= 100.0 );

        for (Product product : list) {
            System.out.println(product);
        }

    }
}
