package Day2.MedInventory;

import java.util.Map;
import java.util.Set;

public class MedInventoryMain {
    public static void main(String[] args) {

        String filePath = "inventory/inventory.csv";

        Set<Item<String>> items =
                InventoryReader.readInventory(filePath);

        try {
            Map<String, java.util.List<Item<String>>> result =
                    InventoryAnalyzer.categorizeItems(items);

            System.out.println("\nExpired Items:");
            result.get("Expired").forEach(System.out::println);

            System.out.println("\nValid Items:");
            result.get("Valid").forEach(System.out::println);

        } catch (InventoryException e) {
            System.out.println(e.getMessage());
        }
    }
}

