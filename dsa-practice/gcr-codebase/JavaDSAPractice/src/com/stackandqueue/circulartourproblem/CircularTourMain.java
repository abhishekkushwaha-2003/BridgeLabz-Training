package com.stackandqueue.circulartourproblem;

import java.util.*;

public class CircularTourMain {

    // Method to find starting petrol pump
    static int findStartingPump(PetrolPump[] pumps) {

        Queue<Integer> queue = new LinkedList<>();
        int currentPetrol = 0;
        int n = pumps.length;
        int i = 0;

        while (i < 2 * n) {

            int index = i % n;
            queue.add(index);

            currentPetrol += pumps[index].petrol - pumps[index].distance;

            // Remove pumps until petrol becomes positive
            while (currentPetrol < 0 && !queue.isEmpty()) {
                int removed = queue.poll();
                currentPetrol -= pumps[removed].petrol - pumps[removed].distance;
            }

            // If all pumps are covered
            if (queue.size() == n)
                return queue.peek();

            i++;
        }
        return -1;
    }

    // Main method
    public static void main(String[] args) {

        PetrolPump[] pumps = {
            new PetrolPump(6, 4),
            new PetrolPump(3, 6),
            new PetrolPump(7, 3)
        };

        int start = findStartingPump(pumps);

        if (start == -1)
            System.out.println("Circular tour not possible");
        else
            System.out.println("Start tour from petrol pump index: " + start);
    }
}

