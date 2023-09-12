package org.learning.hello.controller;

import org.learning.hello.model.Movie;
import org.learning.hello.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String nome(Model model) {
        String nome = "Daniel Burdusa";
        model.addAttribute("name", nome);
        return "index";
    }

    @GetMapping("/movies")
    public String movieList(Model model) {
        List<Movie> movieList = getBestMovies();
        model.addAttribute("movies", movieList);
        return "movies-list";
    }

    @GetMapping("/songs")
    public String songList(Model model) {
        List<Song> songList = getBestSongs();
        model.addAttribute("songs", songList);
        return "songs-list";
    }

    private List<Movie> getBestMovies() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(01, "pippo"));
        movies.add(new Movie(02, "pippo"));
        movies.add(new Movie(03, "pippo"));
        return movies;
    }

    private List<Song> getBestSongs() {
        List<Song> songs = new ArrayList<>();
        songs.add(new Song(04, "pippo"));
        songs.add(new Song(05, "pippo"));
        songs.add(new Song(06, "pippo"));
        return songs;
    }
}
