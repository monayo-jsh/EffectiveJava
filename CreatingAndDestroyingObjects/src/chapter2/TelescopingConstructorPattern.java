package chapter2;

//점층적 생성자 패턴 - 확장하기 어렵다.
public class TelescopingConstructorPattern {
    private final int servingSize;  // (ml, 1회 제공량)     필수
    private final int servings;     // (회, 총 n회 제공량)   필수
    private final int calories;     // (1회 제공량당)       선택
    private final int fat;          // (g/1회 제공량)       선택
    private final int sodium;       // (mg/1회 제공량)      선택
    private final int carbohydrate; // (g/1회 제공량)       선택

    public TelescopingConstructorPattern(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }

    public TelescopingConstructorPattern(int servingSize, int servings, int calories) {
        this(servingSize, servings, calories, 0);
    }

    public TelescopingConstructorPattern(int servingSize, int servings, int calories, int fat) {
        this(servingSize, servings, calories, fat, 0);
    }

    public TelescopingConstructorPattern(int servingSize, int servings, int calories, int fat, int sodium) {
        this(servingSize, servings, calories, fat, sodium, 0);
    }

    public TelescopingConstructorPattern(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }

    public static void main(String[] args) {
        TelescopingConstructorPattern test = new TelescopingConstructorPattern(240, 8, 100);
        TelescopingConstructorPattern cocaCola = new TelescopingConstructorPattern(240, 8, 100, 0, 35, 27);
    }
}
