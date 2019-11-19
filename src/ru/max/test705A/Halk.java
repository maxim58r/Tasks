package ru.max.test705A;

import java.util.Scanner;

/**
 * Job site
 * https://codeforces.com/problemset/problem/705/A
 *
 * @author Serov Maxim
 */
public class Halk {
    public static void main(String[] args) {
        feelings();
    }

    private static void feelings() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 1;
        if (1 <= t && t <= 100) {
            for (int i = count; i <= t; i++) {
                System.out.print(i % 2 == 0 ? "I love it " : "I hate that ");
            }
        }
    }
}