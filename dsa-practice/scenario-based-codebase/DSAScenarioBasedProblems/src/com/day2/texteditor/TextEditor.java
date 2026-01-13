package com.day2.texteditor;

import java.util.Stack;

//Text editor with undo/redo functionality
public class TextEditor {

 // Stack to store performed actions
 private Stack<EditorAction> undoStack;

 // Stack to store undone actions
 private Stack<EditorAction> redoStack;

 // Actual editor content
 private StringBuilder content;

 // Constructor
 public TextEditor() {
     undoStack = new Stack<>();
     redoStack = new Stack<>();
     content = new StringBuilder();
 }

 // Insert text operation
 public void insertText(String text) {

     // Append text to editor
     content.append(text);

     // Push action to undo stack
     undoStack.push(new EditorAction("INSERT", text));

     // Clear redo stack (new action breaks redo chain)
     redoStack.clear();

     System.out.println("Inserted: " + text);
 }

 // Delete last N characters
 public void deleteText(int length) {

     if (length > content.length()) {
         length = content.length();
     }

     // Get deleted text
     String deleted = content.substring(
             content.length() - length
     );

     // Remove text
     content.delete(content.length() - length, content.length());

     // Push delete action
     undoStack.push(new EditorAction("DELETE", deleted));

     // Clear redo stack
     redoStack.clear();

     System.out.println("Deleted: " + deleted);
 }

 // Undo last action
 public void undo() {

     if (undoStack.isEmpty()) {
         System.out.println("Nothing to undo");
         return;
     }

     EditorAction action = undoStack.pop();

     if (action.type.equals("INSERT")) {
         // Undo insert → remove inserted text
         content.delete(
             content.length() - action.text.length(),
             content.length()
         );
     }
     else if (action.type.equals("DELETE")) {
         // Undo delete → reinsert deleted text
         content.append(action.text);
     }

     // Push action to redo stack
     redoStack.push(action);

     System.out.println("Undo performed");
 }

 // Redo last undone action
 public void redo() {

     if (redoStack.isEmpty()) {
         System.out.println("Nothing to redo");
         return;
     }

     EditorAction action = redoStack.pop();

     if (action.type.equals("INSERT")) {
         content.append(action.text);
     }
     else if (action.type.equals("DELETE")) {
         content.delete(
             content.length() - action.text.length(),
             content.length()
         );
     }

     // Push back to undo stack
     undoStack.push(action);

     System.out.println("Redo performed");
 }

 // Display current editor content
 public void displayContent() {
     System.out.println("Current Text: " + content);
 }
}
