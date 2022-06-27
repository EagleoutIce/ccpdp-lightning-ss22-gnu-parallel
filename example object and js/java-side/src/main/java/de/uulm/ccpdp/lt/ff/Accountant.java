package de.uulm.ccpdp.lt.ff;

import java.util.HashMap;
import java.util.Scanner;

public class Accountant {
    public static void main(String[] args) {
        /* { Accountant main } */
        final var scan = new Scanner(System.in);
        final var accounts = new HashMap<String, Integer>();
        while (scan.hasNextLine()) {
            String[] transaction = scan.nextLine().split(" ");
            final var old = accounts.getOrDefault(transaction[0], 0);
            accounts.put(transaction[0], old + Integer.parseInt(transaction[1]));
        }
        scan.close();
        System.out.println(accounts);
        /* { Accountant } */
    }
}
