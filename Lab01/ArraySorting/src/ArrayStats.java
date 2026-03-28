import java.util.Arrays;
import java.util.Scanner;

public class ArrayStats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        double[] arr = new double[n];
        double sum = 0;

        System.out.println("Nhập các phần tử:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }

        Arrays.sort(arr);
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arr));
        System.out.println("Tổng các phần tử: " + sum);
        System.out.println("Trung bình cộng: " + (sum / n));
    }
}