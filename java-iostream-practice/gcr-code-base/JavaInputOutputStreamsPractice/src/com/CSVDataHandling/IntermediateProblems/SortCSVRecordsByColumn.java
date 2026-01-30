package com.CSVDataHandling.IntermediateProblems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class SortCSVRecordsByColumn {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        try {
            BufferedReader br =
                new BufferedReader(new FileReader("data/employees.csv"));

            String line;

            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String name = data[1];
                int salary = Integer.parseInt(data[3]);
                list.add(new Employee(name, salary));
            }

            br.close();

            list.sort((e1, e2) -> e2.salary - e1.salary);

            System.out.println("Top 5 Highest Paid Employees:");
            for (int i = 0; i < Math.min(5, list.size()); i++) {
                Employee e = list.get(i);
                System.out.println(e.name + " : " + e.salary);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

