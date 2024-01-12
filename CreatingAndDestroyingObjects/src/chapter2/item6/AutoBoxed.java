package chapter2.item6;

public class AutoBoxed {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        System.out.println(sumLong());
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        System.out.println(sumLong2());
        System.out.println(System.currentTimeMillis() - start);

    }

    private static Long sumLong() {
        Long sum = 0L;

        for (long i=0; i <= Integer.MAX_VALUE; i++) {
            sum += i; // auto boxed...
        }

        return sum;
    }

    private static long sumLong2() {
        long sum = 0L;

        for (long i=0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }

        return sum;
    }
}
