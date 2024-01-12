package chapter2.item6;

import java.util.regex.Pattern;

public class itemApplication {

    public static void main(String[] args) {
        int repeat = 10000000;

        long start = System.currentTimeMillis();
        for(int i=0; i<repeat; i++) {
            isRomanNumeral("test");
        }
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        for(int i=0; i<repeat; i++) {
            isRomanNueralStatic("test");
        }
        System.out.println(System.currentTimeMillis() - start);
    }

    static boolean isRomanNumeral(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})" + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }

    private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})" + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    static boolean isRomanNueralStatic(String s) {
        return ROMAN.matcher(s).matches();
    }

}
