package Day2.MedInventory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class InventoryAnalyzer {

    private static final int CRITICAL_LEVEL = 5;

    public static Map<String, List<Item<String>>> categorizeItems(
            Set<Item<String>> items) throws InventoryException {

        Map<String, List<Item<String>>> map = new HashMap<>();
        map.put("Expired", new ArrayList<>());
        map.put("Valid", new ArrayList<>());

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate today = LocalDate.now();

        for (Item<String> item : items) {

            LocalDate expiry =
                    LocalDate.parse(item.getExpiryDate(), formatter);

            if (item.getQuantity() <= CRITICAL_LEVEL) {
                throw new InventoryException(
                        "Critical stock alert for: " + item.getItemName()
                );
            }

            if (expiry.isBefore(today)) {
                map.get("Expired").add(item);
            } else {
                map.get("Valid").add(item);
            }
        }
        return map;
    }
}

