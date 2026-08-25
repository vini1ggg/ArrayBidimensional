import java.util.Scanner;

public class Exercicio01 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int [][] m = new int[3][3];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("Digite um valor --> ");
                m[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }

        //impressão da diagonal principal
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i == j) {
                    System.out.print(m[i][j] + "\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

        //impressão da diagonal secundária
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i + j == m.length - 1) {
                    System.out.print(m[i][j] + "\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
}
