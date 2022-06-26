public class Producer {
    public static String[] names = { "Felix", "Florian", "the_Queen", "Alexander" };
    public static int[] acc = new int[names.length];

    public static void main(String[] args) throws InterruptedException {
        int n = args.length == 1 ? Integer.parseInt(args[0]) : 10;

        for (int i = 0; i < n; i++) {
            Thread.sleep((int) (Math.random() * 100));
            int from = (int) (Math.random() * names.length);
            int to = (int) (Math.random() * names.length);
            if (from == to) {
                i--;
                continue;
            }
            int value = (int) (Math.random() * 100) * 10;
            acc[from] -= value;
            acc[to] += value;
            System.out.println(from + " " + to + " " + value);
        }

        // for (int i = 0; i < names.length; i++) {
        // System.out.println(names[i] + ": " + acc[i] + "€");
        // }
    }
}
