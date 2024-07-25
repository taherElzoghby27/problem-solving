package problem.solving;

// Import the HashMap class
import java.util.HashMap;
import java.util.Scanner;

public class RomantoInteger {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = input.next();
        HashMap<Character, Integer> roman = new HashMap<Character, Integer>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        int sum = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'I') {
                if (string.charAt(i + 1) == 'V') {
                    sum += 4;
                    i++;
                } else if (string.charAt(i + 1) == 'X') {
                    sum += 9;
                    i++;
                } else {
                    sum += roman.get(string.charAt(i));
                }
            } else if (string.charAt(i) == 'X') {
                if (string.charAt(i + 1) == 'L') {
                    sum += 40;
                    i++;
                } else if (string.charAt(i + 1) == 'C') {
                    sum += 90;
                    i++;
                } else {
                    sum += roman.get(string.charAt(i));
                }
            } else if (string.charAt(i) == 'C') {
                if (string.charAt(i + 1) == 'D') {
                    sum += 400;
                    i++;
                } else if (string.charAt(i + 1) == 'M') {
                    sum += 900;
                    i++;
                } else {
                    sum += roman.get(string.charAt(i));
                }
            }
        }
    }
}
