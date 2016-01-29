package com.first.Jan92016.JavaTutorial;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Geetha Yedida on 1/22/2016.
 */
public class EnumExample {

    static Scanner sc = new Scanner(System.in);
    private static EnumExample enumInstance;
    private static int choice;

    private EnumExample(){}

    public static synchronized EnumExample getObject(){
        if (enumInstance == null){
            enumInstance = new EnumExample();
        }
        return enumInstance;
    }

    public enum modelAndPrice{
        CricketBall(25), CricketCap(25),CricketBat(60),Stumps(90),Kneepads(120),Glowes(200);
        private int price;

        private modelAndPrice(int price){
            this.price = price;
        }
    }


    public  static void evaluateChoice() {
        switch (choice){
            case 1:
                System.out.println("Your choice is Cricket Ball which costs 25$.");
                System.out.println("Bye");
                break;
            case 2:
                System.out.println("Your choice is Cricket Cap which costs 25$.");
                System.out.println("Bye");
                break;
            case 3:
                System.out.println("Your choice is Cricket Bat which costs 50$.");
                System.out.println("Bye");
                break;
            case 4:
                System.out.println("Your choice is Cricket Stumps which costs 90$.");
                System.out.println("Bye");
                break;
            case 5:
                System.out.println("Your choice is Cricket Kneepads which costs 120$.");
                System.out.println("Bye");
                break;
            case 6:
                System.out.println("Your choice is Cricket Gloves which costs 200$.");
                System.out.println("Bye");
                break;


        }
    }

    public static void printAvailableOptions() {
        int i = 1;
            for (modelAndPrice product: modelAndPrice.values()){
                System.out.print("Enter "+i+" for " +product +" - ");
                System.out.println(product.price+"$");
                i++;
            }
    }

    public static int askUserChoice() {
        System.out.println("Please enter any one option in integer ");
        choice = sc.nextInt();
        return choice;
    }
    public static void exit(){
        System.out.println("Thanks for shopping in our cricket store. Check out our list of cricketers available from the main menu");
    }
}
