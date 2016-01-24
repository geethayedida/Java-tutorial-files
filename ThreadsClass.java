package com.first.Jan92016.JavaTutorial;

/**
 * Created by Geetha Yedida on 1/23/2016.
 */
public class ThreadsClass {

    public static void main(String[] args) throws InterruptedException {

        MyThread mt1 = new MyThread("Talking to Colleague");
        MyThread mt2 = new MyThread("Thinking about lunch");
        mt1.start();
        // start method internally calls run method
        mt2.start();
        for (int i=0; i<10; i ++){
            try {
                Thread.sleep(1000);
                System.out.println("Working on a task");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        mt1.join(1);
        // wait for the thread to be completed in this time
    }
}
