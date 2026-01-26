package Session_2;

import java.util.Scanner;

public class Bài4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ID ;
        do {
            System.out.print("Nhập mã sách mới : ");
             ID = scanner.nextInt();
            if (ID <= 0){
                System.out.println("mã k hợp lý , hãy nhập lại");
            }
        }while (ID <= 0);
        System.out.printf("Mã sách %d đã được ghi nhận", ID);
    }
}
