package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // PROJECT ONE
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a KCSE_grade: ");
        int KCSE_grade = input.nextInt();

        if (KCSE_grade >= 65)
            System.out.print("You are Eligible\n");
        else if (KCSE_grade < 65)
            System.out.print("you are not Eligible\n");

        System.out.print("Enter interview question marks: ");
        int interviewquestionsmarks = input.nextInt();
        System.out.print("confidence level score: ");
        int confidencelevelscore = input.nextInt();

        if (KCSE_grade >= 65 && (interviewquestionsmarks >= 6 || confidencelevelscore >= 5 ))
            System.out.print("Admitted\n");
        else if(KCSE_grade < 65 && (interviewquestionsmarks < 6 || confidencelevelscore < 5 ))
            System.out.print("Rejected\n");
    }
}
