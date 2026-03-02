package Session_15.Bài2;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class PatientQueue {
    public static List<Patient> patients = new ArrayList<>();
    public static int front = 0;
    public static int rear = -1;
    public static int capacity = patients.size();

    public static void main(String[] args) {
        // Mỗi bệnh nhân đến → thêm vào Queue
        addPatient(new Patient("P001", "Nguyen Van A", 20));
        addPatient(new Patient("P002", "Tran Thi B", 22));
        addPatient(new Patient("P003", "Nguyen Van C", 19));
        addPatient(new Patient("P004", "Nguyen Thi D", 23));
        addPatient(new Patient("P005", "Le Thi E", 24));
        addPatient(new Patient("P006", "Nguyen Van H", 20));

        displayQueue();

        // Khi bác sĩ gọi khám → lấy bệnh nhân đầu Queue
        Patient currentPatient = callNextPatient();

        // Cho phép xem bệnh nhân tiếp theo sẽ được khám
        System.out.println("\nBệnh nhân tiếp theo: ");
        System.out.println(currentPatient.getId() + ". " + currentPatient.getName() + ": " + currentPatient.getAge());

        currentPatient = callNextPatient();
        System.out.println("Bệnh nhân tiếp theo: ");
        System.out.println(currentPatient.getId() + ". " + currentPatient.getName() + ": " + currentPatient.getAge());

    }
    public static void addPatient(Patient p){
        patients.add(p);
        rear++;
    }

    public static Patient callNextPatient(){
        if(rear < front){
            System.out.println("Danh sách bệnh nhân đang chờ trống!!!");
            return null;
        }
        Patient currentPatient = patients.get(rear);
        patients.remove(rear);
        rear--;
        return currentPatient;
    }

    public static Patient peekNextPatient (){
        if(rear < front){
            System.out.println("Danh sách bệnh nhân đang chờ trống!!!");
            return null;
        }
        Patient nextPatient = patients.get(rear);
        return nextPatient;
    }

    public static boolean isEmpty(){
        return patients.isEmpty();
    }

    public static void displayQueue(){
        System.out.println("Danh sách bệnh nhân đang chờ: ");
        for (Patient p:patients){
            System.out.println(p.getId()+". " + p.getName()+ ": " + p.getAge());
        }
    }
}
