package Session_3;

import java.util.Scanner;

public class Bài5 {
    public static int deleteBook(int[] books , int n , int bookID){
        int index = -1;

        for (int i = 0; i < n; i++) {
            if (books[i] == bookID){
                index = i;
                break;
            }
        }
        if (index== -1 ){
            System.out.printf("k tìm thấy sách với mã %d", bookID);
            return n;
        }
        // dồn sang trái để xóa
        for (int i = index; i < n-1 ; i++) {
            books[i] = books[i+1];
        }
        System.out.printf("đã xóa thành công sách có mã %d \n" , bookID);

        return n-1 ;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] books = {101 , 102 ,103 , 104 , 105};

        int n = books.length;

        System.out.print("Danh sách ban đầu : ");
        for (int i = 0; i < books.length; i++) {
            System.out.printf("%d  ",books[i]);
        }
        System.out.println();

        System.out.print("Nhập mã sách cần xóa : ");
        int bookId = scanner.nextInt();

        n = deleteBook(books , n ,bookId);

        System.out.print("danh sách sau khi xóa là : ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d " , books[i]);
        }

    }
}
