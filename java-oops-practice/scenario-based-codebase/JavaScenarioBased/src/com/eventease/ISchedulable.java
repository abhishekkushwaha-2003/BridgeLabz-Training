package com.eventease;

//interface for scheduling events
interface ISchedulable {

 void schedule();
 void reschedule(String newDate);
 void cancel();
}
