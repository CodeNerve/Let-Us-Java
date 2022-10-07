package com.let.us.java;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int panjang, lebar, luas;

        System.out.println("PROGRAM JAVA Count Area Of Rectangle : ");
        System.out.println("-----------------------------------------------");

        System.out.print("Input Long      : ");
        panjang = input.nextInt();
        System.out.print("Input Widht        : ");
        lebar = input.nextInt();

        luas = panjang * lebar;

        System.out.println("Total : " + luas);
    }
}
