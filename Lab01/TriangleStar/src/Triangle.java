import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều cao n của tam giác: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // In khoảng trắng để căn giữa
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // In dấu sao
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}