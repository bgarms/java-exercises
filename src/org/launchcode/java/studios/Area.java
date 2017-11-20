package org.launchcode.java.studios;
import java.util.Scanner;


public class Area {

    public static void main(String[] args) {
        Scanner in;
        double area;
        double radius;
        double pi;

        in = new Scanner(System.in);
        System.out.println("What is the radius?");
        radius = in.nextDouble();

        pi = 3.14;

        area = pi*radius*radius;

        System.out.println("The area of " + radius + " is " + area);




    }
}
