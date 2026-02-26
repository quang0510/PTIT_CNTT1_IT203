package Session_13;

import java.util.LinkedList;

public class Bài4 {

    public static class EmergencyRoom {
        private LinkedList<String> waitingList  = new LinkedList<>();

        void patientCheckIn(String name) {
            waitingList.addLast(name);
            System.out.println("Bệnh nhân " + name + " đã vào hàng đợi.");
        }

        void emergencyCheckIn(String name) {
            waitingList.addFirst(name);
            System.out.println("! CẤP CỨU !: Bệnh nhân " + name + " được ưu tiên lên đầu.");
        }

        void treatPatient() {
            if (waitingList.isEmpty()) {
                System.out.println("Không còn bệnh nhân nào trong hàng đợi.");
                return;
            }

            String patient = waitingList.pollFirst();
            if (patient.equals("C")) {
                System.out.println("Đang cấp cứu: " + patient);
            } else {
                System.out.println("Đang khám: " + patient);
            }
        }
    }

    public static void main(String[] args) {
        EmergencyRoom er = new EmergencyRoom();

        er.patientCheckIn("A");
        er.patientCheckIn("B");
        er.emergencyCheckIn("C");


        er.treatPatient();
        er.treatPatient();
        er.treatPatient();
    }
}