import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Portfolio portfolio = new Portfolio();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Stock Trading Platform ---");
            System.out.println("1. View Market Stocks");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. View Portfolio");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    market.displayStocks();
                    break;
                case 2:
                    System.out.print("Enter Stock Symbol to Buy: ");
                    String buySymbol = scanner.next();
                    System.out.print("Enter Quantity: ");
                    int buyQuantity = scanner.nextInt();
                    portfolio.buyStock(market, buySymbol, buyQuantity);
                    break;
                case 3:
                    System.out.print("Enter Stock Symbol to Sell: ");
                    String sellSymbol = scanner.next();
                    System.out.print("Enter Quantity: ");
                    int sellQuantity = scanner.nextInt();
                    portfolio.sellStock(sellSymbol, sellQuantity);
                    break;
                case 4:
                    portfolio.displayPortfolio();
                    break;
                case 5:
                    System.out.println("Exiting... Thank you for using the platform!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}