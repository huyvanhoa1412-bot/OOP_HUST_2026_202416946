import java.util.Scanner;

public class EquationSolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chọn chức năng:\n1. Giải PT bậc 1 (ax + b = 0)\n2. Giải hệ PT bậc 1 hai ẩn\n3. Giải PT bậc 2 (ax^2 + bx + c = 0)");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Nhập a và b: ");
            double a = sc.nextDouble(), b = sc.nextDouble();
            if (a == 0) System.out.println(b == 0 ? "Vô số nghiệm" : "Vô nghiệm");
            else System.out.println("Nghiệm x = " + (-b / a));

        } else if (choice == 2) {
            System.out.print("Nhập a11, a12, b1: ");
            double a11 = sc.nextDouble(), a12 = sc.nextDouble(), b1 = sc.nextDouble();
            System.out.print("Nhập a21, a22, b2: ");
            double a21 = sc.nextDouble(), a22 = sc.nextDouble(), b2 = sc.nextDouble();

            double D = a11 * a22 - a21 * a12;
            double D1 = b1 * a22 - b2 * a12;
            double D2 = a11 * b2 - a21 * b1;

            if (D != 0) System.out.println("Nghiệm: x1 = " + (D1/D) + ", x2 = " + (D2/D));
            else System.out.println(D1 == 0 && D2 == 0 ? "Vô số nghiệm" : "Vô nghiệm");

        } else if (choice == 3) {
            System.out.print("Nhập a, b, c: ");
            double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
            if (a == 0) {
                if (b == 0) System.out.println(c == 0 ? "Vô số nghiệm" : "Vô nghiệm");
                else System.out.println("Nghiệm x = " + (-c / b));
            } else {
                double delta = b * b - 4 * a * c;
                if (delta < 0) System.out.println("Vô nghiệm");
                else if (delta == 0) System.out.println("Nghiệm kép x = " + (-b / (2 * a)));
                else System.out.println("2 nghiệm: x1 = " + ((-b + Math.sqrt(delta)) / (2 * a)) + ", x2 = " + ((-b - Math.sqrt(delta)) / (2 * a)));
            }
        }
    }
}