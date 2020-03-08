package Lesson2;

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
        if(hoursString.equals("Yes")){
            int result = salaryInt * daysInt * hoursOnAvarage;
            System.out.println("Your salary: " + result);
        } else{
            int hoursInt = Integer.parseInt(hoursString);
            if(hoursInt > 22 ){
                System.out.println("Sorry, but you can't work 22 hours and more a day! It's impossible!");
            }if(hoursInt <= 22) {
                int result2 = salaryInt * daysInt * hoursInt;
                System.out.println("Your salary: " + result2);
            }
        }

    }
}
