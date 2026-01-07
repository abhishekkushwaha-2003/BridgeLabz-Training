package com.sortingalgorithm.countingsort.sortstudentage;

class CountingSortStudentAge {

    static void countingSort(int[] ages, int minAge, int maxAge) {

        int range = maxAge - minAge + 1;

        // count array
        int[] count = new int[range];

        // store frequency of each age
        for (int age : ages) {
            count[age - minAge]++;
        }

        // cumulative count
        for (int i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i - 1];
        }

        // output array
        int[] output = new int[ages.length];

        // build output array
        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            int position = count[age - minAge] - 1;
            output[position] = age;
            count[age - minAge]--;
        }

        // copy back to original array
        for (int i = 0; i < ages.length; i++) {
            ages[i] = output[i];
        }
    }
}
