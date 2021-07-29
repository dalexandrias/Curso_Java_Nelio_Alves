package application;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        //Preenchimento das linhas no primeiro for e colunas no segundo for
        //mat[i][j] = sc.nextInt(); atribui valor no index da matriz de acordo com i e j
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMain diagonal:");
        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][i] + " ");
        }

        int countNegative = 0;
        for (int[] row : mat) {
            for (int value : row) {
                if (value < 0) {
                    countNegative++;
                }
            }
        }

        System.out.println("\nNumber Negative: " + countNegative);

        sc.close();
    }
}
