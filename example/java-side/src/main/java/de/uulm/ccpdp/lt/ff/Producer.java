package de.uulm.ccpdp.lt.ff;

import java.util.Random;

public class Producer {
    public static void main(String[] args) throws InterruptedException {
        int n = args.length == 1 ? Integer.parseInt(args[0]) : 10;
        /* { Consumer main } */
        final var rand = new Random();
        for (int i = 0; i < n; i++) {
            int from = rand.nextInt(Constants.NAMES.length);
            int to = rand.nextInt(Constants.NAMES.length);
            System.out.println(from + " " + to + " " + rand.nextInt(100) * 10);
        }
        /* { Consumer } */
    }
}
