package Day2.DealTracker;

import java.nio.file.Files;
import java.nio.file.Paths;

public class DealTrackerMain {
    public static void main(String[] args) {

        DealAnalyzer analyzer = new DealAnalyzer();

        try {
            Files.list(Paths.get("deals"))
                    .filter(p -> p.toString().endsWith(".txt"))
                    .forEach(p -> {
                        Deal d = DealReader.readDeal(p.toString());
                        if (d != null) {
                            analyzer.addDeal(d);
                        }
                    });

        } catch (Exception e) {
            System.out.println("Error reading deals folder");
        }

        System.out.println("\n--- Valid Deals (Sorted by Discount) ---");
        analyzer.getDealsSortedByDiscount()
                .forEach(System.out::println);
    }
}
