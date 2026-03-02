package Session_15.Bài6;

public class Main {
    public static void main(String[] args) {
//        // tạo danh sách Bệnh nhân chờ khám
//        PatientWaitingQueue pWaitingQueue = new PatientWaitingQueue();
//        pWaitingQueue.waitingQueue = new LinkedList<>();
//
//
//        // Thêm 1 bệnh nhân
//        Patient patient = new Patient("P001", "Nguyen Van A", 25, "Nam");
//        pWaitingQueue.waitingQueue.offer(patient);
//        pWaitingQueue.totalPatients++;
//
//        // --> tạo mới lịch sử bệnh án
//        MedicalRecordHistory medicRecords = new MedicalRecordHistory();
//        medicRecords.editStack.push(new EditActions("Hồ sơ bệnh án được tạo mới", "Pham Van T", LocalTime.now()));
//
//        //  --> Thêm vào danh sách gọi số tự động
//        TicketSystem tickets = new TicketSystem();
//        tickets.ticketQueue.offer(new Ticket(pWaitingQueue.totalPatients, LocalDateTime.now()));
//
//
//        //   --> Thêm vào stack thông tin thao tác nhập liệu
//        UndoManager undoManagerStack = new UndoManager(100);
//        undoManagerStack.undoStack.push(new InputActions("Thông tin bệnh nhân", "", patient.toString(), LocalTime.now()));
//
// 1. Bệnh nhân chờ khám
        PatientWaitingQueue queue = new PatientWaitingQueue();
        queue.addPatient(new Patient("P001", "Nguyen Van A", 25, "Nam"));
        queue.addPatient(new Patient("P002", "Tran Thi B", 30, "Nữ"));

        System.out.println("Gọi khám: " + queue.callNextPatient());

        // 2. Lịch sử chỉnh sửa
        MedicalRecordHistory history = new MedicalRecordHistory();
        history.addEdit(new EditActions("Cập nhật chẩn đoán", "Bác sĩ A", java.time.LocalTime.now()));
        System.out.println("Undo chỉnh sửa: " + history.undoEdit());

        // 3. Gọi số tự động
        TicketSystem ticketSystem = new TicketSystem();
        ticketSystem.issueTicket();
        ticketSystem.issueTicket();
        System.out.println("Gọi số: " + ticketSystem.callNext());

        // 4. Undo nhập liệu
        UndoManager undo = new UndoManager(5);
        undo.addAction(new InputActions("Tên", "A", "B", java.time.LocalTime.now()));
        System.out.println("Undo nhập liệu: " + undo.undo());


    }
}
