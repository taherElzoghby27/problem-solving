package problem.solving.random;

import java.util.HashMap;
import java.util.Scanner;

public class RomantoInteger {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String romanNumeral = input.nextLine().toUpperCase();
        int result = romanToInt(romanNumeral);
        System.out.println(result);
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int sum = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanMap.get(s.charAt(i));

            if (currentValue < prevValue) {
                sum -= currentValue;
            } else {
                sum += currentValue;
            }

            prevValue = currentValue;
        }

        return sum;
    }
}