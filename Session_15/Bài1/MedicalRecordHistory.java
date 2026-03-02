package Session_15.Bài1;

import java.time.LocalTime;
import java.util.Stack;

public class MedicalRecordHistory {
    public static Stack<EditAction> history = new Stack<>();
    public static void main(String[] args) {
        addEdit(new EditAction("Youtube", (LocalTime.now())));
        addEdit(new EditAction("Vite", (LocalTime.now())));
        addEdit(new EditAction("Rikkei Education", (LocalTime.now())));
        addEdit(new EditAction("Facebook", (LocalTime.now())));
        addEdit(new EditAction("Messager", (LocalTime.now())));

        displayHistory();
        System.out.println("Lịch sử gần nhất: " + getLatestEdit().getDescription() + ": " + getLatestEdit().getTime()); // Xóa và lấy ra lịch sử gần nhất
        System.out.println("Đã xóa: " + undoEdit().getDescription() + ": " + undoEdit().getTime()); // Xóa và lấy ra lịch sử gần nhất

        displayHistory();
    }

    public static void addEdit(EditAction action){
        history.add(action);
    }

    public static EditAction undoEdit(){
        EditAction recentEdit = history.pop();
        return recentEdit;
    }

    public static EditAction getLatestEdit(){
        EditAction latestEdit = history.peek();
        return latestEdit;
    }

    public static boolean isEmpty(){
        return history.isEmpty();
    }

    public static void displayHistory(){
        System.out.println("===== Lịch sử chỉnh sửa =====");
        for (EditAction e : history){
            System.out.println(e.getDescription() + ": " + e.getTime());
        }
    }
}
