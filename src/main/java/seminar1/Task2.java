package seminar1;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        System.out.println("Сумма положительных чисел, после которых следует отрицательное число, равна: "
                + sumOfPositivesBeforeNegatives());
    }

    private static int sumOfPositivesBeforeNegatives() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int previousNumber = sc.nextInt();
        int result = 0;
        while (previousNumber != 0) {
            System.out.println("Введите следующее целое число: ");
            int nextNumber = sc.nextInt();
            if (previousNumber > 0 && nextNumber < 0) {
                result += previousNumber;
            }
            previousNumber = nextNumber;
        }
        sc.close();
        return result;
    }
}
