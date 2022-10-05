package AV.avdayli.Project;


import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class ProjectService {

    public List<Project> getProject(){
        return List.of(
                new Project(2539L,
                        "installation",
                        LocalDate.of(2019, Month.FEBRUARY,8))
        );
    }



}
