package Session_4;

import java.util.Scanner;

public class Bài1 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.print("Nhập tên sách : ");
        String nameBook = scanner.nextLine();

        System.out.print("Nhập tên tác giả : ");
        String nameAuthor = scanner.nextLine();

        System.out.print("nhập thể loại : ");
        String type = scanner.nextLine();

        // xử lý tên sách
        nameBook = nameBook.trim().toUpperCase();

        nameAuthor = nameAuthor.trim().toLowerCase();
        String formattedAuthor = "";
        boolean isFirstCharOfWord = true;

        for (int i = 0; i < nameAuthor.length(); i++) {
            char c = nameAuthor.charAt(i);

            if (c == ' ') {
                formattedAuthor += c;
                isFirstCharOfWord = true;
            } else {
                if (isFirstCharOfWord) {
                    formattedAuthor += Character.toUpperCase(c);
                    isFirstCharOfWord = false;
                } else {
                    formattedAuthor += c;
                }
            }
        }

        System.out.printf("Tên sách : %s - Tác giả : %s%n", nameBook, formattedAuthor);
    }
}
