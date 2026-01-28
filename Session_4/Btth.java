package Session_4;

import java.util.Scanner;

public class Btth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập họ tên: ");
        String fullName = scanner.nextLine().trim().toLowerCase();

        String[] words = fullName.split(" ");

        // lấy tên (từ cuối)
        String firstName = words[words.length - 1];

        // lấy chữ cái đầu của họ + tên đệm
        String shortName = "";
        for (int i = 0; i < words.length - 1; i++) {
            shortName += words[i].charAt(0);
        }

        String email = firstName + "." + shortName + "@gmail.com";

        System.out.printf("Email: %s", email);
    }
}
