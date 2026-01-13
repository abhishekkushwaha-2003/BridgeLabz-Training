package com.day2.texteditor;

public class TextEditorApp {

    public static void main(String[] args) {

        // Create text editor
        TextEditor editor = new TextEditor();

        // Perform operations
        editor.insertText("Hello");
        editor.insertText(" World");
        editor.displayContent();

        // Delete text
        editor.deleteText(6);
        editor.displayContent();

        // Undo operations
        editor.undo();
        editor.displayContent();

        editor.undo();
        editor.displayContent();

        // Redo operations
        editor.redo();
        editor.displayContent();
    }
}
