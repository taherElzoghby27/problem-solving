package com.mycompany.project_problem_solving;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class FrontEnd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            deque.addLast(input.nextInt());
        }
        input.close();

        while (!deque.isEmpty()) {
            System.out.print(deque.removeFirst());
            if (!deque.isEmpty()) {
                System.out.print(" ");
                System.out.print(deque.removeLast());
                if (!deque.isEmpty()) {
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    }
}
