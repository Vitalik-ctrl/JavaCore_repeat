package Lesson_2;

//The variables a and b contain the positive lengths of the cathets of the right triangle.
// Calculate and display the area of ​​the triangle and its perimeter.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter lenght of the cathet a: ");
        String a1 = bufferedReader.readLine();
        int a = Integer.parseInt(a1);
        System.out.println("Enter lenght of the cathet  b:");
        String b1 = bufferedReader.readLine();
        int b = Integer.parseInt(b1);
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Since the triangle is right-angled, c: " + c);
        double perimeter = a + b + c;
        System.out.println("Perimeter = " + perimeter);
        double square = (a * b) / 2;
        System.out.println("Square = " + square);

    }
}
