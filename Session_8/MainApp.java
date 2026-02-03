package Session_8;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        int choice;

        do {
            System.out.println("\n===== QUẢN LÝ SINH VIÊN =====");
            System.out.println("1. Thêm sinh viên mới");
            System.out.println("2. Hiển thị tất cả sinh viên");
            System.out.println("3. Tìm kiếm sinh viên");
            System.out.println("4. Cập nhật thông tin sinh viên");
            System.out.println("5. Xóa sinh viên");
            System.out.println("6. Tính điểm trung bình và xếp loại");
            System.out.println("7. Sắp xếp sinh viên");
            System.out.println("8. Thống kê");
            System.out.println("9. Thoát");
            System.out.print("Chọn chức năng (1-9): ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                /* ===== CASE 1: ADD ===== */
                case 1:
                    System.out.print("Mã SV: ");
                    String id = sc.nextLine();
                    if (manager.isDuplicateId(id)) {
                        System.out.println("Mã sinh viên đã tồn tại!");
                        break;
                    }

                    System.out.print("Họ tên: ");
                    String name = sc.nextLine();

                    System.out.print("Tuổi: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Giới tính: ");
                    String gender = sc.nextLine();

                    System.out.print("Điểm Toán: ");
                    double math = sc.nextDouble();
                    System.out.print("Điểm Lý: ");
                    double physics = sc.nextDouble();
                    System.out.print("Điểm Hóa: ");
                    double chemistry = sc.nextDouble();

                    manager.addStudent(
                            new Student(id, name, age, gender, math, physics, chemistry)
                    );
                    break;

                /* ===== CASE 2: SHOW ===== */
                case 2:
                    manager.showAll();
                    break;

                /* ===== CASE 3: SEARCH ===== */
                case 3:
                    System.out.println("1. Tìm theo mã SV");
                    System.out.println("2. Tìm theo tên");
                    System.out.print("Chọn: ");
                    int opt = sc.nextInt();
                    sc.nextLine();

                    if (opt == 1) {
                        System.out.print("Nhập mã SV: ");
                        manager.searchById(sc.nextLine());
                    } else {
                        System.out.print("Nhập tên cần tìm: ");
                        manager.searchByName(sc.nextLine());
                    }
                    break;

                /* ===== CASE 4: UPDATE ===== */
                case 4:
                    System.out.print("Nhập mã SV cần cập nhật: ");
                    String uid = sc.nextLine();

                    System.out.print("Tên mới: ");
                    String newName = sc.nextLine();

                    System.out.print("Tuổi mới: ");
                    int newAge = sc.nextInt();

                    System.out.print("Toán: ");
                    double m = sc.nextDouble();
                    System.out.print("Lý: ");
                    double p = sc.nextDouble();
                    System.out.print("Hóa: ");
                    double c = sc.nextDouble();

                    manager.updateStudent(uid, newName, newAge, m, p, c);
                    break;

                /* ===== CASE 5: DELETE ===== */
                case 5:
                    System.out.print("Nhập mã SV cần xóa: ");
                    manager.deleteStudent(sc.nextLine());
                    break;

                /* ===== CASE 6: CALC AVG & RANK ===== */
                case 6:
                    System.out.print("Nhập mã sinh viên: ");
                    String sid = sc.nextLine();
                    manager.showAverageAndRank(sid);
                    break;

                /* ===== CASE 7: SORT ===== */
                case 7:
                    System.out.println("1. Theo điểm TB giảm dần");
                    System.out.println("2. Theo tên A-Z");
                    System.out.print("Chọn: ");
                    int sort = sc.nextInt();

                    if (sort == 1) {
                        manager.sortByAvgDesc();
                    } else if (sort == 2) {
                        manager.sortByNameAZ();
                    }else {
                        System.out.println("lựa chọn k hợp lệ");
                    }
                    break;
                /* ===== CASE 8: STATISTIC ===== */
                case 8:
                    manager.statistic();
                    break;
                /* ===== CASE 9: EXIT ===== */
                case 9:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 9);
    }
}
