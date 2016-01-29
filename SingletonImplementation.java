package com.first.Jan92016.JavaTutorial;

import java.util.Scanner;

/**
 * Created by Geetha Yedida on 1/23/2016.
 */
public class SingletonImplementation {

    public static void main(String[] args) {

        EnumExample firstobj = EnumExample.getObject();
        EnumExample secondobj = EnumExample.getObject();

        SingletonClassExample obj1 =  SingletonClassExample.getSingletonObject();
        SingletonClassExample obj2 = SingletonClassExample.getSingletonObject();

        int choice = obj1.askUserChoice();

        if (choice == 1){
            firstobj.printAvailableOptions();
            secondobj.askUserChoice();
            firstobj.evaluateChoice();
            firstobj.exit();
        }
        else if(choice == 2){
            obj2.contacts();
            obj1.exit();
        }
    }
}
