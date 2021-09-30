package dev.csv.buboyn.solidprinciples.singleresponsibility.solution;

import lombok.*;

import java.util.Arrays;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@ToString
public class Client {
 
	private final String name;
	private final List<Movie> favorites;
}
