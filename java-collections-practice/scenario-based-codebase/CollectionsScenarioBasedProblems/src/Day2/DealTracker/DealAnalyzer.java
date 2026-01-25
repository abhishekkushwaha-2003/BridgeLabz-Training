package Day2.DealTracker;

import java.util.*;

public class DealAnalyzer {

    private Map<String, Deal> dealMap = new HashMap<>();
    private Set<String> dealCodes = new HashSet<>();

    public void addDeal(Deal deal) {

        if (dealCodes.contains(deal.getCode())) {
            return; 
        }

        if (!DealReader.isExpired(deal.getValidTill())) {
            dealCodes.add(deal.getCode());
            dealMap.put(deal.getCode(), deal);
        }
    }

    public List<Deal> getDealsSortedByDiscount() {

        List<Deal> list = new ArrayList<>(dealMap.values());

        list.sort(
                (d1, d2) -> d2.getDiscount() - d1.getDiscount()
        );

        return list;
    }
}

