/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variabledemo;

import java.util.Scanner;

/**
 *
 * @author dreyes
 */
public class Variabledemo {

    /**
     * @param args the command line arguments
     * boolean
     * int
     * string     * double

     */
    public static void main(String[] args) {
        int numberInt1 = 0, numberInt2 = 0, totalInt = 0;
        double numberDouble1 = 0, numberDouble2 = 0, totalDouble = 0, wrongDouble = 0;
        String mathDouble = "", mathTermDouble = "added";
        String firstName, secondName, namePronouns;
        String fallDown = "stairs", fallMethod = "stepped";
        String fallMeasurement = "inches", lateTimeMeasurement = "minutes";
        String startingPlace = "home";
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please Give me a name.\n");
        firstName = sc.nextLine();
        
        System.out.println("What is this persons pronouns he/she \n");
        namePronouns = sc.next();
        
        System.out.println("Pick something that you could fall down from.\n");
        fallDown = sc.next();
        
        System.out.println("How do you get down from there ( stepped, climbed, jumped)\nMake sure it ends with ED like climbed or jumped.\n");
        fallMethod = sc.next();
        
        System.out.print("Now Pick a number\n");
        numberInt1 = sc.nextInt();
        
        System.out.print("Next pick another number that is lower than the first number.\n");
        numberInt2 = sc.nextInt();
        totalInt = numberInt1 - numberInt2;
        sc.nextLine();
        System.out.println("Choose a place you can be at.\n");
        startingPlace = sc.nextLine();
        
        System.out.print("Pick a number with a decimal point (required)\n");
        numberDouble1 = sc.nextDouble();
        
        
        System.out.print("Now pick another decimal point (required)\n");
        numberDouble2 = sc.nextDouble();
        
        System.out.println("Now Pick a math operation [Add, Subtract, Multiply, Divide]\n");
        mathDouble = sc.next();
        switch (mathDouble.toLowerCase()){
            case "add":
                totalDouble = numberDouble1 + numberDouble2;
                wrongDouble = numberDouble1 * numberDouble2;
                mathTermDouble = "added to";
                break;
            case "subtract":
                totalDouble = numberDouble1 - numberDouble2;
                wrongDouble = numberDouble1 + numberDouble2;
                mathTermDouble = "subtracted from";
                break;
            case "multiply":
                totalDouble = numberDouble1 * numberDouble2;
                wrongDouble = numberDouble1 / numberDouble2;
                mathTermDouble = "multiplied by";
                break;
            case "divide":
                totalDouble = numberDouble1 / numberDouble2;
                wrongDouble = numberDouble1 * numberDouble2;
                mathTermDouble = "divided by";
                break;
        }
        System.out.println("Pick a measurement of distance (Centimeters, Inches, Feet, Miles)\n");
        fallMeasurement = sc.next();
        
        System.out.println("Pick a measurement of time (Days, Hours, Minutes, Seconds) ending with an S\n");
        lateTimeMeasurement = sc.next();
        
        System.out.println("Pick a second name.\n");
        secondName = sc.next();
        
        System.out.println("\n"+firstName+" woke up one morning at "+startingPlace+",\nwhen "+namePronouns
                +" got up and started getting ready for work "+namePronouns+" "+fallMethod+" Down A whole "+totalInt+" "+fallMeasurement+" of "+fallDown+". "
                + "When "+namePronouns+" got to work, "+secondName+" (his boss) asked him \"Do you know how late you are?"
                + "\nYou are a whole "+wrongDouble+" "+lateTimeMeasurement+" late to work!"+"\"\n"
                + "Sadly, "+secondName+" must not know how to do proper math, \nSo you decided to tell him that "+numberDouble1+" "+mathTermDouble+" "+numberDouble2+" is actually "+totalDouble+"!");
        
        System.out.println("Done Scanning for questions!\n");
    }
    
}
