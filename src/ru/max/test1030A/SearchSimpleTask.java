package ru.max.test1030A;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Job site
 * https://codeforces.com/problemset/problem/1030/A
 *
 * @author Serov Maxim
 */
public class SearchSimpleTask {
    public static void main(String[] args) throws IOException {
        task(getInts());
    }

    private static int[] getInts() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        return Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    private static void task(int[] arrInterviewed) throws IOException {
        Scanner in = new Scanner(System.in);
        int numPeople = in.nextInt();
        int sum = 0;
        for (int i = 0; i < numPeople; i++) {
            sum = sum + arrInterviewed[i];
        }
        System.out.println(sum == 0 ? "EASY" : "HARD");
    }
}