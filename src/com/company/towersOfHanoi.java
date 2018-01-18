package com.company;

/**
 * Created by bs666 on 1/16/18.
 */
public class towersOfHanoi {

    public int disks2;
    public String rod1;
    public String rod2;
    public String rod3;

    public void solve(int numOfDisks, String pipe1, String pipe2, String pipe3)
    {


        if (numOfDisks == 1)
        {
            System.out.println("Move disk at " + pipe1 + " to " + pipe3);
        }
        else
        {
            solve(numOfDisks - 1, pipe1, pipe3, pipe2);
            System.out.println("Move disk at " + pipe1 + " to " + pipe3);
            solve(numOfDisks - 1, pipe2, pipe1, pipe3);
        }
    }
}