package dev.csv.buboyn.solidprinciples.singleresponsibility.solution;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CSVExporter {

    public String export(List<Movie> recommendations) {

        return recommendations.stream()
                .map(p -> (p.getTitle() + "," + p.getDirector() + "," + p.getGenre()))
                .collect(Collectors.joining("\n"));
    }
}
