package com.day2.texteditor;

//Class representing an editor action
class EditorAction {

 String type;   // INSERT or DELETE
 String text;   // Text involved

 EditorAction(String type, String text) {
     this.type = type;
     this.text = text;
 }
}

