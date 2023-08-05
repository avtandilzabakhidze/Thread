package com.omedia.creatingThread;

public class ThreadExample4 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("thread starting !");
            System.out.println("thread ended !");
        };
        Thread myThread = new Thread(runnable);
        myThread.start();
    }
}
