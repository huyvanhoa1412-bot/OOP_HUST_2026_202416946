package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;

public class Store {
    // Dùng ArrayList chứa Media
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    // Thêm mặt hàng vào kho
    public void addMedia(Media media) {
        if (!itemsInStore.contains(media)) {
            itemsInStore.add(media);
            System.out.println(media.getTitle() + " da duoc them vao kho.");
        } else {
            System.out.println(media.getTitle() + " da co san trong kho!");
        }
    }

    // Xóa mặt hàng khỏi kho
    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println(media.getTitle() + " da bi xoa khoi kho.");
        } else {
            System.out.println("Khong tim thay " + media.getTitle() + " trong kho.");
        }
    }

    // Hàm tiện ích để in danh sách kho (phục vụ cho menu Console lát nữa)
    public void printStore() {
        System.out.println("***********************STORE***********************");
        for (int i = 0; i < itemsInStore.size(); i++) {
            System.out.println((i + 1) + ". " + itemsInStore.get(i).toString());
        }
        System.out.println("***************************************************");
    }

    // Hàm tiện ích để lấy ra Media nếu biết tên
    public Media fetchMedia(String title) {
        for (Media media : itemsInStore) {
            if (media.getTitle().toLowerCase().equals(title.toLowerCase())) {
                return media;
            }
        }
        return null;
    }
}