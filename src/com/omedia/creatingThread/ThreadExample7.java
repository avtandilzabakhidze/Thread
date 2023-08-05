package com.omedia.creatingThread;

public class ThreadExample7 {
    public static void main(String[] args) {
        Runnable runnable = ()->{
            while (true){
                sleep(1000);
                System.out.println("running ");
            }


        };
        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();
        sleep(3001);
    }
    public static void sleep(long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
