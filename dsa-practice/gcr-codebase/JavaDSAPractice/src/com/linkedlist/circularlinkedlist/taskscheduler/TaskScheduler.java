package com.linkedlist.circularlinkedlist.taskscheduler;

class TaskScheduler {

    private Task head = null;     // first task
    private Task current = null;  // current running task

    // add task at end
    void addTaskAtEnd(int id, String name, int priority, String date) {

        Task newTask = new Task(id, name, priority, date);

        // if list is empty
        if (head == null) {
            head = newTask;
            newTask.next = head; // circular link
            current = head;
            return;
        }

        Task temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newTask;
        newTask.next = head;
    }

    // add task at beginning
    void addTaskAtBeginning(int id, String name, int priority, String date) {

        Task newTask = new Task(id, name, priority, date);

        // empty list
        if (head == null) {
            head = newTask;
            newTask.next = head;
            current = head;
            return;
        }

        Task temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        newTask.next = head;
        temp.next = newTask;
        head = newTask;
    }

    // remove task by ID
    void removeTask(int taskId) {

        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        Task temp = head;
        Task prev = null;

        do {
            if (temp.taskId == taskId) {

                // if only one task
                if (temp == head && temp.next == head) {
                    head = null;
                    current = null;
                }
                // if head task
                else if (temp == head) {
                    Task last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                }
                // middle or last task
                else {
                    prev.next = temp.next;
                }

                System.out.println("Task removed successfully");
                return;
            }

            prev = temp;
            temp = temp.next;

        } while (temp != head);

        System.out.println("Task not found");
    }

    // view current task and move to next
    void viewNextTask() {

        if (current == null) {
            System.out.println("No task to display");
            return;
        }

        System.out.println("Current Task:");
        System.out.println(current.taskId + " | " + current.taskName +
                " | Priority: " + current.priority +
                " | Due: " + current.dueDate);

        current = current.next; // move to next task
    }

    // display all tasks
    void displayAllTasks() {

        if (head == null) {
            System.out.println("Task list is empty");
            return;
        }

        Task temp = head;

        System.out.println("All Tasks:");
        do {
            System.out.println(temp.taskId + " | " + temp.taskName +
                    " | Priority: " + temp.priority +
                    " | Due: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    // search task by priority
    void searchByPriority(int priority) {

        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        Task temp = head;
        boolean found = false;

        do {
            if (temp.priority == priority) {
                System.out.println("Task Found: " + temp.taskName +
                        " (ID: " + temp.taskId + ")");
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No task with given priority");
        }
    }
}
