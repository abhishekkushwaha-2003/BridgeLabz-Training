package com.linkedlist.doublylinkedlist.texteditorapp;

public class UndoRedoEditor {

    public static void main(String[] args) {

        // creating text editor object
        TextEditor editor = new TextEditor();

        // typing text (adding states)
        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World !");
        editor.addState("Hello World !!!");

        // show current text
        editor.showCurrentState();

        System.out.println("----------------");

        // undo last action
        editor.undo();
        editor.showCurrentState();

        System.out.println("----------------");

        // undo again
        editor.undo();
        editor.showCurrentState();

        System.out.println("----------------");

        // redo action
        editor.redo();
        editor.showCurrentState();

        System.out.println("----------------");

        // add new text after undo (redo history cleared)
        editor.addState("Hello Java");
        editor.showCurrentState();

        System.out.println("----------------");

        // try redo (not possible now)
        editor.redo();
    }
}
