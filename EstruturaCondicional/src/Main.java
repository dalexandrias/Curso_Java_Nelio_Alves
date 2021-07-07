import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int x;
//
//        Scanner sc = new Scanner(System.in);
//
//        x = sc.nextInt();
//
//        if (x == 5) {
//            System.out.println("x = " + x);
//        }
//        else if (x == 10) {
//            System.out.println("x = " + x);
//        }
//        else {
//            System.out.println("Valor invalido");
//        }
//
//        sc.close();
        expressao_ternaria();
    }

    public static void swith_case() {
        int x;

        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();

        switch (x) {
            case 5:
                System.out.println("x = " + x);
                break;
            case 10:
                System.out.println("x = ");
                break;
            default:
                System.out.println("Valor invalido");
                break;
        }

        sc.close();

    }

    public static void expressao_ternaria() {
        String x;
        x = (5 == 5) ? "sim" : "não";
        String resp;
        resp = (10 == 10) ? x : "Nao";
        int comp;
        comp = (x != resp) ? 10 : 20;
        System.out.println(comp);
    }
}
