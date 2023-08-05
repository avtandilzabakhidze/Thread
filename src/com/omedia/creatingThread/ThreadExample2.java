package com.omedia.creatingThread;

public class ThreadExample2 {
    public static class MyThread implements Runnable {
        @Override
        public void run() {
            System.out.println("MyThread running !");
            System.out.println("MyThread finished !");
        }
    }

    public static void main(String[] args) {
        Thread myThread = new Thread(new MyThread());
        myThread.start();
    }
}
