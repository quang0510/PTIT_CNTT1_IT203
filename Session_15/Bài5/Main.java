package Session_15.Bài5;

import Session_15.Bài2.Patient;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Tạo danh sách các trường hợp bệnh nhân
        Patient patient1 = new Patient("P001", "Nguyen Van A", 21);
        Patient patient2 = new Patient("P002", "Nguyen Van B", 25);
        Patient patient3 = new Patient("P003", "Nguyen Van C", 32);
        Patient patient4 = new Patient("P004", "Nguyen Van D", 19);
        Patient patient5 = new Patient("P005", "Nguyen Van E", 42);
        Patient patient6 = new Patient("P006", "Nguyen Van H", 31);

        // Queue bệnh nhân chờ cấp cứu
        EmergencyCaseQueue caseQueue = new EmergencyCaseQueue();
        // Thêm lần lượt các case cần xử lý vào ds hàng đợi
        caseQueue.addCase(new EmergencyCase(patient1, new Stack<>()));
        caseQueue.addCase(new EmergencyCase(patient2, new Stack<>()));
        caseQueue.addCase(new EmergencyCase(patient3, new Stack<>()));
        caseQueue.addCase(new EmergencyCase(patient4, new Stack<>()));
        caseQueue.addCase(new EmergencyCase(patient5, new Stack<>()));

        EmergencyCase currentCase = caseQueue.getNextCase();

        currentCase.addStep(new TreatmentStep("Tiếp nhận", "5:30 PM 02/03/2026"));
        currentCase.addStep(new TreatmentStep("Chẩn đoán", "7:00 PM 02/03/2026"));
        currentCase.undoStep();
        currentCase.addStep(new TreatmentStep("Chẩn đoán chuyên sâu", "7:30 PM 02/03/2026"));
        currentCase.addStep(new TreatmentStep("Bắt đầu điều trị", "7:30 PM 03/03/2026"));


        currentCase.displaySteps();


        EmergencyCase currentCase2 = caseQueue.getNextCase();

        currentCase2.addStep(new TreatmentStep("Tiếp nhận", "5:30 PM 02/03/2026"));

        currentCase2.addStep(new TreatmentStep("Chẩn đoán chuyên sâu", "7:30 PM 02/03/2026"));
        currentCase2.addStep(new TreatmentStep("Bắt đầu điều trị", "7:30 PM 03/03/2026"));


        currentCase2.displaySteps();


    }
}
