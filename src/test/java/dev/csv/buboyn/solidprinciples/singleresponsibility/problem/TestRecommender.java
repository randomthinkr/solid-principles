package dev.csv.buboyn.solidprinciples.singleresponsibility.problem;

import java.util.List;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestRecommender {

	@Test
	public void basic_test() {
		Recommender r = new Recommender();
		
		List<Movie> recommendations = r.recommendations(BBDD.JOHN);
		
		assertThat(recommendations.contains(BBDD.ET)).isFalse();
	}
	
	@Test 
	public void test_format() {
		Recommender r = new Recommender();
		
		String csv = r.recommendationsCSV(BBDD.JOHN);
		
		String expected = "Saving Private Ryan,Spielberg,war";
		
		assertThat(csv).isEqualTo(expected);

	}

}
