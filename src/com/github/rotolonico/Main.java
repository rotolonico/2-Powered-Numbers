package com.github.rotolonico;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().init();
    }

    public void init() {
        Power2();

    }
    public void Power2() {
        try {

            Scanner s = new Scanner(System.in);
            System.out.println("Insert max 2 powered value ");
            int numbergiven = s.nextInt();
            int number = 1;
            while (number<=numbergiven){
                System.out.println(number);
                number = number*2;
            }
        } catch (InputMismatchException e){
            System.out.println("This is not a legal number");
            init();
        }
    }
}
