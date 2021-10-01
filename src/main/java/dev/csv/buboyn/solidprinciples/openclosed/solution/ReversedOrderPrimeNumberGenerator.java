package dev.csv.buboyn.solidprinciples.openclosed.solution;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReversedOrderPrimeNumberGenerator extends PrimeNumberGenerator{

    public ReversedOrderPrimeNumberGenerator() {
        this.comparator = Comparator.<Integer>naturalOrder().reversed();
    }
}
