package application;

import application.resource.OpenFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class App {

    public static void main(String[] args) {

        List<Set<String>> list = new ArrayList<>();
        for (int i = 1; i <= 2; i++) {
            String pathFile = "/home/alexandrias/Workspace/Java_Primeiros_Passos/Set/in" + i + ".txt";

            Set<String> set = new OpenFile(pathFile).hashSetFile();
            list.add(set);
        }

        Set<String> set1 = list.get(0);
        Set<String> set2 = list.get(1);

        set1.addAll(set2);

        System.out.println(set1);
        System.out.println(set2);

//        for (String value : set2) {
//            if (!set1.contains(value)) {
//                System.out.println("Adicionado: " + value);
//                set1.add(value);
//            }
//            else {
//                System.out.println("Ja existe: " + value);
//            }
//        }
    }
}
