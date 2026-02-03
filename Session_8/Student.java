package Session_8;

public class Student {
    private String id;
    private String fullName;
    private int age;
    private String gender;
    private double math;
    private double physics;
    private double chemistry;
    private double avg;
    private String rank;

    public Student(String id, String fullName, int age, String gender,
                   double math, double physics, double chemistry) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        calculateAvgAndRank();
    }

    /* ================= GETTER / SETTER ================= */

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public double getAvg() {
        return avg;
    }

    public String getRank() {
        return rank;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMath(double math) {
        this.math = math;
        calculateAvgAndRank();
    }

    public void setPhysics(double physics) {
        this.physics = physics;
        calculateAvgAndRank();
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
        calculateAvgAndRank();
    }

    /* ================= BUSINESS ================= */

    public void calculateAvgAndRank() {
        avg = (math + physics + chemistry) / 3;

        if (avg >= 8 && math >= 6.5 && physics >= 6.5 && chemistry >= 6.5) {
            rank = "Giỏi";
        } else if (avg >= 6.5 && math >= 5 && physics >= 5 && chemistry >= 5) {
            rank = "Khá";
        } else if (avg >= 5 && math >= 3.5 && physics >= 3.5 && chemistry >= 3.5) {
            rank = "Trung bình";
        } else {
            rank = "Yếu";
        }
    }

    public void display() {
        System.out.printf("%-10s %-20s %-5d %-8s %-6.2f %-6.2f %-6.2f %-6.2f %-12s\n",
                id, fullName, age, gender, math, physics, chemistry, avg, rank);
    }
}
