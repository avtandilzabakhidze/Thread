package com.omedia.creatingThread;

public class ThreadExample3 {

    public static void main(String[] args) {

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("thread running !");
            System.out.println("thread ended !");
        }
    };

    Thread myThread = new Thread(runnable);
    myThread.start();
    }

}
