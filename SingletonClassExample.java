package com.first.Jan92016.JavaTutorial;

import java.util.Scanner;

/**
 * Created by Geetha Yedida on 1/23/2016.
 */
public class SingletonClassExample {
    public static Scanner sc = new Scanner(System.in);
    private static SingletonClassExample instance;
    // private static variable

    private SingletonClassExample(){
        // create a private constructor that prevents instantiation from other classes
    }
    public static synchronized SingletonClassExample getSingletonObject(){
        // public static method which returns the instance of the class
        if (instance== null){
            // if there is no object already available, create one
            instance = new SingletonClassExample();
        }
        return instance;
    }

    protected static void askUserChoice(){
        System.out.println("What do you want to buy today?" +"\n" +"1. Cricket bat 2. Cricket ball 3. Stumps" + "\n" + "Please enter one option");
        int userChoice = sc.nextInt();
        System.out.println("User Choice is " +userChoice);
    }

    public Object clone()
            throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
        // when we try to clone the thread, this stops from cloning
    }
}
