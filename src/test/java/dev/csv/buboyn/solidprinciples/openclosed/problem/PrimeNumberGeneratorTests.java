package dev.csv.buboyn.solidprinciples.openclosed.problem;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class PrimeNumberGeneratorTests {
	
	@Test
	public void test_natural_order() {
		
		PrimeNumberGenerator generator = new PrimeNumberGenerator();
		List<Integer> expected = Arrays.asList(2,3,5,7,11,13);
		
		assertThat(generator.primes(15), is(expected));
	}	

	@Test
	public void test_reverse_order() {
		
		PrimeNumberGenerator generator = new PrimeNumberGenerator();
		List<Integer> expected = Arrays.asList(13,11,7,5,3,2);
		
		assertThat(generator.primes(15), is(expected));
	}	

}
