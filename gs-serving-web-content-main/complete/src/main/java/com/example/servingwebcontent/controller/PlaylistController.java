package com.example.servingwebcontent.controller;

import com.example.servingwebcontent.model.Playlist;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/playlist")
public class PlaylistController {
    private final List<Playlist> playlists = new ArrayList<>();

    @GetMapping
    public String showPlaylistPage(Model model) {
        model.addAttribute("playlists", playlists);
        return "playlist";
    }

    @PostMapping("/add")
    public String addPlaylist(@RequestParam String name) {
        if (name != null && !name.trim().isEmpty()) {
            playlists.add(new Playlist(name));
        }
        return "redirect:/playlist";
    }
}
