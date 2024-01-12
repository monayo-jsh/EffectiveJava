package chapter2.item3;

//public static final 필드 방식의 싱글턴
public class PublicStaticFinalSingleton {

    public static final PublicStaticFinalSingleton INSTANCE = new PublicStaticFinalSingleton();
    private PublicStaticFinalSingleton() {}

    public void leaveTheBuilder() {

    }

}
