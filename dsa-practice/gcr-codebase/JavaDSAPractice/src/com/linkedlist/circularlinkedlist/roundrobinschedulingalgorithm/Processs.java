package com.linkedlist.circularlinkedlist.roundrobinschedulingalgorithm;

//Node class for process
class Process {

 int processId;
 int burstTime;
 int remainingTime;
 int priority;

 int waitingTime = 0;
 int turnAroundTime = 0;

 Process next;

 // constructor
 Process(int processId, int burstTime, int priority) {
     this.processId = processId;
     this.burstTime = burstTime;
     this.remainingTime = burstTime;
     this.priority = priority;
     this.next = null;
 }
}
