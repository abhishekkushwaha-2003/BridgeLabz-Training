package com.linkedlist.circularlinkedlist.roundrobinschedulingalgorithm;

class RoundRobinScheduler {

    private Process head = null;

    // add process at end (circular)
    void addProcess(int id, int burst, int priority) {

        Process newProcess = new Process(id, burst, priority);

        // if list empty
        if (head == null) {
            head = newProcess;
            newProcess.next = head;
            return;
        }

        Process temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newProcess;
        newProcess.next = head;
    }

    // remove process by id
    void removeProcess(int id) {

        if (head == null)
            return;

        Process temp = head;
        Process prev = null;

        do {
            if (temp.processId == id) {

                // only one process
                if (temp == head && temp.next == head) {
                    head = null;
                }
                // removing head
                else if (temp == head) {
                    Process last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                }
                // removing middle/last
                else {
                    prev.next = temp.next;
                }
                return;
            }

            prev = temp;
            temp = temp.next;

        } while (temp != head);
    }

    // display process list
    void displayProcesses() {

        if (head == null) {
            System.out.println("No processes left");
            return;
        }

        Process temp = head;
        do {
            System.out.println("P" + temp.processId +
                    " | Remaining Time: " + temp.remainingTime);
            temp = temp.next;
        } while (temp != head);
    }

    // round robin scheduling logic
    void schedule(int timeQuantum) {

        if (head == null) {
            System.out.println("No process to schedule");
            return;
        }

        int currentTime = 0;
        int completed = 0;
        int totalWaitingTime = 0;
        int totalTurnAroundTime = 0;

        Process current = head;

        while (head != null) {

            // process executes
            if (current.remainingTime > 0) {

                if (current.remainingTime > timeQuantum) {
                    current.remainingTime -= timeQuantum;
                    currentTime += timeQuantum;
                } else {
                    currentTime += current.remainingTime;
                    current.remainingTime = 0;

                    // calculate times
                    current.turnAroundTime = currentTime;
                    current.waitingTime =
                            current.turnAroundTime - current.burstTime;

                    totalWaitingTime += current.waitingTime;
                    totalTurnAroundTime += current.turnAroundTime;

                    completed++;

                    int pid = current.processId;
                    current = current.next;
                    removeProcess(pid);

                    System.out.println("Process P" + pid + " completed");
                    displayProcesses();
                    System.out.println("------------------");
                    continue;
                }
            }

            current = current.next;
        }

        // average calculation
        System.out.println("Average Waiting Time: " +
                (double) totalWaitingTime / completed);
        System.out.println("Average Turnaround Time: " +
                (double) totalTurnAroundTime / completed);
    }
}
