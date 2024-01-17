package item17;

// 생성자 대신 정적 팩터리를 사용한 불변 클래스 구조
// 상속도 생성자를 private 으로 선언하여 막음으로써 상속 방지
// 정적 팩터리 메서드를 활용해서 객체 생성 및 초기화 반환
public class Complex {
    private final double re;
    private final double im;

    private Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public static Complex valueOf(double re, double im) {
        return new Complex(re, im);
    }
}
