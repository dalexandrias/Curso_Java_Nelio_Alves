package application;

import entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 400.0));

        //Arrow function (Função anonima) 2.0
        //Comparator<Product> comparator = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

        //Arrow function (Função anonima)
//        Comparator<Product> comparator = (p1, p2) -> {
//            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//        };

        //Instacia o Coparator e sobrescreve o compare
//        Comparator<Product> comparator = new Comparator<Product>() {
//            @Override
//            public int compare(Product p1, Product p2) {
//                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//            }
//        };

        list.sort((product, t1) -> product.getName().toUpperCase().compareTo(t1.getName().toUpperCase()));

        for (Product product : list) {
            System.out.println(product);
        }
    }
}
