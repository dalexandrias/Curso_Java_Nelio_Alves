package estrutura_while;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        validation_password();
    }

    public static void estrutura_while() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int soma = 0;
        while (x != 0)  {
            soma += x;
            x = sc.nextInt();
        }
        System.out.println(soma);
        sc.close();
    }

    public static void validation_password() {
        Scanner sc = new Scanner(System.in);
        String password = "0";

        while (true) {
            System.out.println("Informe a senha: ");
            password = sc.nextLine();

            if (!password.equals("2002")) {
                System.out.println("Senha incorreta.");
            }
            else {
                System.out.println("Senha correta.");
                break;
            }
        }
        
        sc.close();
    }
}