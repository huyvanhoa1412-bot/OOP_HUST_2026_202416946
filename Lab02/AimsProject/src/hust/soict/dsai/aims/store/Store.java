package hust.soict.dsai.aims.store;

// Bắt buộc phải có dòng này để lấy thông tin cái đĩa từ thư mục disc sang
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    public static final int MAX_ITEMS_IN_STORE = 100;
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX_ITEMS_IN_STORE];
    private int qtyInStore = 0;

    // Thêm đĩa vào kho
    public void addDVD(DigitalVideoDisc dvd) {
        if (qtyInStore < MAX_ITEMS_IN_STORE) {
            itemsInStore[qtyInStore] = dvd;
            qtyInStore++;
            System.out.println("DVD '" + dvd.getTitle() + "' da duoc them vao kho.");
        } else {
            System.out.println("Kho da day, khong the them.");
        }
    }

    // Xóa đĩa khỏi kho
    public void removeDVD(DigitalVideoDisc dvd) {
        boolean found = false;
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i] == dvd) {
                // Đẩy các đĩa phía sau lên lấp chỗ trống
                for (int j = i; j < qtyInStore - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[qtyInStore - 1] = null;
                qtyInStore--;
                System.out.println("DVD '" + dvd.getTitle() + "' da bi xoa khoi kho.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay DVD trong kho.");
        }
    }
}