package lk.ijse.dep9.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task implements SuperEntity {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY )
    private int id;

    @Column(nullable = false)
    private Status content;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "project_id",referencedColumnName = "id",nullable = false)
    private Project project;

    public Task(Status content, Status status, Project project) {
        this.content = content;
        this.status = status;
        this.project = project;
    }

    public enum Status{
        COMPLETED,NOT_COMPLETED
    }
}
