import java.util.HashMap;

public class Portfolio {
    private HashMap<String, Integer> ownedStocks;

    public Portfolio() {
        ownedStocks = new HashMap<>();
    }

    public void buyStock(Market market, String symbol, int quantity) {
        Stock stock = market.getStock(symbol);
        if (stock != null) {
            ownedStocks.put(symbol, ownedStocks.getOrDefault(symbol, 0) + quantity);
            System.out.println("Bought " + quantity + " shares of " + stock.getName());
        } else {
            System.out.println("Stock not found in the market.");
        }
    }

    public void sellStock(String symbol, int quantity) {
        if (ownedStocks.containsKey(symbol)) {
            int currentQuantity = ownedStocks.get(symbol);
            if (quantity <= currentQuantity) {
                ownedStocks.put(symbol, currentQuantity - quantity);
                System.out.println("Sold " + quantity + " shares of " + symbol);
                if (ownedStocks.get(symbol) == 0) {
                    ownedStocks.remove(symbol);
                }
            } else {
                System.out.println("You don't own that many shares.");
            }
        } else {
            System.out.println("You don't own this stock.");
        }
    }

    public void displayPortfolio() {
        System.out.println("\n--- Your Portfolio ---");
        if (ownedStocks.isEmpty()) {
            System.out.println("No stocks owned.");
        } else {
            for (String symbol : ownedStocks.keySet()) {
                System.out.println(symbol + ": " + ownedStocks.get(symbol) + " shares");
            }
        }
    }
}