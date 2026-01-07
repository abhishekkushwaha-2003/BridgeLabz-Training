package com.linkedlist.circularlinkedlist.taskscheduler;

//Node class for Task
class Task {

 int taskId;
 String taskName;
 int priority;
 String dueDate;
 Task next;   // points to next task

 // constructor
 Task(int taskId, String taskName, int priority, String dueDate) {
     this.taskId = taskId;
     this.taskName = taskName;
     this.priority = priority;
     this.dueDate = dueDate;
     this.next = null;
 }
}
