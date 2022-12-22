package lk.ijse.dep9.app.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RequestMapping("/api/v1/projects")
@RestController
public class ProjectController {
    public void createNewProject(){}
    public void getAllProject(){}
    public void getProject(){}
    public void reanameProject(){}
    public void deleteProject(){}
}
