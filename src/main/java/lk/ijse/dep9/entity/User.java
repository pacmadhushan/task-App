package lk.ijse.dep9.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements SuperEntity {
    @Id
    String username;
    @Column(nullable = false)
    String password;
    @Column(name = "full_name",nullable = false)
    String fullName;
}
