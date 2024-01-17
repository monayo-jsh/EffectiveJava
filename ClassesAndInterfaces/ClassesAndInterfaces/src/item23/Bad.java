package item23;

public class Bad {

    private class Figure {
        private enum Shape { RECTANGLE, CIRCLE };

        // 태그 필드 - 현재 모양을 나타냄
        private final Shape shape;

        // 다음 필드들은 모양이 사각형일 때만 쓰임
        private double length;
        private double width;

        // 다음 필드는 모양이 원일 때만 쓰임
        private double radius;

        // 원용 생성자
        Figure(double radius) {
            this.shape = Shape.CIRCLE;
            this.radius = radius;
        }

        // 사각형용 생성자
        Figure(double length, double width) {
            this.shape = Shape.RECTANGLE;
            this.length = length;
            this.width = width;
        }

        private double area() {
            switch ( this.shape ) {
                case RECTANGLE: return length * width;
                case CIRCLE: return Math.PI * (radius * radius);
                default:
                    throw new AssertionError(shape);
            }
        }
    }


}
