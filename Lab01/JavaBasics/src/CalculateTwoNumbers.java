import javax.swing.JOptionPane;

public class CalculateTwoNumbers {
    public static void main(String[] args) {
        String strNum1 = JOptionPane.showInputDialog("Nhập số thứ nhất:");
        String strNum2 = JOptionPane.showInputDialog("Nhập số thứ hai:");

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double diff = num1 - num2;
        double product = num1 * num2;

        String result = "Tổng: " + sum + "\nHiệu: " + diff + "\nTích: " + product + "\n";

        if (num2 != 0) {
            result += "Thương: " + (num1 / num2);
        } else {
            result += "Thương: Lỗi! Không thể chia cho 0!";
        }

        JOptionPane.showMessageDialog(null, result);
        System.exit(0);
    }
}