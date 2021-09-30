package dev.csv.buboyn.solidprinciples.singleresponsibility.solution;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Recommender {

	private final MoviesToWatch MoviesToWatch;

	public Recommender(MoviesToWatch MoviesToWatch) {
		this.MoviesToWatch = MoviesToWatch;
	}

	public List<Movie> recommendations (Client client) {
		return MoviesToWatch.recommend(client);
	}

}
