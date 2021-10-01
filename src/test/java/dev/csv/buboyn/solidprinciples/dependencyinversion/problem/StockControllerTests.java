package dev.csv.buboyn.solidprinciples.dependencyinversion.problem;


import dev.csv.buboyn.solidprinciples.dependencyinversion.problem.bbdd.StockRepository;
import dev.csv.buboyn.solidprinciples.dependencyinversion.solution.business.StockController;
import dev.csv.buboyn.solidprinciples.dependencyinversion.solution.service.impl.StockServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StockControllerTests {

	@Test
	public void test_stock_control() {
		StockController controller = new StockController(new StockServiceImpl(new StockRepository()));
		
		assertFalse(controller.needMoreItemsInShop("north shop", "table"));
		assertTrue(controller.needMoreItemsInShop("north shop", "lamp"));

	}

}
