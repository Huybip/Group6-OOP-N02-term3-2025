package com.example.servingwebcontent.controller;

import com.example.servingwebcontent.model.Playlist;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/playlist")
public class PlaylistController {
    private List<Playlist> playlists = new ArrayList<>();

    @GetMapping
    public String showPlaylistPage() {
        return "playlist"; // Spring sẽ tìm file playlist.html trong thư mục templates
    }


    @PostMapping("/add")
    public String addPlaylist(@RequestParam String name) {
        try {
            playlists.add(new Playlist(name));
        } catch (Exception e) {
            System.out.println("Lỗi khi thêm Playlist: " + e.getMessage());
        } finally {
            System.out.println("Gọi addPlaylist xong");
        }
        return "redirect:/playlist";
    }
}