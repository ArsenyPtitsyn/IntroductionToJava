/*
  Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел,
  после которых следует отрицательное число.
*/

package homework1;

public class Task2 {

    public static void main(String[] args) {
        int[] array = {1,-5,-6,8,3,6,-5,3,-132,4};
        int sumOfPositivesBehindNegative = calculateSum(array);
        System.out.println(sumOfPositivesBehindNegative);
    }

    private static int calculateSum(int[] array) {
        int sum = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < 0)
                if (array[i - 1] > 0)
                    sum += array[i - 1];
        }
        return sum;
    }
}
