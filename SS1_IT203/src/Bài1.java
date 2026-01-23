import java.util.Scanner;

public class Bài1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma sach :");
        String bookID = sc.nextLine();

        System.out.print("Nhap ten sach :");
        String bookName = sc.nextLine();

        System.out.print("Nhap nam xuat ban :");
        int publishYear = sc.nextInt();

        System.out.print("Nhap gia : ");
        double price = sc.nextDouble();

        System.out.print("Sach con trong kho (true/false)");
        boolean isAvailable = sc.nextBoolean();

        // tính tuổi thọ sách
        int age = 2026 - publishYear;

        String status = isAvailable ? "Con sach" : "Da muon";

        System.out.println("--- PHIẾU THÔNG TIN SÁCH---");
        System.out.printf("Tên sách : %s \n" , bookName);
        System.out.printf("Mã số : %s | Tuổi thọ : %d năm \n", bookID ,age);
        System.out.printf("Giá bán : %.2f VND \n" , price);
        System.out.printf("Trình trạng : %s " , status);

    }
}
