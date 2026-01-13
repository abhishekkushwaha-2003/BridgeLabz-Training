package com.day2.callcenter;

public class CallCenterApp {

    public static void main(String[] args) {

        // Create call center object
        CallCenter callCenter = new CallCenter();

        // Incoming calls
        callCenter.addCall("Abhishek", false);
        callCenter.addCall("Rajeev", true);
        callCenter.addCall("Anni", false);
        callCenter.addCall("Titu", true);
        callCenter.addCall("Raaj", false);

        // Serve calls
        callCenter.serveCall();
        callCenter.serveCall();

        // Display call center status
        callCenter.displayStatus();
    }
}

