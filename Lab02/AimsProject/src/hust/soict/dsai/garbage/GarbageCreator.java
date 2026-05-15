package hust.soict.dsai.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) {
        // Trỏ đại vào một file có dung lượng hợi nặng một chút trong máy anh (ví dụ file exe hoặc pdf)
        // Nếu lười, anh tạo một file text tên test.txt nhét đầy chữ vào đó rồi để cùng thư mục project
        String filename = "test.txt";
        byte[] inputBytes = { 0 };
        long startTime, endTime;

        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
            startTime = System.currentTimeMillis();
            String outputString = "";
            for (byte b : inputBytes) {
                outputString += (char) b; // Dùng dấu + gây tràn bộ nhớ rác
            }
            endTime = System.currentTimeMillis();
            System.out.println("Thoi gian chay bang String (+): " + (endTime - startTime) + " ms");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
