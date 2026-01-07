package com.linkedlist.doublylinkedlist.texteditorapp;

class TextEditor {

    private TextState head;        // first state
    private TextState tail;        // last state
    private TextState current;     // current text state
    private int size;              // number of states
    private final int MAX = 10;    // max undo/redo limit

    // add new text state
    void addState(String text) {

        TextState newNode = new TextState(text);

        // if first state
        if (head == null) {
            head = tail = current = newNode;
            size = 1;
            return;
        }

        // remove redo history
        if (current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
        }

        // add at end
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        current = newNode;
        size++;

        // limit history size
        if (size > MAX) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // undo operation
    void undo() {

        if (current == null || current.prev == null) {
            System.out.println("Nothing to undo");
            return;
        }

        current = current.prev;
        System.out.println("Undo successful");
    }

    // redo operation
    void redo() {

        if (current == null || current.next == null) {
            System.out.println("Nothing to redo");
            return;
        }

        current = current.next;
        System.out.println("Redo successful");
    }

    // display current text
    void showCurrentState() {

        if (current == null) {
            System.out.println("Editor is empty");
        } else {
            System.out.println("Current Text: " + current.content);
        }
    }
}
