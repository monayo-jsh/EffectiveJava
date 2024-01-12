package chapter2.item2;

//자바빈즈 패턴 - 일관성이 깨지고 불변으로 만들 수 없다.
public class JavaBeansPattern {
    private int servingSize;  // (ml, 1회 제공량)     필수
    private int servings;     // (회, 총 n회 제공량)   필수
    private int calories;     // (1회 제공량당)       선택
    private int fat;          // (g/1회 제공량)       선택
    private int sodium;       // (mg/1회 제공량)      선택
    private int carbohydrate; // (g/1회 제공량)       선택

    public JavaBeansPattern() {}

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public static void main(String[] args) {
        JavaBeansPattern cocaCola = new JavaBeansPattern();
        cocaCola.setServingSize(240);
        cocaCola.setServings(8);
        cocaCola.setCalories(100);
        cocaCola.setSodium(35);
        cocaCola.setCarbohydrate(27);
    }
}
