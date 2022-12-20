package lk.ijse.dep9.dao.custom.impl;

import lk.ijse.dep9.dao.custom.ProjectDAO;
import lk.ijse.dep9.dao.custom.UserDAO;
import lk.ijse.dep9.entity.Project;
import lk.ijse.dep9.entity.SuperEntity;

import java.io.Serializable;
import java.sql.Connection;
import java.util.List;
import java.util.Optional;

public class ProjectDAOImpl implements ProjectDAO {
    private final Connection connection;


    public ProjectDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Project save(Project project) {
        return null;
    }

    @Override
    public void update(Project project) {

    }

    @Override
    public void deleteById(String pk) {

    }

    @Override
    public Optional<Project> findById(String pk) {
        return Optional.empty();
    }

    @Override
    public List<Project> findAll() {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public boolean existsById(String pk) {
        return false;
    }
}
