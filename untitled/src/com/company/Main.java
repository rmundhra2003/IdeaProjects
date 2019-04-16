package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int numOfScores = 0;
        int sumOfScores = 0;
        int average = 0;
        int i = 0;

        //Input the Number of scores
        System.out.print("Number of test scores: ");
        numOfScores = scanner.nextInt();
        int[] intArray = new int[numOfScores];

        //Input the exam scores
        for (i = 0; i < numOfScores; i++) {
            System.out.printf("Enter the exam score %d: ",i+1);
            intArray[i] = scanner.nextInt();
            //Add this score to the sum of score
            sumOfScores += intArray[i];
        }
        //Calculate Average = Sum of scores/#of scores
        average = sumOfScores/numOfScores;

        //Display average of score
        System.out.println("The average test score is " + average);

    }
}
