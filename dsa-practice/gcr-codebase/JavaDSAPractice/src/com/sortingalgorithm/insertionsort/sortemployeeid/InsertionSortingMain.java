package com.sortingalgorithm.insertionsort.sortemployeeid;

class InsertionSortMain {

    // method to display employee IDs
    static void display(int[] ids) {
        for (int id : ids) {
            System.out.print(id + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] employeeArray = {105, 102, 110, 101, 108};

        // create employee object
        EmployeeIds employees = new EmployeeIds(employeeArray);

        // create sorter object
        InsertionSorting sorter = new InsertionSorting();

        System.out.println("Before Sorting:");
        display(employees.getIds());

        // sort employee IDs
        sorter.sort(employees.getIds());

        System.out.println("After Sorting (Ascending):");
        display(employees.getIds());
    }
}

