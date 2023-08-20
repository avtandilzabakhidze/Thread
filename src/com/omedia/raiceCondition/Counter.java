package com.omedia.raiceCondition;

public class Counter {
    private long count =0;

    public long inkAndGet(){
        this.count++;
        return this.count;
    }

    public long getCount(){
        return this.count;
    }
}
