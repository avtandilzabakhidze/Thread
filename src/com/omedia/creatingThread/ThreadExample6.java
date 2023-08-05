package com.omedia.creatingThread;

public class ThreadExample6 {
    public static class StoppableRunnable implements Runnable {
        private boolean stopRequested = false;

        public synchronized void requestStop() {
            this.stopRequested = true;
        }

        public synchronized boolean isStopRequested() {
            return this.stopRequested;
        }

        public void sleep(long miles) {
            try {
                Thread.sleep(miles);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        @Override
        public void run() {
            System.out.println("StoppableRunnable running");
            while (!isStopRequested()) {
                sleep(1000);
                System.out.println("...");
            }
        }
    }

    public static void main(String[] args) {
        StoppableRunnable stoppableRunnable = new StoppableRunnable();
        Thread thread = new Thread(stoppableRunnable, "The Thread ");
        thread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("requesting stop");
        stoppableRunnable.requestStop();
        System.out.println("stop requested");
    }
}
