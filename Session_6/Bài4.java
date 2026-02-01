package Session_6;

public class Bài4 {
    public static class Employee{
         public String employeeId;
         public String employeeName;
         public double salary;

        public Employee() {
        }

        public Employee(String employeeId, String employeeName) {
            this.employeeId = employeeId;
            this.employeeName = employeeName;
        }

        public Employee(String employeeId, String employeeName, double salary) {
            this.employeeId = employeeId;
            this.employeeName = employeeName;
            this.salary = salary;
        }
        public void showInfo(){
            System.out.println("id nhân viên : "+ this.employeeId);
            System.out.println("tên nhân viên : " + this.employeeName);
            System.out.println("lương : " +this.salary);
        }
    }

    public static void main(String[] args) {
        Employee nv1 = new Employee();
        Employee nv2 = new Employee("nv002" , "tôn huy");
        Employee nv3 = new Employee("nv003" , "huy tôn" ,1000 );

//        nv1.showInfo();
//        nv2.showInfo();
        nv3.showInfo();
    }
}
