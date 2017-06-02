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
            System.out.println("Insert max 2 powered value ");
            int numbergiven = s.nextInt();
            Power2(numbergiven);
        } catch (InputMismatchException e) {
            System.out.println("This is not a legal number");
            init();
        }
    }

    public void Power2(int numbergiven) {

        int number = 1;
        if (numbergiven > 1073741823) {
            Power2(1073741823);
            System.out.println("1073741824");
        } else {
            while (number <= numbergiven) {
                System.out.println(number);
                number = number * 2;
            }
        }


    }
}
