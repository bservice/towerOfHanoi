package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Tower of Hanoi Game");
        System.out.println("This program will solve this puzzle for you.");
        System.out.println("Please input the number of disks you want to solve:");
        Scanner kb = new Scanner(System.in);
        int disks = kb.nextInt();

        towersOfHanoi tower1 = new towersOfHanoi();
        tower1.solve(disks, "Pipe1", "Pipe2", "Pipe3");
    }
}
