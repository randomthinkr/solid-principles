package dev.csv.buboyn.solidprinciples.dependencyinversion.problem.bbdd;


public class StockRepository {


	// Database query method
	
	public int getStock(String shop, String product) {
		return DataBase.stocks.get(shop).get(product);
	}
}
