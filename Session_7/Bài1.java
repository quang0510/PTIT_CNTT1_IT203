package Session_7;

public class Bài1 {
    public static class Student{
        public String id ;
        public String name;
        public static int totalStudent = 0;

        public Student(String id, String name) {
            this.id = id;
            this.name = name;
            totalStudent++;
        }

        public void showStudent(){
            System.out.println("id sinh viên : " +this.id);
            System.out.println("tên sinh viên : " +this.name);

        }
        public static void total(){
            System.out.printf("tổng số sinh viên là : %d" , totalStudent );
        }
    }
    public static void main(String[] args) {
        Student std1 = new Student("1" , "nguyễn văn a");
        Student std2 = new Student("2" , "Nguyễn văn b");
        std1.showStudent();
        std2.showStudent();
        Student.total();

    }
}
