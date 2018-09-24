package me.afua;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("What is your name? ");
        Scanner keyboard = new Scanner(System.in);
        String firstName = keyboard.next();
        String lastName = keyboard.next();

        System.out.println("How old are you?");
        int age = keyboard.nextInt();

        System.out.println("How tall are you?");
        double height = keyboard.nextDouble();


        System.out.printf("Hello, your first name is %s\nYour last name is %s.\nYou are %d years old,\nand you are %.2f inches tall",firstName,lastName,age,height);







    }
}
