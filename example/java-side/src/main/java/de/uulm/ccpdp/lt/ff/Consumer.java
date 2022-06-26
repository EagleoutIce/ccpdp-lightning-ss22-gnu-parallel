package de.uulm.ccpdp.lt.ff;


import com.google.gson.GsonBuilder;


public class Consumer {
    static final int FROM = 0;
    static final int TO = 1;
    static final int VALUE = 2;

    public static void main(String[] args) {
        // TODO: umstieg auf scanner  und vielleicht mit kill-pill?
        // consumer sollten ja auch mehrere verarbeiten können und nicht direkt sterben!

        if (args.length != 1)
            System.exit(0);

        final var gson = new GsonBuilder().create();
        final var transaction = gson.fromJson(args[0], Transaction.class);

        // System.out.println(Producer.names[to] + " gets " + value + "€ from " +
        // Producer.names[from]);
        System.out.println(Producer.names[transaction.to] + " " + transaction.value);
        System.out.println(Producer.names[transaction.from] + " " + -transaction.value);

    }
}
