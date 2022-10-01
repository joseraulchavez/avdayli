package AV.avdayli.Project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/project")
public class ProjectController {

    @GetMapping
    public List<Project> getProject(){
        return List.of(
                new Project(2539L,"installation", LocalDate.of(2019, Month.FEBRUARY,8))
        );
    }
}
