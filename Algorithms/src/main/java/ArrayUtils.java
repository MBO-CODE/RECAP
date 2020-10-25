
public class ArrayUtils {


    public static boolean isPalindrom(int[] numbers) {
        boolean isPalindrome = false;
        //Palindrom: int[] numbers = {1, 2, 3, 2, 1};
        //i: n[0], n[1], n[2], n[3], n[4], n[5]
        //j: n[5], n[4], n[3], n[2], n[1], n[0]
        for (int i = 0, j = numbers.length - 1; i <= j; i++, j--) {
            if (numbers[i] != numbers[j]) {
                isPalindrome = false;
            } else {
                isPalindrome = true;
            }

        }
        return isPalindrome;
    }
}
