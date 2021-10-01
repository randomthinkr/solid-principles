package dev.csv.buboyn.solidprinciples.dependencyinversion.solution.service.impl;

import dev.csv.buboyn.solidprinciples.dependencyinversion.problem.bbdd.StockRepository;
import dev.csv.buboyn.solidprinciples.dependencyinversion.solution.service.StockService;
import org.springframework.stereotype.Service;

@Service
public class StockServiceImpl implements StockService {

    private final StockRepository stockRepository;

    public StockServiceImpl(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    @Override
    public int getStock(String shop, String product) {
       return stockRepository.getStock(shop, product);
    }

}
