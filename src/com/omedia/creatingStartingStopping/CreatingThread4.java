package com.omedia.creatingStartingStopping;

public class CreatingThread4 {
    public static void main(String[] args){
        Runnable runnable = () ->{
            System.out.println("running thread");
            System.out.println("finished thread");
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
