package com.example.servingwebcontent.controller;

import com.example.servingwebcontent.model.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/album")
public class AlbumController {
    private List<Album> albums = new ArrayList<>();

    @GetMapping
    public String showAlbumPage(Model model) {
        model.addAttribute("albums", albums);
        return "album"; // Tìm file album.html trong templates
    }

    @PostMapping("/add")
    public String addAlbum(@RequestParam String name) {
        try {
            albums.add(new Album(name));
        } catch (Exception e) {
            System.out.println("Lỗi khi thêm Album: " + e.getMessage());
        } finally {
            System.out.println("Gọi addAlbum xong");
        }
        return "redirect:/album";
    }
}
