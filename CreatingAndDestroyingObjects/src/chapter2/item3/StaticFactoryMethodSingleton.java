package chapter2.item3;

//정적 팩터리 메서드 방식의 싱글턴
public class StaticFactoryMethodSingleton {

    private static final StaticFactoryMethodSingleton INSTANCE = new StaticFactoryMethodSingleton();
    private StaticFactoryMethodSingleton() {}

    public static StaticFactoryMethodSingleton getInstance() { return INSTANCE; }

    public void leaveTheBuilding() {

    }

}
