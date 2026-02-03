package Session_8;

public class StudentManager {

    private Student[] students;
    private int size;

    public StudentManager() {
        students = new Student[100];
        size = 0;
    }

    /* ================= ADD ================= */

    public boolean isDuplicateId(String id) {
        for (int i = 0; i < size; i++) {
            if (students[i].getId().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }

    public void addStudent(Student s) {
        if (size >= students.length) {
            System.out.println("Danh sách đã đầy!");
            return;
        }
        students[size++] = s;
        System.out.println("Thêm sinh viên thành công!");
    }

    /* ================= DISPLAY ================= */

    public void showAll() {
        if (size == 0) {
            System.out.println("Danh sách trống!");
            return;
        }

        System.out.printf("%-10s %-20s %-5s %-8s %-6s %-6s %-6s %-6s %-12s\n",
                "Mã SV", "Họ tên", "Tuổi", "GT", "Toán", "Lý", "Hóa", "ĐTB", "Xếp loại");

        for (int i = 0; i < size; i++) {
            students[i].display();
        }
    }

    /* ================= SEARCH ================= */

    public void searchById(String id) {
        for (int i = 0; i < size; i++) {
            if (students[i].getId().equalsIgnoreCase(id)) {
                students[i].display();
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên!");
    }

    public void searchByName(String keyword) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (students[i].getFullName().toLowerCase().contains(keyword.toLowerCase())) {
                students[i].display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sinh viên!");
        }
    }

    /* ================= UPDATE ================= */

    public void updateStudent(String id, String name, int age,
                              double math, double physics, double chemistry) {
        for (int i = 0; i < size; i++) {
            if (students[i].getId().equalsIgnoreCase(id)) {
                students[i].setFullName(name);
                students[i].setAge(age);
                students[i].setMath(math);
                students[i].setPhysics(physics);
                students[i].setChemistry(chemistry);
                System.out.println("Cập nhật thành công");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên!");
    }

    /* ================= DELETE ================= */

    public void deleteStudent(String id) {
        for (int i = 0; i < size; i++) {
            if (students[i].getId().equalsIgnoreCase(id)) {
                for (int j = i; j < size - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[--size] = null;
                System.out.println("Xóa thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên!");
    }
    // case 6 ;
    public void showAverageAndRank(String id) {
        for (int i = 0; i < size; i++) {
            if (students[i].getId().equalsIgnoreCase(id)) {

                System.out.printf("Mã SV: %s\n", students[i].getId());
                System.out.printf("Họ tên: %s\n", students[i].getFullName());
                System.out.printf("Điểm trung bình: %.2f\n", students[i].getAvg());
                System.out.printf("Xếp loại: %s\n", students[i].getRank());

                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên");
    }


    /* ================= SORT ================= */

    public void sortByAvgDesc() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (students[j].getAvg() < students[j + 1].getAvg()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        System.out.println("Đã sắp xếp theo điểm TB giảm dần!");
    }

    public void sortByNameAZ() {
        for (int i = 0; i < size - 1; i++) {
            int min = i;
            for (int j = i + 1; j < size; j++) {
                if (students[j].getFullName()
                        .compareToIgnoreCase(students[min].getFullName()) < 0) {
                    min = j;
                }
            }
            Student temp = students[i];
            students[i] = students[min];
            students[min] = temp;
        }
        System.out.println("Đã sắp xếp theo tên A-Z!");
    }

    /* ================= STATISTIC ================= */

    public void statistic() {
        int gioi = 0, kha = 0, tb = 0, yeu = 0;
        double sum = 0;

        for (int i = 0; i < size; i++) {
            sum += students[i].getAvg();
            switch (students[i].getRank()) {
                case "Giỏi":
                    gioi++;
                    break;
                case "Khá":
                    kha++;
                    break;
                case "Trung bình":
                    tb++;
                    break;
                default:
                    yeu++;
                    break;
            }
        }
        System.out.printf("Giỏi: %d | Khá: %d | Trung bình: %d | Yếu: %d\n",
                gioi, kha, tb, yeu);

        if (size > 0) {
            System.out.printf("Điểm TB chung: %.2f\n", sum / size);
        }
    }
}
