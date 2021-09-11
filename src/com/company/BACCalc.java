package com.company;
import java.util.Scanner;

public class BACCalc {
    public static void main(String[] args) {

        int H, A, W, g;
        float r;
        double BAC;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
        g = sc.nextInt();

        System.out.print("How many ounces of alcohol did you have? ");
        A = sc.nextInt();

        System.out.print("How many pounds do you weigh? ");
        W = sc.nextInt();

        System.out.print("How many hours has it been since yours last drink? ");
        H = sc.nextInt();
        sc.close();

        if (g == 1) {
            r = (float) 0.73;
        } else {
            r = (float) 0.66;
        }

        BAC = (A * 5.14 / W * r) - (0.015 * H);
        System.out.println("Your BAC is " + BAC);
        if (BAC < 0.08) {
            System.out.println("You are sober enough to drive (legal).");
        } else {
            System.out.println("You are not sober enough to drive (illegal).");
        }
    }
}