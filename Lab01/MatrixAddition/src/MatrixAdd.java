import java.util.Scanner;

public class MatrixAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng và số cột của ma trận: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] mat1 = new int[rows][cols];
        int[][] mat2 = new int[rows][cols];

        System.out.println("Nhập các phần tử ma trận 1:");
        for(int i = 0; i < rows; i++)
            for(int j = 0; j < cols; j++) mat1[i][j] = sc.nextInt();

        System.out.println("Nhập các phần tử ma trận 2:");
        for(int i = 0; i < rows; i++)
            for(int j = 0; j < cols; j++) mat2[i][j] = sc.nextInt();

        System.out.println("Tổng 2 ma trận:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print((mat1[i][j] + mat2[i][j]) + "\t");
            }
            System.out.println();
        }
    }
}