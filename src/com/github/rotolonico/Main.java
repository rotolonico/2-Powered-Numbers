package com.github.rotolonico;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().init();
    }

    public void init() {
        try {

            Scanner s = new Scanner(System.in);
            System.out.println("Insert max value: ");
            int numbergiven = s.nextInt();
            System.out.println("Insert base: ");
            int p = s.nextInt();
            Power2(numbergiven, p);
        } catch (InputMismatchException e) {
            System.out.println("This is not a legal number");
            init();
        }
    }

    public void Power2(int numbergiven, int p) {

        int number = 1;
        if (numbergiven > 1073741823) {
            Power2(1073741823, p);
        } else {
            if (p == 0) {
                System.out.println("0");
            } else if (p == 1){
                System.out.println("1");
            } else {
                while (number <= numbergiven) {
                    number = number * p;
                    if (number <= numbergiven) {
                        System.out.println(number);
                    }
                }
            }

        }


    }
}
