package Session_15.Bài6;

import java.time.LocalTime;

public class InputActions {
    public String fieldName;// tên trường dữ liệu
    public String oldValue; // giá trị trước khi thay đổi
    public String newValue; // giá trị sau khi thay đổi
    public LocalTime actionTime; // thời điểm thao tác

    public InputActions(String fieldName, String oldValue, String newValue, LocalTime actionTime) {
        this.fieldName = fieldName;
        this.oldValue = oldValue;
        this.newValue = newValue;
        this.actionTime = actionTime;
    }

    public InputActions() {
    }

    @Override
    public String toString() {
        return fieldName + " | " + oldValue + " -> " + newValue + " | " + actionTime;
    }
}
