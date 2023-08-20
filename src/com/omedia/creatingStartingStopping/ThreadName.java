package com.omedia.creatingStartingStopping;

public class ThreadName {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            String threadName =Thread.currentThread().getName();
            System.out.println("running thread : "+ threadName);
        };
        Thread thread = new Thread(runnable,"Name");
        thread.start();
    }
}
