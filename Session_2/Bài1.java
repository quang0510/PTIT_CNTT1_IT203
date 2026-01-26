package Session_2;

import java.util.Scanner;

public class Bài1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("mời bạn nhập số tuổi");
        int age = scanner.nextInt();

        System.out.print("mời bạn nhập số sách đang giữ");
        int bookBorrow = scanner.nextInt();

        if (age >18 && bookBorrow < 3 ){
            System.out.println("bạn đủ điều kiện mượn sách");
        }else if (age >18 &&  bookBorrow >= 3){
            System.out.println("bạn không đủ diều kiện mượn sách . Lí do : đã mượn tối đa 3 cuốn");

        }else {
            System.out.println("Bạn phải từ 18 tuổi trở lên");
        }
    }
}
