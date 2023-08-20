package com.omedia.raiceCondition;

public class RaiseConditionSynchronizedExample {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread thread = new Thread(getRunnable(counter,"thread one final count : "));
        Thread thread1 = new Thread(getRunnable(counter,"thread two final count : "));

        thread.start();
        thread1.start();
    }
    private static Runnable getRunnable(Counter counter,String message){
            return ()->{
                for (int i = 0; i < 1000_000; i++) {
                    counter.inkAndGet();
                }
                System.out.println(message + counter.getCount());
            };

    }
}
