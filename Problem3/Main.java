package CS390Assignment2.Problem3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter C for Circle");
        System.out.println("Enter R for Rectangle");
        System.out.println("Enter T for Triangle");
        //storing the answer
        String given = input.next();

            //validating the response
            if (given.toLowerCase().charAt(0) == 'c') {

                System.out.println("You entered C for Circle");
                System.out.println("Enter the radius please");
                //crating the object of circle and get the value from the console
                Circle c1 = new Circle(input.nextDouble());
                System.out.println("The area of Circle is: " + c1.computeArea());

            } else if (given.toLowerCase().charAt(0) == 'r') {

                System.out.println("You entered R for Rectangle");
                System.out.println("Enter the width please");
                double width = input.nextDouble();
                System.out.println("Enter the height please");

                double height = input.nextDouble();
                Rectangle r1 = new Rectangle(width, height);

                System.out.println("The area of rectangle is: " + r1.computeArea());
            } else if (given.toLowerCase().charAt(0) == 't') {

                System.out.println("You entered T for Triangle");
                System.out.println("Enter the base please");
                double base = input.nextDouble();
                System.out.println("Enter the height please");
                double height = input.nextDouble();

                Triangle t1 = new Triangle(base, height);
                System.out.println("The area of Triangle is: " + t1.computeArea());

            } else {
                System.out.println("Please enter C for Circle, R for Rectangle, T for Triangle");
            }


    }
}
