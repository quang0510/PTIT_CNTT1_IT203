package Session_13;

import java.util.*;

public class Bài5 {
    public static class Patient {
        private String id;
        private String fullName;
        private int age;
        private String diagnosis;

        public static List<Patient> patientList = new ArrayList<>();

        public Patient() {
        }

        public Patient(String id, String fullName, int age, String diagnosis) {
            this.id = id;
            this.fullName = fullName;
            this.age = age;
            this.diagnosis = diagnosis;
        }

        public String getId() {
            return id;
        }

        public String getFullName() {
            return fullName;
        }

        public int getAge() {
            return age;
        }

        public void setDiagnosis(String diagnosis) {
            this.diagnosis = diagnosis;
        }

        public void input(Scanner sc) {
            while (true) {
                System.out.print("Nhập ID: ");
                String inputId = sc.nextLine();
                if (findPatient(inputId) == null) {
                    this.id = inputId;
                    break;
                }
                System.out.println("Lỗi: ID này đã tồn tại. Vui lòng nhập ID khác!");
            }
            System.out.print("Họ tên: ");
            this.fullName = sc.nextLine();
            System.out.print("Tuổi: ");
            this.age = Integer.parseInt(sc.nextLine());
            System.out.print("Chẩn đoán: ");
            this.diagnosis = sc.nextLine();
        }

        public static Patient findPatient(String id) {
            for (Patient p : patientList) {
                if (p.getId().equalsIgnoreCase(id)) return p;
            }
            return null;
        }

        @Override
        public String toString() {
            return String.format("| %-5s | %-20s | %-5d | %-20s |", id, fullName, age, diagnosis);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- QUẢN LÝ BỆNH NHÂN ---");
            System.out.println("1. Tiếp nhận bệnh nhân");
            System.out.println("2. Cập nhật chẩn đoán");
            System.out.println("3. Xuất viện");
            System.out.println("4. Sắp xếp danh sách (Tuổi giảm, Tên tăng)");
            System.out.println("5. Hiển thị danh sách");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    Patient p = new Patient();
                    p.input(sc);
                    Patient.patientList.add(p);
                    System.out.println("Thêm thành công!");
                    break;

                case 2:
                    System.out.print("Nhập ID cần sửa: ");
                    String updateId = sc.nextLine();
                    Patient pUpdate = Patient.findPatient(updateId);
                    if (pUpdate != null) {
                        System.out.print("Chẩn đoán mới: ");
                        pUpdate.setDiagnosis(sc.nextLine());
                        System.out.println("Đã cập nhật!");
                    } else System.out.println("Không tìm thấy ID!");
                    break;

                case 3:
                    System.out.print("Nhập ID xuất viện: ");
                    String delId = sc.nextLine();
                    Patient pDel = Patient.findPatient(delId);
                    if (pDel != null) {
                        Patient.patientList.remove(pDel);
                        System.out.println("Đã xóa bệnh nhân khỏi danh sách theo dõi.");
                    } else System.out.println("Không tìm thấy ID!");
                    break;

                case 4:
                    Collections.sort(Patient.patientList, new Comparator<Patient>() {
                        @Override
                        public int compare(Patient p1, Patient p2) {
                            int ageCompare = Integer.compare(p2.getAge(), p1.getAge());
                            if (ageCompare != 0) {
                                return ageCompare;
                            }
                            return p1.getFullName().compareToIgnoreCase(p2.getFullName());
                        }
                    });
                    System.out.println("Đã sắp xếp danh sách!");
                    break;

                case 5:
                    System.out.println("---------------------------------------------------------------");
                    System.out.printf("| %-5s | %-20s | %-5s | %-20s |%n", "ID", "Họ Tên", "Tuổi", "Chẩn Đoán");
                    System.out.println("---------------------------------------------------------------");
                    for (Patient pt : Patient.patientList) System.out.println(pt);
                    break;
            }
        } while (choice != 6);
    }
}