package Session_15.Bài4;

import java.util.PriorityQueue;

public class EmergencyQueue {
    // sử dụng PriorityQueue<EmergencyPatient>
    public static PriorityQueue<EmergencyPatient> emergencyPatients = new PriorityQueue<>(
            (p1, p2) -> p1.getPriority() - p2.getPriority()
    );

    public static void main(String[] args) {
        addPatient(new EmergencyPatient("P001", "Nguyen Van A", 1));
        addPatient(new EmergencyPatient("P002", "Nguyen Van B", 2));
        addPatient(new EmergencyPatient("P003", "Nguyen Van C", 2));
        addPatient(new EmergencyPatient("P004", "Nguyen Van D", 1));
        addPatient(new EmergencyPatient("P005", "Nguyen Van E", 2));
        addPatient(new EmergencyPatient("P006", "Nguyen Van H", 1));
        displayQueue();
    }

    public static void addPatient(EmergencyPatient p){
        System.out.println("Thêm bệnh nhân thành công");
    }

    public static EmergencyPatient callNextPatient(){
        EmergencyPatient emergencyPatient = emergencyPatients.poll();

        if (emergencyPatient== null){
            System.out.println("Danh sách bệnh nhân trống");
            return null;
        }

        return emergencyPatient;
    }

    public static void displayQueue(){
        System.out.println("Danh sách bệnh nhân chờ cấp cứu: ");
        for (EmergencyPatient ep : emergencyPatients){
            System.out.println(ep.getId() + " | " + ep.getName() + " | " + ep.getPriority());
        }
    }
}
