package Lesson_1;

//Find the result of the expression for arbitrary values ​​a, b, c:

//( a + b ) / 12 * c % 4 + |b|

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String a1 = bufferedReader.readLine();
        int a = Integer.parseInt(a1);
        String b1 = bufferedReader.readLine();
        int b = Integer.parseInt(b1);
        String c1 = bufferedReader.readLine();
        int c = Integer.parseInt(c1);
        int result = (a + b)/ 12 * c % 4 + Math.abs(b);
        System.out.println(result);
    }
}
