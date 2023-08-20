package com.omedia.raiceCondition;

public class CounterSynchronized {
    private long count = 0;

    public long inkAndGet() {
        synchronized (this) {
            this.count++;
            return this.count;
        }
    }

    public long getCount() {
        synchronized (this) {
            return this.count;
        }
    }
}
