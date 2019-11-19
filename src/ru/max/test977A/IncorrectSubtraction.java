package ru.max.test977A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Job site
 * https://codeforces.com/problemset/problem/977/A
 *
 * @author Serov Maxim
 */
public class IncorrectSubtraction {
    public static void main(String[] args) throws IOException {
        sum(getInts());
    }

    private static int[] getInts() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        return Arrays.stream(in.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private static void sum(int[] intArr) {
        int n = intArr[0];
        int k = intArr[1];
        while (k > 0) {
            if (n % 10 != 0) {
                n--;
            } else n /= 10;
            k--;
        }
        System.out.println(n);
    }
}