package Training;


// Попросите кота загадать число от 0 до 100.
// У вас будет семь попыток на угадывание.
// При каждой попытке вам будет выводиться сообщение - "Мало" или "Много".
// Если угадаете, уложившись в семь попыток, то выиграли.
// Если нет, то идёте кормить кота.




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class IfTest {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        Random random = new Random();
        int secret;
        // Генерируем число от 0 до 100
        secret = random.nextInt(100 + 1);


        for (int i = 0; i < 7 ; i++) {
            String read = bufferedReader.readLine();
            int reaad = Integer.parseInt(read);

            if (reaad > secret) {
                System.out.println("много");

            } else if (reaad < secret) {
                System.out.println("мало");


            }
            else{
                System.out.println("Именно это число");
                break;
            }
        }


    }
}
