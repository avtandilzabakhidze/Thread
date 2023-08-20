package com.omedia.creatingStartingStopping;

public class CreatingThread3 {
    public static void main(String[] args){
         Runnable runnable = new Runnable(){
             @Override
             public void run(){
                 System.out.println("running thread");
                 System.out.println("finished thread");
            }
        };
         Thread thread = new Thread(runnable);
         thread.run();
    }
}
