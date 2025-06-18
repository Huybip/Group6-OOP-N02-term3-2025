package com.example.servingwebcontent.model;

public class Playlist {
    private String name;

    public Playlist() {}

    public Playlist(String name) {
        try {
            this.name = name;
        } catch (Exception e) {
            System.out.println("Lỗi khi khởi tạo Playlist: " + e.getMessage());
        } finally {
            System.out.println("Khởi tạo Playlist hoàn tất.");
        }
    }

    public String getName() {
        try {
            return name;
        } catch (Exception e) {
            System.out.println("Lỗi khi lấy tên Playlist: " + e.getMessage());
            return null;
        } finally {
            System.out.println("Đã gọi getName của Playlist.");
        }
    }

    public void setName(String name) {
        try {
            this.name = name;
        } catch (Exception e) {
            System.out.println("Lỗi khi đặt tên Playlist: " + e.getMessage());
        } finally {
            System.out.println("Đã gọi setName của Playlist.");
        }
    }
}