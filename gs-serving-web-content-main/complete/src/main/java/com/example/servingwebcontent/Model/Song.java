package com.example.servingwebcontent.model;

public class Song {
    private String title;
    private String artist;

    public Song() {}

    public Song(String title, String artist) {
        try {
            this.title = title;
            this.artist = artist;
        } catch (Exception e) {
            System.out.println("Lỗi khi khởi tạo Song: " + e.getMessage());
        } finally {
            System.out.println("Khởi tạo Song hoàn tất.");
        }
    }

    public String getTitle() {
        try {
            return title;
        } catch (Exception e) {
            System.out.println("Lỗi khi lấy tiêu đề bài hát: " + e.getMessage());
            return null;
        } finally {
            System.out.println("Đã gọi getTitle của Song.");
        }
    }

    public void setTitle(String title) {
        try {
            this.title = title;
        } catch (Exception e) {
            System.out.println("Lỗi khi đặt tiêu đề bài hát: " + e.getMessage());
        } finally {
            System.out.println("Đã gọi setTitle của Song.");
        }
    }

    public String getArtist() {
        try {
            return artist;
        } catch (Exception e) {
            System.out.println("Lỗi khi lấy tên nghệ sĩ: " + e.getMessage());
            return null;
        } finally {
            System.out.println("Đã gọi getArtist của Song.");
        }
    }

    public void setArtist(String artist) {
        try {
            this.artist = artist;
        } catch (Exception e) {
            System.out.println("Lỗi khi đặt tên nghệ sĩ: " + e.getMessage());
        } finally {
            System.out.println("Đã gọi setArtist của Song.");
        }
    }
}
