/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem.solving.random;

/**
 *
 * @author taherlinux
 */
public class Palindrome1 {

    /*
    Question 1

Given a string of lowercase English characters, transform it into a palindrome by replacing any character in the string with any other character.

Find the minimum number of character changes required to transform the string into a palindrome.

Note: A palindrome is a string that reads the same forwards and backwards, such as "racecar" or "level".

Example 1

Input:
s = "abcbd"

Output:
1

Explanation:
Possible approaches are:

Starting with the string "abcbd", replace the first character ('a') with 'c', and the last character ('d') with 'c' to form "cbcbbc".

Starting with "abcbd", replace the last character ('d') with 'a' to form "abcba".

The second approach is optimal.

Example 2

Input:
s = "abdaa"

Output:
1

Explanation:
To transform "abdaa" into a palindrome, one optimal solution is to replace the character 'b' with 'a', resulting in "aadaa".

Constraints

0 ≤ length of string ≤ 2 × 10⁵

String s consists of lowercase English letters.
     */
    public static void main(String[] args) {
        System.out.println(transform("abcbba"));
    }

    public static int transform(String str) {
        int l = 0, r = str.length() - 1;
        int cPossible = 0;
        while (l != r) {
            if (str.charAt(l) != str.charAt(r)) {
                ++cPossible;
                if (l + 1 == r) {
                    break;
                }
            }
            ++l;
            --r;
        }
        return cPossible;
    }
}
