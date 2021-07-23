package application;

import entities.Quarto;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String name;
        String email;
        int room;

        Scanner sc = new Scanner(System.in);
        Quarto[] quarto = new Quarto[9];

        System.out.println("How many rooms will be rented? ");
        int quantityRoom = sc.nextInt();

        for (int i = 1; i < quantityRoom + 1; i++) {
            System.out.println("\nRent #" + (i));
            System.out.print("Name: ");
            sc.nextLine();
            name = sc.nextLine();

            System.out.print("Email: ");
            email = sc.nextLine();

            System.out.print("Room: ");
            room = sc.nextInt();

            quarto[room] = new Quarto(room, name, email);
        }

        System.out.println("\nBusy rooms:");
        for (Quarto value : quarto) {
            if (value != null) {
                System.out.println(value);
            }
        }

        sc.close();
    }
}
