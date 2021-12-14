package application;

import entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter file full path: ");
        String path = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            Set<LogEntry> logEntrySet = new HashSet<>();

            String line = br.readLine();
            while (null != line) {

                //Separa os valores do arquivo com o delimiter space
                String[] listName = line.split(" ");

                //Atribui e formata para o formato correto da classe de destino
                String name = listName[0];
                Date moment = Date.from(Instant.parse(listName[1]));

                //Cria a instancia da classe para o set
                LogEntry logEntry = new LogEntry(name, moment);

                //Adiciona no hashSet
                logEntrySet.add(logEntry);

                //Passa para proxima linha do file
                line = br.readLine();
            }

            System.out.println("Total users: " + logEntrySet.size());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
