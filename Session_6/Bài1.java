package Session_6;

public class Bài1 {

    public static class Student {
        public String student_id ;
        public String student_name;
        public String dateOfBirth;
        public double avg ;


        public Student(String student_id, String student_name, String dateOfBirth, double avg) {
            this.student_id = student_id;
            this.student_name = student_name;
            this.dateOfBirth = dateOfBirth;
            this.avg = avg;
        }

        public void showStudent(){
            System.out.println("Mã sinh viên : " +this.student_id);
            System.out.println("Tên sinh viên : " +this.student_name);
            System.out.println("Ngày sinh : " +this.dateOfBirth);
            System.out.println("Điểm trung bình : " +this.avg);
        }
    }


    public static void main(String[] args) {
            Student sv1 = new Student("sv001"  , "Nguyễn Văn A" , "1-1-2026" , 8.5 );
            Student sv2 = new Student("sv002" , "Nguyễn Thị B" , "1-1-2020" , 9.2 );

            sv1.showStudent();
            sv2.showStudent();

    }



}
