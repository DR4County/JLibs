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
        int numberInt1 = 0;
        int numberInt2 = 0;
        double numberDouble1 = 0;
        double numberDouble2 = 0;
        int totalInt = 0;
        double totalDouble = 0;
        String mathDouble = "";
        String mathTermDouble = "added";
        boolean isDone = false;
        String firstName;
        String notesInput = "";
        String notesOutput = "";
        int noteCount = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please Enter your first name.\n");
        firstName = sc.nextLine();
        System.out.println("Nice to meet you "+firstName+"!\n");
        System.out.print("What is your favorite number?\n");
        numberInt1 = sc.nextInt();
        System.out.println("\n"+numberInt1+" is a great choice for a number!\n");
        
        System.out.print("Now what is your least favorite number?\n");
        numberInt2 = sc.nextInt();
        System.out.println(numberInt2+" isn't so great of a number.\n");
        
        totalInt = numberInt1 - numberInt2;
        System.out.print("Pick a number with a decimal point (required)\n");
        numberDouble1 = sc.nextDouble();
        
        
        System.out.print("Now pick another decimal point (required)\n");
        numberDouble2 = sc.nextDouble();
        System.out.println("");
        System.out.println("What would you like to do with these two numbers? [Add, Subtract, Multiply, Divide]\n");
        mathDouble = sc.next();
        switch (mathDouble.toLowerCase()){
            case "add":
                totalDouble = numberDouble1 + numberDouble2;
                mathTermDouble = "added to";
                break;
            case "subtract":
                totalDouble = numberDouble1 - numberDouble2;
                mathTermDouble = "subtracted from";
                break;
            case "multiply":
                totalDouble = numberDouble1 * numberDouble2;
                mathTermDouble = "multiplied by";
                break;
            case "divide":
                totalDouble = numberDouble1 / numberDouble2;
                mathTermDouble = "divided by";
                break;
        }
        
       
        System.out.println("\nHey "+firstName+",\nyour favorite number ("+numberInt1+") "
                + "subtracted by your least favorite number ("+numberInt2+") is "+totalInt+"!\n"
                +"I saw that you chose to use the number ("+numberDouble1+") and ("+numberDouble2+")"
                + ",\nthose two "+mathTermDouble+" each other is ("+totalDouble+").\n");
        
        while (!isDone || noteCount < 2 ){
            if (noteCount > 2){
                System.out.println("Would you like to be done and stop adding notes? [True / False]\n");
                isDone = sc.nextBoolean();
                sc.nextLine();
            }
            if (noteCount == 0){
                sc.nextLine();
            }
            if (!isDone){
                System.out.println("Please add to your notes here! ["+noteCount+" Notes] [3 Required]\n");
                notesInput = sc.nextLine();
            }
            if (!isDone || noteCount < 2 && notesInput != "" && !isDone){
                System.out.println("\n "
                        + "Added \""+notesInput+"\" to the notes."
                        + "\n");
                notesOutput += notesInput + "\n";
                noteCount++;
            }
        }
        System.out.println("Done Scanning for questions!\n");
        System.out.println("Here are your notes: \n"+notesOutput);
    }
    
}
