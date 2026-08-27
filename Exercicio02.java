import java.util.Random;
import java.util.Scanner;

public class Exercicio02 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] mes = {"Janeiro", "Fevereiro", "Março",
                        "Abril", "Maio", "Junho"};
        String[] categoria = new String[3];
        double [][] venda = new double[categoria.length][mes.length];
        double total;

        //leitura de categorias
        for (int i = 0; i < categoria.length; i++) {
            System.out.print("Categoria: ");
            categoria[i] = sc.nextLine();
        }

        //geração das vendas
        for (int i = 0; i < venda.length; i++) {
            for (int j = 0; j < venda[i].length; j++) {
                venda[i][j] = random.nextDouble(1,20);
                System.out.print(String.format("%.2f", venda[i][j]) + "\t");
            }
            System.out.println();
        }

        //impressão do total de vendas por categoria
        System.out.println("Total de vendas por categoria");
        for (int i = 0; i < venda.length; i++) {
            total = 0;
            for (int j = 0; j < venda[i].length; j++) {
                total += venda[i][j];
            }
            System.out.print(categoria[i] + "  |  ");
            System.out.println(String.format("%.2f", total));
        }
    }
}
