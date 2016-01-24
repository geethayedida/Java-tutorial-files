package com.first.Jan92016.JavaTutorial;

/**
 * Created by Geetha Yedida on 1/23/2016.
 */
public class MyThread extends Thread{
    private MyThread t;
    private String threadName;

    protected MyThread(String name){
        threadName = name;
    }

    public void run() {
        synchronized (this){
            for (int i = 0 ; i < 10 ; i++) {
                try {
                    Thread.sleep(1000);
                    System.out.println(threadName +" " + i );
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }System.out.println("Finished child Thread");
        }
    }
 }
