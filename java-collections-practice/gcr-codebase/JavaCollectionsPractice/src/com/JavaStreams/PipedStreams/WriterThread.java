package com.JavaStreams.PipedStreams;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

// Writer thread
class WriterThread extends Thread {

    private PipedOutputStream outputStream;

    WriterThread(PipedOutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public void run() {

        try {
            String message = "Hello from Writer Thread";

            // Write data to pipe
            outputStream.write(message.getBytes());
            outputStream.close();

        } catch (IOException e) {
            System.out.println("Writer error: " + e.getMessage());
        }
    }
}