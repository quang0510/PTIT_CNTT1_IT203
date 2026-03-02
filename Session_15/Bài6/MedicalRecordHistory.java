package Session_15.Bài6;

import java.util.Stack;

public class MedicalRecordHistory {
    public Stack<EditActions> editStack =  new Stack<>(); // ngăn xếp các đối tượng EditAction
    public String recordId; // mã bệnh án


    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public void addEdit(EditActions action) {
        this.editStack.push(action);
    }

    public EditActions undoEdit() {
        if (!this.editStack.isEmpty()) {
            return this.editStack.pop();
        }
        return null;
    }
}
