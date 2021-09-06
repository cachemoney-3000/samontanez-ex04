/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Samontanez
 */

package exercise04;

import java.util.Scanner;

public class Solution04 {
    /*
    Create a simple mad-lib program
    print "Enter a noun:" to prompt user
    scanner reads user input,
    'noun' = stores the string input.
    print "Enter a verb:"
    scanner reads user input,
    'verb' = stores the string input.
    print "Enter an adjective:"
    scanner reads user input,
    'adjective' = stores the string input.
    print "Enter an adverb:"
    scanner reads user input,
    'adverb' = stores the string input.
    print "Do you <verb> your <adjective> <noun> <adverb>? That's hilarious!"
     */

    public static void main(String[] args) {
        System.out.print("Enter a noun: ");
        Scanner input1 = new Scanner(System.in);
        String noun = input1.nextLine();

        System.out.print("Enter a verb: ");
        Scanner input2 = new Scanner(System.in);
        String verb = input2.nextLine();

        System.out.print("Enter a adjective: ");
        Scanner input3 = new Scanner(System.in);
        String adjective = input3.nextLine();

        System.out.print("Enter a adverb: ");
        Scanner input4 = new Scanner(System.in);
        String adverb = input4.nextLine();

        System.out.printf("Do you " + verb + " your " + adjective + " "
                + noun + " " + adverb + "?, That's hilarious!");
    }
}