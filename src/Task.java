import java.time.LocalDateTime;
public class Task {
    private String description;
    private final LocalDateTime createdTime;
    private Boolean isCompleted;

    public Task (String description) {
        this.description = description;
        this.createdTime = LocalDateTime.now();
        this.isCompleted = false;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsCompleted() {
        return isCompleted;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void changeStatus () {
        isCompleted = !isCompleted;
    }
}
