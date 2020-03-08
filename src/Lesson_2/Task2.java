package Lesson_2;

//  Calculate salary for a given rate per hour, for a given number of days



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your wage for 1 hour: ");
        String salaryString = bufferedReader.readLine();
        int salaryInt = Integer.parseInt(salaryString);
        System.out.println("Enter count of work days: ");
        String daysString = bufferedReader.readLine();
        int daysInt = Integer.parseInt(daysString);
        System.out.println("On average, a Developer works 8 hours a day.");
        System.out.println("--------------------------------------------");
        int hoursOnAvarage = 8;
        System.out.println("If you work 8 hours a day, enter 'Yes' " +
                "\n" + "If you don't, enter your count of hours: ");
        String hoursString = bufferedReader.readLine();
        if (hoursString.equals("Yes")) {
            int result = salaryInt * daysInt * hoursOnAvarage;
            System.out.println("Your salary: " + result);
        } else {
            int hoursInt = Integer.parseInt(hoursString);
            while (hoursInt > 22) {
                System.out.println("Sorry, but you can't work 22 hours and more a day! It's impossible! Enter again: ");
                String hourseString = bufferedReader.readLine();
                int hourseInt = Integer.parseInt(hourseString);
                if (hourseInt < 22) {
                    int result3 = salaryInt * daysInt * hourseInt;
                    System.out.println("Your salary: " + result3);
                    break;
                }

            }
            if (hoursInt < 22) {
                int result2 = salaryInt * daysInt * hoursInt;
                System.out.println("Your salary: " + result2);
            }


        }
    }
}



//Someone tell me please, how to make this code more concise.

