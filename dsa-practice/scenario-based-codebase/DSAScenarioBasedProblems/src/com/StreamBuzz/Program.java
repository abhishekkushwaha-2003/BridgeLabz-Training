package com.StreamBuzz;

import java.util.*;

public class Program {

    public void registerCreator(CreatorStats record) {
        CreatorStats.EngagementBoard.add(record);
    }

    public Map<String, Integer> getTopPostCounts(
            List<CreatorStats> records,
            double likeThreshold) {

        Map<String, Integer> result = new LinkedHashMap<>();

        for (CreatorStats c : records) {
            int count = 0;

            for (double likes : c.getWeeklyLikes()) {
                if (likes >= likeThreshold) {
                    count++;
                }
            }

            if (count > 0) {
                result.put(c.getCreatorName(), count);
            }
        }

        return result;
    }

    public double calculateAverageLikes() {

        double sum = 0;
        int total = 0;

        for (CreatorStats c : CreatorStats.EngagementBoard) {
            for (double likes : c.getWeeklyLikes()) {
                sum += likes;
                total++;
            }
        }

        if (total == 0) return 0;
        return sum / total;
    }
}