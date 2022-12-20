package lk.ijse.dep9.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task implements SuperEntity {

    private int id;
    private Status content;
    private Status status;
    private int projectId;

    public Task(Status content, Status status, int projectId) {
        this.content = content;
        this.status = status;
        this.projectId = projectId;
    }

    public enum Status{
        COMPLETED,NOT_COMPLETED
    }
}
