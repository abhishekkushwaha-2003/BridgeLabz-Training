package com.linkedlist.circularlinkedlist.taskscheduler;

public class TaskSchedulerApp {

    public static void main(String[] args) {

        // create scheduler object
        TaskScheduler scheduler = new TaskScheduler();

        // adding tasks
        scheduler.addTaskAtEnd(101, "Submit Assignment", 1, "10-Oct");
        scheduler.addTaskAtEnd(102, "Prepare Notes", 2, "12-Oct");
        scheduler.addTaskAtBeginning(100, "Daily Standup", 1, "09-Oct");

        System.out.println("------------------");

        // display all tasks
        scheduler.displayAllTasks();

        System.out.println("------------------");

        // view tasks one by one (circular)
        scheduler.viewNextTask();
        scheduler.viewNextTask();
        scheduler.viewNextTask();

        System.out.println("------------------");

        // search task by priority
        scheduler.searchByPriority(1);

        System.out.println("------------------");

        // remove a task
        scheduler.removeTask(102);

        System.out.println("------------------");

        // display tasks again
        scheduler.displayAllTasks();
    }
}
