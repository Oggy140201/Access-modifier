public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle1 = new Circle(1.5);
        Circle circle2 = new Circle("Đỏ",2);
        System.out.println(circle);
        System.out.println(circle1);
        System.out.println(circle2);
    }
}