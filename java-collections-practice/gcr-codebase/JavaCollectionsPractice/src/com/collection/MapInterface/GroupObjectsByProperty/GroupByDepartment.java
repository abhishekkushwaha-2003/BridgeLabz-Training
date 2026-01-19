package com.collection.MapInterface.GroupObjectsByProperty;

import java.util.*;
class GroupByDepartment {

    public static void main(String[] args) {

    	// adding elements in list
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Abhishek", "HR"));
        employees.add(new Employee("Rajiv", "IT"));
        employees.add(new Employee("Rahul", "HR"));

        Map<String, List<Employee>> departmentMap = new HashMap<>();

        for (Employee emp : employees) {

            if (!departmentMap.containsKey(emp.department)) {
                departmentMap.put(emp.department, new ArrayList<>());
            }

            departmentMap.get(emp.department).add(emp);
        }

        // Display result
        for (String dept : departmentMap.keySet()) {
            System.out.print(dept + ": ");
            for (Employee e : departmentMap.get(dept)) {
                System.out.print(e.name + " ");
            }
            System.out.println();
        }
    }
}