package com.omedia.creatingStartingStopping;

public class ThreadSleep {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            String threadName =Thread.currentThread().getName();
            System.out.println("running  : "+ threadName);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("finished  : "+ threadName);
        };
        Thread thread = new Thread(runnable,"Name");
        thread.start();
    }
}
