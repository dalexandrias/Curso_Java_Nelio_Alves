package application;

import entities.Product;
import util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class App {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 550.0));
        list.add(new Product("HD Case", 80.0));

        //Consumer<Product> productConsumer = product -> product.setValue(product.getValue() * 1.1);
        list.forEach(product -> product.setValue(product.getValue() * 1.1));

        list.forEach(System.out::println);
    }
}
