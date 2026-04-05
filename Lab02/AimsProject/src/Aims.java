public class Aims {
    public static void main(String[] args) {
        // 1. Tạo ra một cái giỏ hàng trống
        Cart anOrder = new Cart();

        // 2. Dùng "khuôn" DigitalVideoDisc để đúc ra 3 cái đĩa thật và ném vào giỏ
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        // 3. In ra tổng tiền
        System.out.println("Total Cost is: ");
        System.out.println(anOrder.totalCost());

        // 4. Test thử chức năng xóa đĩa (Yêu cầu phần 11)
        anOrder.removeDigitalVideoDisc(dvd2);
        System.out.println("Total Cost sau khi xoa Star Wars la: " + anOrder.totalCost());
    }
}