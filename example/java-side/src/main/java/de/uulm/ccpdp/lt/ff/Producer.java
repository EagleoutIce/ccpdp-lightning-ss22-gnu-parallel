package de.uulm.ccpdp.lt.ff;

import java.util.Random;

import com.google.gson.GsonBuilder;

public class Producer {
    public static String[] names = { "Felix", "Florian", "the_Queen", "Alexander" };
    public static int[] acc = new int[names.length];

    public static void main(String[] args) throws InterruptedException {
        int n = args.length == 1 ? Integer.parseInt(args[0]) : 10;
        final var rand = new Random();
        final var gson = new GsonBuilder().create();

        for (int i = 0; i < n; i++) {
            // Thread.sleep((int) (Math.random() * 100));
            int from;
            int to;
            do {
                from = rand.nextInt(0, names.length);
                to = rand.nextInt(0, names.length);
            } while(from == to);

            int value = rand.nextInt(0, 100) * 10;
            final var transaction = new Transaction(from, to, value);
            // TODO: why here?
            acc[from] -= value;
            acc[to] += value;

            System.out.println(gson.toJson(transaction));
        }

        // for (int i = 0; i < names.length; i++) {
        // System.out.println(names[i] + ": " + acc[i] + "€");
        // }
    }
}
