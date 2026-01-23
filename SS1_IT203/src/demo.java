
import java.util.Scanner;

public class demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap a: ");
        int a = sc.nextInt();

        System.out.print("Nhap b: ");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("Tong = " + sum);

        if (sum > 10) {
            System.out.println("Tong lon hon 10");
        } else {
            System.out.println("Tong nho hon hoac bang 10");
        }
    }
}
