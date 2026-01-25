package Day2.MedInventory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class InventoryReader {

    // dd-MM-yyyy
    private static final Pattern DATE_PATTERN =
            Pattern.compile("\\d{2}-\\d{2}-\\d{4}");

    public static Set<Item<String>> readInventory(String filePath) {

        Set<Item<String>> items = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            br.readLine(); 

            while ((line = br.readLine()) != null) {

                try {
                    String[] data = line.split(",");

                    String itemId = data[0];
                    String name = data[1];
                    int qty = Integer.parseInt(data[2]);
                    String expiry = data[3];

                    // regex check for date
                    if (!DATE_PATTERN.matcher(expiry).matches()) {
                        continue; 
                    }

                    items.add(
                        new Item<>(itemId, name, qty, expiry)
                    );

                } catch (Exception e) {
                  
                }
            }

        } catch (Exception e) {
            System.out.println("Error reading inventory file");
        }

        return items;
    }
}
