/* Given two binary strings a and b, return their sum as a binary string.
   Example 1:
   Input: a = "11", b = "1"
   Output: "100"

   Example 2:
   Input: a = "1010", b = "1011"
   Output: "10101"
*/

package homework1;

public class BinarySumAlgorithmicWay {

    public static void main(String[] args) {
        String a =    "1000111110";
        String b = "1110111010111";
        System.out.println(binarySum(a, b));
    }

    private static String binarySum(String a, String b) {
        int indexOfFirstString = a.length() - 1;
        int indexOfSecondString = b.length() - 1;
        StringBuilder result = new StringBuilder();
        int transferToTheNextDigit = 0;
        while (indexOfFirstString >= 0 || indexOfSecondString >= 0) {
            int sumOfTwoBits = transferToTheNextDigit;
            if (indexOfFirstString >= 0) {
                sumOfTwoBits += a.charAt(indexOfFirstString--) - '0';
            }
            if (indexOfSecondString >= 0) {
                sumOfTwoBits += b.charAt(indexOfSecondString--) - '0';
            }
            result.insert(0, sumOfTwoBits % 2);
            transferToTheNextDigit = sumOfTwoBits / 2;
        }
        if (transferToTheNextDigit > 0) {
            result.insert(0, transferToTheNextDigit);
        }
        return result.toString();
    }
}
