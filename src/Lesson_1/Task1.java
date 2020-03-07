package Lesson_1;

//Find the result of the expression for arbitrary values ​​a, b, c:

//     a + b * c / 2


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task1 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a: ");
        String a = bufferedReader.readLine();
        int a1 = Integer.parseInt(a);
        System.out.println("Enter b: ");
        String b = bufferedReader.readLine();
        int b1 = Integer.parseInt(b);
        System.out.println("Enter c: ");
        String c = bufferedReader.readLine();
        int c1 = Integer.parseInt(c);
        int result = a1 + b1 * c1 / 2;
        System.out.println("Result: " + result);

    }

}
