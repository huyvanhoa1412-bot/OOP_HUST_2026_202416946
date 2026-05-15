package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();

    public CompactDisc(String title, String category, float cost, String artist) {
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
        this.artist = artist;
    }

    public String getArtist() { return artist; }

    // Thêm bài hát (kiểm tra xem đã có chưa)
    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
            System.out.println("Da them track: " + track.getTitle());
        } else {
            System.out.println("Track nay da ton tai trong CD!");
        }
    }

    // Xóa bài hát
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Da xoa track: " + track.getTitle());
        } else {
            System.out.println("Khong tim thay track nay de xoa!");
        }
    }

    // Tính tổng thời lượng CD dựa trên các track
    @Override
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    // Phát nhạc (Phát lần lượt từng bài)
    @Override
    public void play() {
        System.out.println("Playing CD: " + this.getTitle() + " by " + this.getArtist());
        System.out.println("Total length: " + this.getLength());
        for (Track track : tracks) {
            track.play();
        }
    }
}