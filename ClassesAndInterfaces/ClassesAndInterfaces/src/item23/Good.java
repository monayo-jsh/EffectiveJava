package item23;

public class Good {

    private abstract class Figure {
        abstract double area();
    }

    private class Circle extends Figure {

        private final double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double area() {
            return Math.PI * (radius * radius);
        }
    }

    private class Rectangle extends Figure {
        private final double length;
        private final double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        double area() {
            return length * width;
        }
    }

}
