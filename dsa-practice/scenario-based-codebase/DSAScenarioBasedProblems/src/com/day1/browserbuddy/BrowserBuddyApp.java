package com.day1.browserbuddy;

public class BrowserBuddyApp {

    public static void main(String[] args) {

        // Create browser history object
        BrowserHistory browser = new BrowserHistory();

        // Visit pages
        browser.visitPage("google.com");
        browser.visitPage("github.com");
        browser.visitPage("stackoverflow.com");

        // Navigate back
        browser.goBack();
        browser.goBack();

        // Navigate forward
        browser.goForward();

        // Close current tab
        browser.closeTab();

        // Reopen last closed tab
        browser.reopenTab();
    }
}
