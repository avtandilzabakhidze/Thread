package com.omedia.creatingStartingStopping;

public class CreateThread1 {
    public static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("running thread");
            System.out.println("finished thread");
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.run();
    }
}
