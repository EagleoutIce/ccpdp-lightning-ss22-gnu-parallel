package de.uulm.ccpdp.lt.ff;

import java.util.Scanner;

import com.google.gson.GsonBuilder;

public class Consumer {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextLine()) {
            String input = scan.nextLine();

            final var gson = new GsonBuilder().create();
            final var transaction = gson.fromJson(input, Transaction.class);

            System.out.println(Constants.names[transaction.to] + " " + transaction.value);
            System.out.println(Constants.names[transaction.from] + " " + -transaction.value);

        }
        scan.close();
        System.out.println("INFO: Consumer closed!");

    }
}
