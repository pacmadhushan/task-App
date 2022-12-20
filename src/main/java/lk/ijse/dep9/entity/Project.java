package lk.ijse.dep9.entity;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class Project implements SuperEntity{

    private int id;
    private String name;
    private User username;



    public Project(String name, User user) {
        this.name = name;
        this.username = user;
    }

}
