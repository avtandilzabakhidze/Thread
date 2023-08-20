package com.omedia.creatingStartingStopping;

public class ThreadJoin {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                sleep(1000);
                System.out.println("Running");
            }
        };
        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void sleep(long miles) {
        try {
            Thread.sleep(miles);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
