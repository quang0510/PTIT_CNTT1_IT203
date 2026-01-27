package Session_3;

import java.util.Scanner;

public class Bài1 {
    // Nhập n mã sách
    public static int[] addBookToLibraries(int n) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];

        System.out.printf("Nhập mã số cho %d cuốn sách : \n", n);
        for (int i = 0; i < n; i++) {
            System.out.printf("Sách thứ %d: ", i + 1);
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    // Hiển thị danh sách mã sách
    public static void displayLibraries(int[] arr) {
        System.out.print("\n--- KẾT QUẢ ---\n");
        System.out.println("Danh sách mã sách: ");

        for (int i = 0; i < arr.length; i++) {

            if(i == arr.length -1){
                System.out.printf("%d \t", arr[i]);
            }else {
                System.out.printf("%d, \t", arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng sách cần quản lý: ");
        int n = sc.nextInt();

        int[] libraries = addBookToLibraries(n);
        displayLibraries(libraries);
    }
}
