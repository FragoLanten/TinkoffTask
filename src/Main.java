import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int amountOfDigits = scanner.nextInt();
        int amountOfDivisors = scanner.nextInt();

        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        for (int i = 0; i < amountOfDigits; i++) {
            listOfNumbers.add(scanner.nextInt());
        }

        scanner.close();
        int finalSum = 0;

        for (int i = 0; i < amountOfDivisors; i++) {
            int maxDifference = 0;
            Integer minDigit=0;
            for (Integer number:listOfNumbers) {
                int numbersCount = String.valueOf(number).length();
                if ((int) Math.pow(10, numbersCount) - 1 - number > maxDifference) {
                    maxDifference = (int) Math.pow(10, numbersCount) - 1 - number;
                    minDigit = number;
                }

            }
            listOfNumbers.remove(minDigit);
            finalSum = finalSum + maxDifference;
        }
        System.out.println(finalSum);
    }
}
