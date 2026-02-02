package Session_7;

public class Bài2 {

    static class Student {
        String name;

        Student(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {

        // BIẾN NGUYÊN THỦY
        int a = 10;
        int b = a;   // sao chép giá trị

        b = 20;      // thay đổi b

        System.out.printf("a = %d\n", a);
        System.out.printf("b = %d\n", b);

        System.out.println();

        // BIẾN THAM CHIẾU
        Student s1 = new Student("Nguyễn Văn A");
        Student s2 = s1;   // sao chép địa chỉ

        s2.name = "Nguyễn Văn B"; // thay đổi qua s2

        System.out.printf("s1.name = %s\n", s1.name);
        System.out.printf("s2.name = %s\n", s2.name);
    }
}
