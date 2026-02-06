package com.StreamBuzz;

import java.util.*;
public class StreamBuzzApp {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Program p = new Program();

        while (true) {

            System.out.println("1. Register Creator");
            System.out.println("2. Show Top Posts");
            System.out.println("3. Calculate Average Likes");
            System.out.println("4. Exit");
            System.out.print("Enter your choice:");

            int choice = sc.nextInt();

            if (choice == 1) {

                sc.nextLine();
                System.out.println("Enter Creator Name : ");
                String name = sc.nextLine();

                System.out.println("Enter weekly likes (Week 1 to 4) : ");

                double[] likes = new double[4];
                for (int i = 0; i < 4; i++) {
                    likes[i] = sc.nextDouble();
                }

                p.registerCreator(new CreatorStats(name, likes));
                System.out.println("Creator registered successfully");
            }

            else if (choice == 2) {

                System.out.println("Enter like threshold : ");
                double threshold = sc.nextDouble();

                Map<String, Integer> map =
                        p.getTopPostCounts(
                                CreatorStats.EngagementBoard,
                                threshold);

                if (map.isEmpty()) {
                    System.out.println("No top-performing posts this week");
                } else {
                    map.entrySet()
                       .stream()
                       .forEach(e ->
                           System.out.println(
                               e.getKey() + " - " + e.getValue()));
                }
            }

            else if (choice == 3) {

                double avg = p.calculateAverageLikes();
                System.out.println(
                    "Overall average weekly likes : " + avg);
            }

            else if (choice == 4) {

                System.out.println(
                  "Logging off — Keep Creating with StreamBuzz!");
                break; 
            }
        }
    }
}