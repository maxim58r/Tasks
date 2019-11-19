package ru.max.test785A;

import java.io.*;
import java.util.HashMap;

/**
 * Job site
 * https://codeforces.com/problemset/problem/785/A
 *
 * @author Serov Maxim
 */
public class Polyhedron {
    public static void main(String[] args) throws IOException {
        totalFaces();
    }

    private static void totalFaces() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<String, Integer> polyhedrons = new HashMap<>();
        polyhedrons.put("Tetrahedron", 4);
        polyhedrons.put("Cube", 6);
        polyhedrons.put("Octahedron", 8);
        polyhedrons.put("Dodecahedron", 12);
        polyhedrons.put("Icosahedron", 20);

        int n = Integer.parseInt(reader.readLine());
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += polyhedrons.get(reader.readLine());
        }
        writer.write(Integer.toString(res));
        reader.close();
        writer.close();
    }
}
