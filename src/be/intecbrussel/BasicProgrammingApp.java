package be.intecbrussel;

import java.util.Scanner;

public class BasicProgrammingApp {

    static Scanner userInputStream = new Scanner(System.in);
    static int rightGuess = 20;
    static int numberOfGuess = 1;


    public static void main(String[] args) {

        do {

            int guess = userInputStream.nextInt();

            if (guess > 0 && guess < 100) {

                if (guess < rightGuess) {

                    System.out.println("Your guess is " + guess+"  and is less than the right answer");
                }
                if (guess > rightGuess) {
                    System.out.println("Your guess is " + guess+" and  higher than right answer");
                }
                if (guess == rightGuess) {
                    System.out.println("Congratulation you are the winner");
                    break;
                }


            } else {
                System.out.println(guess + " is out of range. choose a number between 1 and 100  ");
            }
            numberOfGuess++;

        } while (numberOfGuess <= 5);
        if (numberOfGuess > 5) {

            System.out.println(" You only had 5 chance");
        }


    }


}
