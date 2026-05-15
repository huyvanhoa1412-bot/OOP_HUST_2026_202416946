package hust.soict.dsai.test.store;

// Phải import cả Store và DigitalVideoDisc vì nó nằm ở 2 thư mục khác hoàn toàn
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);

        // Thêm đĩa
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        // Xóa đĩa
        store.removeDVD(dvd2);

        // Thử xóa lại đĩa vừa xóa xem nó có báo không tìm thấy không
        store.removeDVD(dvd2);
    }
}