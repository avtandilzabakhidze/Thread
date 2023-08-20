package com.omedia.creatingStartingStopping;

public class ThreadRunningDaemon {
    public static void main(String[] args){
        Runnable runnable = () ->{
            while (true){
            sleep(1000);
            System.out.println("Running");
            }
        };


        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();
        sleep(3100);
    }
    public static void sleep(long miles){
        try {
            Thread.sleep(miles);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
