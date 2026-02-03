package HN_K24_CNTT1_NguyenDangQuang;

public class Student {
    private String id;
    private String name;
    private double score;

    // Constructor không tham số
    public Student() {

    }

    // Constructor full
    public Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    // Getter setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    // Xếp loại
    public String getRank() {

        if (score >= 8.0) {
            return "Gioi";
        } else if (score >= 6.5) {
            return "Kha";
        } else {
            return "Trung Binh";
        }
    }

    // Hiển thị thông tin sinh viên
    public void showInfo() {
        System.out.printf("Ma: %s | Ten: %s | Diem: %.2f | Hoc luc: %s \n", id, name, score, getRank());

    }
}
