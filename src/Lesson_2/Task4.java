package Lesson_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double btc = 147492.42;          // Bitcoin
        double usd = 26.01;             // Dollar
        double eur = 29.03;            // Euro
        double gbp = 32.79;           // Pound Sterling
        double rub = 0.36;           // Ruble
        double cny = 3.73;          // Yuan

        System.out.println("Enter the amount of money in hryvnias: ");
        String count = bufferedReader.readLine();
        int countInt = Integer.parseInt(count);

        System.out.println("Enter the currency: ");
        String currency = bufferedReader.readLine();

        if(currency.toLowerCase().equals("bitcoin")){
            double a = countInt / btc;
            System.out.println(a);
        }
        if(currency.toLowerCase().equals("dollar")){
            double a = countInt / usd;
            System.out.println(a);
        }
        if(currency.toLowerCase().equals("euro")){
            double a = countInt / eur;
            System.out.println(a);
        }
        if(currency.toLowerCase().equals("pound sterling")){
            double a = countInt / gbp;
            System.out.println(a);
        }
        if(currency.toLowerCase().equals("ruble")){
            double a = countInt / rub;
            System.out.println(a);
        }
        if(currency.toLowerCase().equals("Yuan")){
            double a = countInt / cny;
            System.out.println(a);
        }



    }

}
