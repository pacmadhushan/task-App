package lk.ijse.dep9.dao.custom;

import lk.ijse.dep9.dao.CrudDAO;
import lk.ijse.dep9.entity.Project;

import java.util.Optional;

public interface ProjectDAO extends CrudDAO<Project,Integer> {
    void deleteById(Integer id);

    Optional<Project> findById(Integer id);
}
