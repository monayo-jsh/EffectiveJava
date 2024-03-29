package chapter2.item2;

//빌더 패턴 - 점층적 생성자 패턴과 자바빈즈 패턴의 장점만 취한다.
public class BuilderPattern {
    private final int servingSize;  // (ml, 1회 제공량)     필수
    private final int servings;     // (회, 총 n회 제공량)   필수
    private final int calories;     // (1회 제공량당)       선택
    private final int fat;          // (g/1회 제공량)       선택
    private final int sodium;       // (mg/1회 제공량)      선택
    private final int carbohydrate; // (g/1회 제공량)       선택

    public static class Builder {
        //필수 매개변수
        private final int servingSize;
        private final int servings;

        //선택 매개변수 - 기본값 초기화
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            this.calories = val;
            return this;
        }

        public Builder fat(int val) {
            this.fat = val;
            return this;
        }

        public Builder sodium(int val) {
            this.sodium = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            this.carbohydrate = val;
            return this;
        }

        public BuilderPattern build() {
            return new BuilderPattern(this);
        }
    }

    private BuilderPattern(Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
    }

    @Override
    public String toString() {
        return "BuilderPattern{" +
            "servingSize=" + servingSize +
            ", servings=" + servings +
            ", calories=" + calories +
            ", fat=" + fat +
            ", sodium=" + sodium +
            ", carbohydrate=" + carbohydrate +
            '}';
    }

    public static void main(String[] args) {
        BuilderPattern builderPattern = new BuilderPattern.Builder(240, 8)
            .calories(100)
            .sodium(35)
            .carbohydrate(27)
            .build();

        System.out.println("builderPattern = " + builderPattern);
    }
}