import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // Ler as dimensões da matriz
        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = sc.nextInt();
        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = sc.nextInt();

        // Criar a matriz com as dimensões informadas
        int[][] matriz = new int[linhas][colunas];

        // Preencher a matriz com valores informados pelo usuário
        System.out.println("Digite os valores da matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("Valor para a posição [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }

        // Imprimir a matriz
        System.out.println("Matriz informada:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
