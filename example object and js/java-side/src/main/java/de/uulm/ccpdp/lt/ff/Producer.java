package de.uulm.ccpdp.lt.ff;

import java.util.Random;

import com.google.gson.GsonBuilder;

public class Producer {
    public static void main(String[] args) throws InterruptedException {
        int n = args.length == 1 ? Integer.parseInt(args[0]) : 10;
        final var rand = new Random();
        final var gson = new GsonBuilder().create();
        /* { Producer main } */
        for (int i = 0; i < n; i++) {
            int from = rand.nextInt(Constants.NAMES.length);
            int to = rand.nextInt(Constants.NAMES.length);
            int value = rand.nextInt(100) * 10;
            final var transaction = new Transaction(from, to, value);
            System.out.println(gson.toJson(transaction));
        }
        /* { Producer } */
    }
}
