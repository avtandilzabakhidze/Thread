package com.omedia.creatingStartingStopping;

public class CreateThread2 {
  public static class MyRunnable implements Runnable{
      @Override
      public void run() {
          System.out.println("running Thread");
          System.out.println("finished Thread");
      }
  }

  public static void main(String[] args){
      Thread thread = new Thread(new MyRunnable());
      thread.start();
  }
}
