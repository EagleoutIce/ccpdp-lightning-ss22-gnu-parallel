package de.uulm.ccpdp.lt.ff;

import java.util.Random;

public class Producer {
    public static void main(String[] args) throws InterruptedException {
        int n = args.length == 1 ? Integer.parseInt(args[0]) : 10;
        final var rand = new Random();

        for (int i = 0; i < n; i++) {

            int from;
            int to;
            do {
                from = rand.nextInt(Constants.names.length);
                to = rand.nextInt(Constants.names.length);
            } while (from == to);

            int value = rand.nextInt(100) * 10;

            System.out.println(from + " " + to + " " + value);
        }
    }
}
