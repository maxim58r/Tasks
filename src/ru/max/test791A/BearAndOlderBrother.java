package ru.max.test791A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Job site
 * https://codeforces.com/problemset/problem/791/A
 *
 * @author Serov Maxim
 */
public class BearAndOlderBrother {
    public static void main(String[] args) throws IOException {
        whenOlderBrother(getInts());
    }

    private static int[] getInts() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        return Arrays.stream(in.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

    }

    private static void whenOlderBrother(int[] weightBears) throws IOException {
        int weightLimaka = weightBears[0];
        int weightBob = weightBears[1];
        int count = 0;
        if ((weightLimaka <= weightBob)
                & (weightLimaka <= 10 & weightBob <= 10)
                & (1 <= weightLimaka & 1 <= weightBob)) {
            do {
                count++;
                weightLimaka = weightLimaka * 3;
                weightBob = weightBob * 2;
            }
            while (weightLimaka <= weightBob);
            System.out.println(count);
        } else whenOlderBrother(getInts());
    }
}
