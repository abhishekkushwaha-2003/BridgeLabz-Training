package com.Assessment.EcoTrail;

import java.util.*;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TrailUtil util = new TrailUtil();

        System.out.println("Enter the number of trails to be added");
        int n = Integer.parseInt(sc.nextLine());

        System.out.println("Enter trail details");
        for (int i = 0; i < n; i++) {

            String input = sc.nextLine();
            String[] data = input.split(":");

            String trailId = data[0];
            String name = data[1];
            String region = data[2];
            String difficulty = data[3];
            int hikeCount = Integer.parseInt(data[4]);

            Trail trail = new Trail(trailId, name, region, difficulty, hikeCount);
            util.addTrailRecord(trail);
        }

        System.out.println("Enter the Trail Id to check hike status");
        String searchId = sc.nextLine();

        Trail found = util.getTrailById(searchId);
        if (found != null) {
            System.out.println(found);
        } else {
            System.out.println("Trail Id " + searchId + " not found");
        }

        System.out.println("Most hiked trails are");
        Set<Trail> mostHiked = util.getMostHikedTrails();
        for (Trail t : mostHiked) {
            System.out.println(t);
        }

        System.out.println("Region-wise hike counts");
        Map<String, Integer> regionMap = util.getHikeCountByRegion();
        for (String region : regionMap.keySet()) {
            System.out.println(region + ": " + regionMap.get(region) + " hikes");
        }

        System.out.println("Trails grouped by difficulty");
        Map<String, List<Trail>> difficultyMap = util.groupTrailsByDifficulty();

        for (String diff : difficultyMap.keySet()) {
            System.out.println(diff);
            for (Trail t : difficultyMap.get(diff)) {
                System.out.println(t);
            }
        }

        System.out.println("Enter Trail Id to update hikes and additional hikes");
        String[] updateInput = sc.nextLine().split(" ");

        String updateId = updateInput[0];
        int additionalHikes = Integer.parseInt(updateInput[1]);

        boolean updated = util.updateHikeCount(updateId, additionalHikes);

        if (updated) {
            System.out.println("Updated " + updateId + " by " + additionalHikes + " hikes");
            System.out.println(util.getTrailById(updateId));
        } else {
            System.out.println("Trail Id " + updateId + " not found");
        }

        System.out.println("Filter trails by region and difficulty");
        String[] filterInput = sc.nextLine().split(" ");

        String filterRegion = filterInput[0];
        String filterDifficulty = filterInput[1];

        List<Trail> filtered = util.filterTrails(filterRegion, filterDifficulty);
        for (Trail t : filtered) {
            System.out.println(t);
        }

        System.out.println("Top N trails per region");
        int topN = Integer.parseInt(sc.nextLine());

        Map<String, List<Trail>> topTrails = util.getTopTrailsByRegion(topN);

        for (String region : topTrails.keySet()) {
            System.out.println(region);
            for (Trail t : topTrails.get(region)) {
                System.out.println(t);
            }
        }

        System.out.println("Difficulty statistics");
        Map<String, String> stats = util.getDifficultyStats();

        for (String diff : stats.keySet()) {
            System.out.println(diff + ": " + stats.get(diff));
        }

        sc.close();
    }
}
