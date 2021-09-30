package dev.csv.buboyn.solidprinciples.singleresponsibility.solution;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@AllArgsConstructor
@ToString
public class Movie {

	private final String title;
	private final String genre;
	private final String director;

}
