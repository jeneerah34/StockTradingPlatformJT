import java.util.HashMap;

public class Market {
    private HashMap<String, Stock> stocks;

    public Market() {
        stocks = new HashMap<>();
        stocks.put("AAPL", new Stock("AAPL", "Apple Inc.", 150.0));
        stocks.put("GOOGL", new Stock("GOOGL", "Alphabet Inc.", 2800.0));
        stocks.put("AMZN", new Stock("AMZN", "Amazon.com Inc.", 3400.0));
        stocks.put("TSLA", new Stock("TSLA", "Tesla Inc.", 700.0));
    }

    public void displayStocks() {
        System.out.println("\n--- Market Stocks ---");
        for (Stock stock : stocks.values()) {
            System.out.println(stock);
        }
    }

    public Stock getStock(String symbol) {
        return stocks.get(symbol.toUpperCase());
    }
}