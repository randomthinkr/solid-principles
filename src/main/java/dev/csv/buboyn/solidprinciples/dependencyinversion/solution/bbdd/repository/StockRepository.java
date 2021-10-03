package dev.csv.buboyn.solidprinciples.dependencyinversion.solution.bbdd.repository;


import dev.csv.buboyn.solidprinciples.dependencyinversion.solution.bbdd.data.DataBase;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository {


	// Database query method
	default int getStock(String shop, String product) {
		return DataBase.stocks.get(shop).get(product);
	}
}
