package com.mycompany.project_problem_solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> p = groupAnagrams(strs);
        System.out.println(p);
//        System.out.println(validAnagram());
//        print(List.of("ahmed", "mohamed"), " ...End... ");
//        int x=128;
//        int y=128;
//        Integer x1=128;
//        Integer y1=128;
//        int t = input.nextInt();
//        while (t-- > 0) {
//            double w = input.nextDouble();
//            double h = input.nextDouble();
//            if (w == h) {
//                System.out.println("Square");
//            } else {
//                System.out.println("Rectangle");
//            }
//        }
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            String key = sortString(s);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static String sortString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static <T, S> void print(List<T> values, S data) {
        values.stream().forEach(value -> System.out.print(value + " "));
        System.out.println(data);
    }

    public static boolean validAnagram() {
        String s = "aacc";
        String t = "ccac";
        if (t.length() != s.length()) {
            return false;
        }
        for (int i = 0; i < t.length(); i++) {
            if (!s.contains(Character.toString(t.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}

//class GuessDataTypes {
//
//    private final long n;
//    private final long k;
//    private final long a;
//
//    public GuessDataTypes(long n, long k, long a) {
//        this.n = n;
//        this.k = k;
//        this.a = a;
//    }
//
//    public void result() {
//        double result =  ((double) ((n * k) / a));
//        System.out.println(result);
//        if (result != (long) result) {
//            System.out.println("double");
//        } else if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
//            System.out.println("long long");
//        } else {
//            System.out.println("int");
//        }
//    }
//}
