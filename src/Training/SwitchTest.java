package Training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SwitchTest {

    public static void main(String[] args) throws IOException {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String year = bufferedReader.readLine();
        int yearInt = Integer.parseInt(year);

        System.out.println("Enter month");
        String read = bufferedReader.readLine();
        switch (read){
            case "January" :
            case "March" :
            case "May" :
            case "July" :
            case "August" :
            case "October" :
            case "December" :
                System.out.println("31");
                break;
            case "April" :
            case "June" :
            case "September" :
            case "November" :
                System.out.println("30");
                break;
            case "February" :
                if( yearInt%4 == 0 ){
                    System.out.println(29);
                }else
                    System.out.println(28);
                break;
                default:
                    System.out.println("such a month does not exist");
                break;
        }

    }
}

