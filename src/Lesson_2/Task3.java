package Lesson_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first side of the triangle: ");
        String side1String = bufferedReader.readLine();
        int side1Int = Integer.parseInt(side1String);
        System.out.println("Enter the second side of the triangle: ");
        String side2String = bufferedReader.readLine();
        int side2Int = Integer.parseInt(side2String);
        System.out.println("Enter the angle between the two above sides: ");
        String angle1String = bufferedReader.readLine();
        int angle1Int = Integer.parseInt(angle1String);
        double side3Int = Math.sqrt(Math.pow(side1Int, 2) + Math.pow(side2Int, 2) - 2 * side1Int * side2Int * Math.cos(angle1Int));
        System.out.println("Side 3: " + side3Int);

        double perimeter = side1Int + side2Int + side3Int;
        System.out.println("Perimeter: " + perimeter);
    }
}
