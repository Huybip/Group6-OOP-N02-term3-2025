package com.example.servingwebcontent.model;

public class Album {
    private String name;

    public Album() {}

    public Album(String name) {
        try {
            this.name = name;
        } catch (Exception e) {
            System.out.println("Lỗi khi khởi tạo Album: " + e.getMessage());
        } finally {
            System.out.println("Khởi tạo Album hoàn tất.");
        }
    }

    public String getName() {
        try {
            return name;
        } catch (Exception e) {
            System.out.println("Lỗi khi lấy tên Album: " + e.getMessage());
            return null;
        } finally {
            System.out.println("Đã gọi getName của Album.");
        }
    }

    public void setName(String name) {
        try {
            this.name = name;
        } catch (Exception e) {
            System.out.println("Lỗi khi đặt tên Album: " + e.getMessage());
        } finally {
            System.out.println("Đã gọi setName của Album.");
        }
    }
}
