package com.day3.parceltracker;

//Node representing a delivery stage
public class StageNode {
 String stage;
 StageNode next;

 public StageNode(String stage) {
     this.stage = stage;
     this.next = null;
 }
}

