package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("100");
        list.add("200");
        list.add("300");
        list.add("400");
        list.add("444");
        list.add("405");
        list.add(1, "600");

        list.remove(2);

        for (String value : list) {
            System.out.println(value);
        }

        //Função lambda com predicado
        list.removeIf(number -> number.equals("300"));
        System.out.println("--------------------------");
        for (String value : list) {
            System.out.println(value);
        }

        System.out.println("--------------------------");
        System.out.println("Index Of: " + list.indexOf("600"));
        //Return: Position Index

        System.out.println("Index Of: " + list.indexOf("88"));
        //Return: -1
        System.out.println("--------------------------");

        //Cria uma nova lista filtrando os elementos que contem 4 como inicial filtrando da list old
        List<String> result = list.stream().filter(number -> number.charAt(0) == '4').collect(Collectors.toList());

        for (String value : result) {
            System.out.println(value);
        }
        System.out.println("--------------------------");

        //Realiza a consulta com base no predicado e valida se existe, caso não exista traz null
        String n = list.stream().filter(number -> number.charAt(0) == '8').findFirst().orElse(null);
        System.out.println(n);
    }
}
