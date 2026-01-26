package Session_2;

import java.util.Scanner;

public class Bài3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số sách trả muộn ");
        int n = scanner.nextInt();
        int total = 0; // tooeng tiền  phạt
        int tienPhat = 5000 ;

        for (int i = 1 ; i <= n ; i++){
            System.out.printf("Nhập số ngày trễ của cuốn thứ %d : ", i );
            int soNgayTre = scanner.nextInt();
            total += tienPhat * soNgayTre;
        }
        System.out.printf("tổng tiền phạt : %d" , total);
    }
}
