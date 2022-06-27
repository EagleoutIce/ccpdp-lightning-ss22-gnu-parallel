package de.uulm.ccpdp.lt.ff;

import java.util.Scanner;

public class Consumer {
    private static final int FROM = 0;
    private static final int TO = 1;
    private static final int VALUE = 2;

    public static void main(String[] args) {
        /* { Consumer main } */
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String[] s = scan.nextLine().split(" ");
            System.out.println(Constants.NAMES[Integer.parseInt(s[FROM])] + " " + -Integer.parseInt(s[VALUE]));
            System.out.println(Constants.NAMES[Integer.parseInt(s[TO])] + " " + Integer.parseInt(s[VALUE]));
        }
        scan.close();
        /* { Consumer } */
        /* not really an error but hey */
        System.err.println("INFO: Consumer closed!");
    }
}
