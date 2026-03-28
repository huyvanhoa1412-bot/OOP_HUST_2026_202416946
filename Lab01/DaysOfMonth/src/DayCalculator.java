import java.util.Scanner;

public class DayCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = -1;
        String month = "";

        // Nhập năm (bắt buộc >= 0)
        while (true) {
            System.out.print("Nhập năm (số nguyên không âm): ");
            if (sc.hasNextInt()) {
                year = sc.nextInt();
                if (year >= 0) break;
            } else {
                sc.next(); // Xóa dữ liệu rác nếu nhập chữ
            }
            System.out.println("Năm không hợp lệ! Vui lòng nhập lại.");
        }

        // Nhập tháng và tính số ngày
        while (true) {
            System.out.print("Nhập tháng (Tên đầy đủ, viết tắt 3 chữ, hoặc số): ");
            month = sc.next().toLowerCase();
            int days = 0;

            switch (month) {
                case "1": case "jan": case "jan.": case "january": days = 31; break;
                case "2": case "feb": case "feb.": case "february":
                    // Tính năm nhuận (chia hết cho 4 nhưng không chia hết cho 100, hoặc chia hết cho 400)
                    boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                    days = isLeap ? 29 : 28;
                    break;
                case "3": case "mar": case "mar.": case "march": days = 31; break;
                case "4": case "apr": case "apr.": case "april": days = 30; break;
                case "5": case "may": days = 31; break;
                case "6": case "jun": case "jun.": case "june": days = 30; break;
                case "7": case "jul": case "jul.": case "july": days = 31; break;
                case "8": case "aug": case "aug.": case "august": days = 31; break;
                case "9": case "sep": case "sept.": case "september": days = 30; break;
                case "10": case "oct": case "oct.": case "october": days = 31; break;
                case "11": case "nov": case "nov.": case "november": days = 30; break;
                case "12": case "dec": case "dec.": case "december": days = 31; break;
                default:
                    System.out.println("Tháng không hợp lệ! Vui lòng nhập lại.");
                    continue; // Quay lại vòng lặp bắt nhập lại tháng
            }
            System.out.println("Tháng " + month + " năm " + year + " có " + days + " ngày.");
            break; // Tính xong thì thoát vòng lặp
        }
    }
}