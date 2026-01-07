package com.linkedlist.doublylinkedlist.texteditorapp;

//Node class representing one text state
class TextState {

 String content;      // text content
 TextState prev;      // previous state (undo)
 TextState next;      // next state (redo)

 // constructor
 TextState(String content) {
     this.content = content;
     this.prev = null;
     this.next = null;
 }
}

