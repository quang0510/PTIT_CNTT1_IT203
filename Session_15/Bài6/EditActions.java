package Session_15.Bài6;

import java.time.LocalTime;

public class EditActions {
    private String description; // nội dung chỉnh sửa

    private String editedBy; // người thực hiện chỉnh sửa

    private LocalTime editTime; // thời điểm chỉnh sửa

    public EditActions() {
    }

    public EditActions(String description, String editedBy, LocalTime editTime) {
        this.description = description;
        this.editedBy = editedBy;
        this.editTime = editTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEditedBy() {
        return editedBy;
    }

    public void setEditedBy(String editedBy) {
        this.editedBy = editedBy;
    }

    public LocalTime getEditTime() {
        return editTime;
    }

    public void setEditTime(LocalTime editTime) {
        this.editTime = editTime;
    }

    @Override
    public String toString() {
        return description + " | By: " + editedBy + " | At: " + editTime;
    }
}
