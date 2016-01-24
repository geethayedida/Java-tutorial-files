package com.first.Jan92016.JavaTutorial;

/**
 * Created by Geetha Yedida on 1/23/2016.
 */
public class SingletonImplementation {
    public static void main(String[] args) {
        SingletonClassExample obj1 =  SingletonClassExample.getSingletonObject();
        obj1.askUserChoice();
        SingletonClassExample obj2 = SingletonClassExample.getSingletonObject();
        obj2.askUserChoice();
    }
}
