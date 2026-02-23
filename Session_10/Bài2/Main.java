package Session_10.Bài2;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Volvo");
        Vehicle bicycle = new Bicycle("Thong Nhat");

        System.out.print(car.brand + " - Cách di chuyển: ");
        car.move();

        System.out.print(bicycle.brand + " - Cách di chuyển: ");
        bicycle.move();

    }
}
