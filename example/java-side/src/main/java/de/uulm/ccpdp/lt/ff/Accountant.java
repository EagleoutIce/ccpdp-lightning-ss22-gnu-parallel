package de.uulm.ccpdp.lt.ff;

import java.util.HashMap;
import java.util.Scanner;

public class Accountant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> acc = new HashMap<>();

        while (scan.hasNextLine()) {
            String input = scan.nextLine();
            String[] transaction = input.split(" ");

            if (transaction.length != 2) {
                System.out.println(input);
                continue;
            }

            if (!acc.containsKey(transaction[0])) {
                acc.put(transaction[0], 0);
            }

            acc.put(transaction[0], acc.get(transaction[0]) + Integer.parseInt(transaction[1]));

        }

        scan.close();
        // System.out.println("SUM: " + acc.values().stream().reduce(0, Integer::sum));
        acc.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        });

    }
}
