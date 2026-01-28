package Session_4;

import java.util.Scanner;

public class Btth2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số điện thoại: ");
        String phone = scanner.nextLine();

        String regex = "^0[9142][0-9]{8,9}$";

        if (phone.matches(regex)) {
            System.out.printf("Số điện thoại hợp lệ \n");
        } else {
            System.out.printf("Số điện thoại không hợp lệ\n");
        }
    }
}
