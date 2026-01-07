package com.sortingalgorithm.heapsort.sortjobapplicantsbysalary;

class HeapSortSalary {

    // main heap sort method
    static void heapSort(int[] arr) {

        int n = arr.length;

        // build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // extract elements one by one
        for (int i = n - 1; i > 0; i--) {

            // swap root with last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // heapify reduced heap
            heapify(arr, i, 0);
        }
    }

    // heapify method
    static void heapify(int[] arr, int size, int root) {

        int largest = root;
        int left = 2 * root + 1;
        int right = 2 * root + 2;

        if (left < size && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < size && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != root) {

            int temp = arr[root];
            arr[root] = arr[largest];
            arr[largest] = temp;

            heapify(arr, size, largest);
        }
    }
    
   	static void display(int[] arr) {
   		
    		for (int salary : arr) {
    			System.out.print(salary + " ");
    		}
    			System.out.println();
    }
}
