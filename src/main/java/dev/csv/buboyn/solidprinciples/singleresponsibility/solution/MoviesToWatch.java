package dev.csv.buboyn.solidprinciples.singleresponsibility.solution;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class MoviesToWatch {

    public List<Movie> recommend(Client client) {

        List<Movie> recommendedMovies = new ArrayList<>();
        client.getFavorites().forEach(fav -> {
             recommendedMovies.addAll(BBDD.MOVIES_BY_DIRECTOR.get(fav.getDirector()));
        });
        recommendedMovies.removeAll(client.getFavorites());
        return recommendedMovies;
    }
}
