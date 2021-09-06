/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Conroy Ricketts
 */

import java.util.Scanner;
import java.lang.Math;

public class app
{
    public static void main(String[] args)
    {
        Scanner scan;
        final float conversionFactor = 350;

        System.out.println("Enter length:");
        scan = new Scanner(System.in);
        float length = Float.parseFloat(scan.next());

        System.out.println("Enter width:");
        scan = new Scanner(System.in);
        float width = Float.parseFloat(scan.next());

        float area = length * width;
        double gallonsNeeded = Math.ceil(area / conversionFactor);

        System.out.println(String.format("You need %.2f gallons to cover %.2f square feet.", gallonsNeeded, area));
    }
}
