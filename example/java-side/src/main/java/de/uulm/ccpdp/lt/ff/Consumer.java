package de.uulm.ccpdp.lt.ff;

import java.util.Scanner;

public class Consumer {
    static final int FROM = 0;
    static final int TO = 1;
    static final int VALUE = 2;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextLine()) {
            String input = scan.nextLine();

            String[] s = input.split(" ");

            System.out.println(Constants.names[Integer.parseInt(s[FROM])] + " " + -Integer.parseInt(s[VALUE]));
            System.out.println(Constants.names[Integer.parseInt(s[TO])] + " " + Integer.parseInt(s[VALUE]));

        }
        scan.close();
        System.out.println("INFO: Consumer closed!");

    }
}
