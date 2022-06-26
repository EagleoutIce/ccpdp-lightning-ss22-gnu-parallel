import java.util.Arrays;

public class Consumer {
    static final int FROM = 0;
    static final int TO = 1;
    static final int VALUE = 2;

    public static void main(String[] args) {

        if (args.length == 0)
            System.exit(0);
        String[] split = args[0].split(" ");

        if (split.length != 3) {
            System.out.println(Arrays.toString(args));
            System.exit(0);
        }

        int from = Integer.parseInt(split[FROM]);
        int to = Integer.parseInt(split[TO]);
        int value = Integer.parseInt(split[VALUE]);
        // System.out.println(Producer.names[to] + " gets " + value + "€ from " +
        // Producer.names[from]);
        System.out.println(Producer.names[to] + " " + value);
        System.out.println(Producer.names[from] + " " + -value);

    }
}
