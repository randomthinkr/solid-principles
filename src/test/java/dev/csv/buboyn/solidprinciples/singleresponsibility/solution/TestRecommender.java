package dev.csv.buboyn.solidprinciples.singleresponsibility.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TestRecommender {

	Recommender recommender;
	MoviesToWatch moviesToWatch;
	CSVExporter csvExporter;

	@BeforeEach
	public void init() {
		csvExporter = new CSVExporter();
		moviesToWatch = new MoviesToWatch();
		recommender = new Recommender(moviesToWatch);
	}

	@Test
	public void movieRecommendation() {

		List<Movie> recommendations = recommender.recommendations(BBDD.JOHN);
		
		assertThat(recommendations.contains(BBDD.ET)).isFalse();
	}
	
	@Test 
	public void exportMoviesToCSV() {

		String csv = csvExporter.export(recommender.recommendations(BBDD.JOHN));
		
		String expected = "Saving Private Ryan,Spielberg,war";
		
		assertThat(csv).isEqualTo(expected);

	}

}
