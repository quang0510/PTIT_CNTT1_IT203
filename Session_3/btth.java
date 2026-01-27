package Session_3;

import java.util.Scanner;

public class btth {

    // ===== HIỂN THỊ =====
    public static void showBooks(int[] ids, String[] titles, int[] quantities, int size) {
        if (size == 0) {
            System.out.println("Danh sách trống ");
            return;
        }

        System.out.printf("%-10s %-20s %-10s\n", "Mã", "Tên sách", "Số lượng");
        for (int i = 0; i < size; i++) {
            System.out.printf("%-10d %-20s %-10d\n",
                    ids[i], titles[i], quantities[i]);
        }
    }

    // ===== THÊM SÁCH =====
    public static int addBook(int[] ids, String[] titles, int[] quantities, int size, int MAX, int id, String title, int quantity) {

        if (size == MAX) {
            System.out.println("Mảng đã đầy");
            return size;
        }

        for (int i = 0; i < size; i++) {
            if (ids[i] == id) {
                System.out.println("Mã sách đã tồn tại");
                return size;
            }
        }

        ids[size] = id;
        titles[size] = title;
        quantities[size] = quantity;

        System.out.println("Thêm sách thành công");
        return size + 1;
    }

    // ===== CẬP NHẬT =====
    public static void updateQuantity(int[] ids, int[] quantities, int size, int id, int newQuantity) {

        for (int i = 0; i < size; i++) {
            if (ids[i] == id) {
                quantities[i] = newQuantity;
                System.out.println("Cập nhật thành công");
                return;
            }
        }

        System.out.println("Không tìm thấy sách");
    }

    // ===== XÓA =====
    public static int deleteBook(int[] ids, String[] titles, int[] quantities, int size, int id) {

        int index = -1;
        for (int i = 0; i < size; i++) {
            if (ids[i] == id) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Không tìm thấy sách");
            return size;
        }

        for (int i = index; i < size - 1; i++) {
            ids[i] = ids[i + 1];
            titles[i] = titles[i + 1];
            quantities[i] = quantities[i + 1];
        }

        System.out.println("Xóa sách thành công");
        return size - 1;
    }

    // ===== TÌM KIẾM =====
    public static void searchBook(int[] ids, String[] titles, int[] quantities, int size, String key) {

        boolean count = false;
        System.out.printf("%-10s %-20s %-10s\n", "Mã", "Tên sách", "Số lượng");

        for (int i = 0; i < size; i++) {
            if (titles[i].contains(key)) {
                System.out.printf("%-10d %-20s %-10d\n", ids[i], titles[i], quantities[i]);
                count = true;
            }
        }

        if (!count) {
            System.out.println("Không có sách phù hợp");
        }
    }

    // sắp xếp
    public static void sortByQuantityDesc(int[] ids, String[] titles,int[] quantities, int size) {

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (quantities[j] < quantities[j + 1]) {

                    int tq = quantities[j];
                    quantities[j] = quantities[j + 1];
                    quantities[j + 1] = tq;

                    int tid = ids[j];
                    ids[j] = ids[j + 1];
                    ids[j + 1] = tid;

                    String tt = titles[j];
                    titles[j] = titles[j + 1];
                    titles[j + 1] = tt;
                }
            }
        }

        System.out.println("Sắp xếp thành công");
    }

    // ===== MAIN =====
    public static void main(String[] args) {

        final int MAX = 100;
        int[] ids = new int[MAX];
        String[] titles = new String[MAX];
        int[] quantities = new int[MAX];
        int size = 0;

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm sách");
            System.out.println("3. Cập nhật số lượng");
            System.out.println("4. Xóa sách");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Sắp xếp theo số lượng");
            System.out.println("7. Thoát");
            System.out.print("Chọn: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    showBooks(ids, titles, quantities, size);
                    break;
                case 2:
                    System.out.print("Nhập mã sách: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nhập tên sách: ");
                    String title = sc.nextLine();

                    System.out.print("Nhập số lượng: ");
                    int quantity = sc.nextInt();

                    size = addBook(ids, titles, quantities, size, MAX, id, title, quantity);
                    break;

                case 3:
                    System.out.print("Nhập mã sách: ");
                    int idUpdate = sc.nextInt();

                    System.out.print("Nhập số lượng mới: ");
                    int newQuantity = sc.nextInt();

                    updateQuantity(ids, quantities, size, idUpdate, newQuantity);
                    break;

                case 4:
                    System.out.print("Nhập mã sách cần xóa: ");
                    int idDelete = sc.nextInt();

                    size = deleteBook(ids, titles, quantities, size, idDelete);
                    break;

                case 5:
                    sc.nextLine();
                    System.out.print("Nhập tên sách cần tìm: ");
                    String key = sc.nextLine();

                    searchBook(ids, titles, quantities, size, key);
                    break;

                case 6:
                    sortByQuantityDesc(ids, titles, quantities, size);
                    break;

                case 7:
                    System.out.println("Thoát");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }

        } while (choice != 7);
    }
}
