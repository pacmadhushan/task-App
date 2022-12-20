package lk.ijse.dep9.entity;

import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class Project implements SuperEntity{

    private int id;
    private String name;
    private String username;



    public Project(String name, User user) {
        this.name = name;
        this.username = username;
    }

}
