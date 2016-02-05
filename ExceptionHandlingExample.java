package Jan92016.JavaTutorial;

import java.util.Scanner;

/**
 * Created by Geetha Yedida on 1/9/2016.
 */
public class ExceptionHandlingExample {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        welcomeMessage();
    }

    protected static void welcomeMessage() {
        System.out.println("Welcome to my cake shop");
        System.out.println("Enter your name");
        String name = sc.nextLine();
        printName(name);
    }

    public static void printName(String custName) {
        System.out.println("Hi " + custName);
        askAge();
    }

    public static void askAge() throws RuntimeException {
        System.out.println("Please Enter Age");
        try {
            int custAge = sc.nextInt();
            checkAge(custAge);
        } catch (Exception e) {
            System.out.println("Exception: Please enter valid age in numerals");
        }
    }
    //files

    private static void checkAge(int age) throws RuntimeException {
        if (age > 0 && age < 12) {
            childrenCake();
        } else {
            RuntimeException exc = new RuntimeException("Exception: Sorry no cakes for Teens and adults :( Please visit us again");
            throw exc;
        }
    }

    private static void childrenCake() {
        System.out.println("Enter the max price you can spend on the cake");
        try {
            int custrange = sc.nextInt();
            if (custrange > 100) {
                basicOptions();
                advancedOptions();
                premiumOptions();
                try {
                    pickOptions();
                } catch (Exception e) {
                    System.out.println("Exception occurred: Enter valid input " + e);
                }
            }
            if (custrange > 50 && custrange <= 100) {
                basicOptions();
                advancedOptions();
                try {
                    pickOptions();
                } catch (Exception e) {
                    System.out.println("Exception occurred: Enter valid input " + e);
                }
            }
            if (custrange > 0 && custrange <= 50) {
                basicOptions();
                try {
                    pickOptions();
                    System.out.println(":)");
                } catch (Exception e) {
                    System.out.println("Exception occurred: Enter valid input " + e);
                    // print the exception that was encountered in pickOptions() method
                } finally {
                    System.out.println("Finally: Please try again");
                    // will always be printed after try block or after finally block
                }
            }
        } catch (Exception e) {
            System.out.println("Exception: Please enter valid amount in numerals");
        }
    }

    private static void premiumOptions() {
        System.out.println("You have options:1. Angel cake 2. Frozen cake ");
    }

    private static void advancedOptions() {
        System.out.println("You have options: 1. Barbie Cake 2. Disney Cake ");
    }

    private static void basicOptions() {
        System.out.println("You have following options: 1. Blue cream on Cake 2. Pink Cream on cake ");
    }

    private static void pickOptions() throws IncorrectInputException {
        sc.nextLine();
        System.out.println("Please pick one cake option and enter the name of the cake  ");
//<<<<<<< HEAD
        if (sc.hasNextInt()) {
            IncorrectInputException e = new IncorrectInputException("Exception: Incorrect Input");
            throw e;
        }
        String userOption = sc.nextLine();

        if (userOption.equalsIgnoreCase("Blue cream on Cake") || userOption.equalsIgnoreCase("Pink Cream on cake") || userOption.equalsIgnoreCase("Barbie Cake") || userOption.equalsIgnoreCase("Disney Cake") || userOption.equalsIgnoreCase("Angel cake") || userOption.equalsIgnoreCase("Frozen cake")) {
            System.out.println("Your selected option is: " + userOption);
            System.out.println("The cake will be ready Shortly :) ");
        }
        else {
            System.out.println("Please enter like shown above");
        }
        System.out.println("Do you want to buy another cake? Enter yes or no");
        String userOptionForContinue = sc.next();

        if (userOptionForContinue.equalsIgnoreCase("Yes")) {
                childrenCake();
            } else if (userOptionForContinue.equalsIgnoreCase("No")) {
                System.out.println("Thank you for shopping today, Please come back soon!");
            } else {
                IncorrectInputException e = new IncorrectInputException("Exception: Incorrect Input");
                throw e;
            }
        }
        private static class IncorrectInputException extends RuntimeException {
            public IncorrectInputException(String message) {
                super(message);
            }
        }
    }


//<<<<<<< HEAD
//=======
// Welcome to my cake shop
// Enter your name
// Geetha
// Hi Geetha
// Please Enter Age
// 5
// Enter the max price you can spend on the cake
// 23
// You have following options: 1. Blue cream on Cake 2. Pink Cream on cake 
// Please pick one cake option and enter the name of the cake  
// pink cream on cake
// Your selected option is: pink cream on cake
// The cake will be ready Shortly :) 
// Do you want to buy another cake? Enter yes or no
// yes
// Enter the max price you can spend on the cake
// 67
// You have following options: 1. Blue cream on Cake 2. Pink Cream on cake 
// You have options: 1. Barbie Cake 2. Disney Cake 
// Please pick one cake option and enter the name of the cake  
// barbie cake
// Your selected option is: barbie cake
// The cake will be ready Shortly :) 
// Do you want to buy another cake? Enter yes or no
// no
// Thank you for shopping today, Please come back soon!
// :)
// Finally: Please try again

// Process finished with exit code 0
//>>>>>>> e4afc1b8b32c984f0c670ea6a990e2ef54f3a955
