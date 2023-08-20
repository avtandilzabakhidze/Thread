package com.omedia.creatingStartingStopping;

public class ThreadStop {
    public static class StoppableRunnable implements Runnable{
        private boolean stopRequested = false;

        public synchronized void requestStop() {
            this.stopRequested = true;
        }

        public synchronized boolean isStopRequested(){
            return this.stopRequested;
        }

        private void sleep(long miles){
            try {
                Thread.sleep(miles);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run(){
            System.out.println("Stoppable Runnable running");
            while(!isStopRequested()){
                sleep(1000);
                System.out.println("...");
            }
            System.out.println("Stoppable Runnable finished");

        }
    }
    public static void main(String[] args){
        StoppableRunnable stoppableRunnable = new StoppableRunnable();
        Thread thread = new Thread(stoppableRunnable,"Thread-1");
        thread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Requesting stop");
        stoppableRunnable.requestStop();
        System.out.println("stopped");

    }
}
