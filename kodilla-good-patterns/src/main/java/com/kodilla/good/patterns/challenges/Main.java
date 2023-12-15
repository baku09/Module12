package org.example;

import com.kodilla.good.patterns.challenges.MovieStore;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> movie = movieStore.getMovies();

        String result = movie.values().stream()
                .flatMap(List::stream)
                .collect(Collectors.joining(" ! "));

        System.out.println(result);
    }
}