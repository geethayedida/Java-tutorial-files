package Jan92016.JavaTutorial;

import java.util.ArrayList;
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

    protected static int askUserChoice() throws RuntimeException{
        System.out.println("Welcome to Online Cricket Store"+"\n"+"Please enter one option from below :"+"\n"+"1. Buy Products Online 2. Connect to Friends");
        sc.hasNext();
        try {
            int userChoice = sc.nextInt();
            switch (userChoice){
                case 1:
                    System.out.println("You chose: Buy Products Online" );
                    return userChoice;
                case 2:
                    System.out.println("You chose: Connect to Friends" );
                    return userChoice;
                default:
                    RuntimeException exc = new RuntimeException("Exception: ");
                    throw exc;
            }
        }
        catch (RuntimeException e){
            System.out.println("Please try again and enter number 1 or 2");
            return 0;
        }
    }
    class Contacts {
        public String name;
        public String email;
        public int phoneNumber;
        public Contacts(int phno, String name, String email){
            this.email = email;
            this.name = name;
            this.phoneNumber = phno;
        }
        public String toString(){
            return "NAME = " + this.name + ", Email = " + this.email + " , PHONE NUMBER = "+ this.phoneNumber;
        }
    }

    public void contacts() {
        ArrayList<Contacts> al = new ArrayList<Contacts>();
        al.add(new Contacts(987654321, "Sachin Tendulkar" , "Sachin@india.com"));
        al.add(new Contacts(954321456, "Verender Sehwag" , "Sehwag@india.com"));
        al.add(new Contacts(874534621, "Shoyab Aktar" , "Aktar@Pakistan.com"));
        al.add(new Contacts(776654321, "Shen Wan" , "Shen@australia.com"));
        al.add(new Contacts(742574531, "Ricky Ponting" , "Ponting@Australia.com"));

        for (Contacts c : al){
            System.out.println(c);
        }
    }
    public void exit(){
        System.out.println("Thank you for contacting Please buy products and plan cricket matches");
    }
}

