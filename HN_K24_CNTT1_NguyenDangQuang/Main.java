package HN_K24_CNTT1_NguyenDangQuang;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[100];
        int size = 0; // số sinh viên hiện có
        int choice;

        do {
            System.out.println("===== QUẢN LÝ ĐIỂM SINH VIÊN =====");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Tìm kiếm sinh viên theo học lực");
            System.out.println("4. Sắp xếp theo học lực giảm dần");
            System.out.println("5. Thoát");
            System.out.print("Mời bạn nhập lựa chọn (1-5): ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng sinh viên cần thêm: ");
                    int n = scanner.nextInt();
                    scanner.nextLine();

                    for (int i = 0; i < n; i++) {
                        System.out.println("\nSinh viên thứ " + (size + 1));
                        String id;
                        while (true) {
                            System.out.print("Nhập mã SV (VD: SV001): ");
                            id = scanner.nextLine();
                            if (isValidId(id)) {
                                break;
                            }
                            System.out.println("Mã sinh viên không hợp lệ ");
                        }

                        System.out.print("Nhập họ tên: ");
                        String name = scanner.nextLine();

                        System.out.print("Nhập điểm trung bình: ");
                        double score = scanner.nextDouble();
                        scanner.nextLine();

                        students[size] = new Student(id, name, score);
                        size++;
                    }
                    break;

                case 2:
                    // hiển thị danh sách sinh viên
                    if (size == 0) {
                        System.out.println("Danh sách sinh viên rỗng ");
                    } else {
                        System.out.println("\n--- DANH SÁCH SINH VIÊN ---");
                        for (int i = 0; i < size; i++) {
                            students[i].showInfo();
                        }
                    }
                    break;

                case 3:
                    // tim kiem theo học lực
                    System.out.print("Nhập học lực cần tìm (Gioi/Kha/Trung Binh): ");
                    String rank = scanner.nextLine();

                    boolean flag = false;

                    for (int i = 0; i < size; i++) {
                        if (students[i].getRank().equalsIgnoreCase(rank)) {
                            students[i].showInfo();
                            flag = true;
                        }
                    }

                    if (!flag) {
                        System.out.println("Không tìm thấy sinh viên phù hợp!");
                    }
                    break;

                case 4:
                    // sap xep
                    for (int i = 0; i < size - 1; i++) {
                        for (int j = i + 1; j < size; j++) {
                            if (students[i].getScore() < students[j].getScore()) {
                                Student temp = students[i];
                                students[i] = students[j];
                                students[j] = temp;
                            }
                        }
                    }
                    System.out.println("Đã sắp xếp theo học lực giảm dần");
                    for (int i = 0; i < size; i++) {
                        students[i].showInfo();
                    }
                    break;

                case 5:
                    System.out.println("Thoát chương trình");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }

        } while (choice != 5);
    }

    // ===== validate id =====
    static boolean isValidId(String id) {
        return id.matches("^SV\\d{3}$");
    }

}
