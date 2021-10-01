package dev.csv.buboyn.solidprinciples.openclosed.solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrimeNumberGenerator {
   protected  Comparator<Integer> comparator;

	public List<Integer> primes (int limit) {
		
		List<Integer> primes = new ArrayList<>();
		for (int i = 2; i < limit; i++) {
			if (isPrime(i)) {
				primes.add(i);
			}
		}
		if(null != comparator) {
			Collections.sort(primes, comparator);
		}
		return primes;

	}
	
	private boolean isPrime (int candidate) {
		for (int i = 2; i < candidate; i++) {
			if (candidate % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
