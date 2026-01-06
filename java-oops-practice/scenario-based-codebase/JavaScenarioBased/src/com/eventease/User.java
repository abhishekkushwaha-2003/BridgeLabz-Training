package com.eventease;

//user class for event organizer
class User {

 private String name;
 private String email;

 User(String name, String email) {
     this.name = name;
     this.email = email;
 }

 public String getName() {
     return name;
 }
}
