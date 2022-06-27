package de.uulm.ccpdp.lt.ff;

import java.util.Scanner;

import com.google.gson.GsonBuilder;

public class Consumer {

    public static void main(String[] args) {
        final var scan = new Scanner(System.in);
        final var gson = new GsonBuilder().create();
        /* { Consumer main } */
        while (scan.hasNextLine()) {
            String input = scan.nextLine();
            final var transaction = gson.fromJson(input, Transaction.class);
            System.out.println(Constants.NAMES[transaction.to] + " " + transaction.value);
            System.out.println(Constants.NAMES[transaction.from] + " -" + transaction.value);
        }
        /* { Consumer } */
        scan.close();
        System.err.println("INFO: Consumer closed!");
    }
}
// Note: we assume pos values etc.
