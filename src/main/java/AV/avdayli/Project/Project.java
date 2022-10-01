package AV.avdayli.Project;

import java.time.LocalDate;
import java.util.Date;

public class Project {

    private Long pnumber;
    private String jobtype;
    private LocalDate datecreated;


    public Project() {
    }

    public Project(Long pnumber, String jobtype, LocalDate datecreated) {
        this.pnumber = pnumber;
        this.jobtype = jobtype;
        this.datecreated = datecreated;
    }

    public Long getPnumber() {
        return pnumber;
    }

    public void setPnumber(Long pnumber) {
        this.pnumber = pnumber;
    }

    public String getJobtype() {
        return jobtype;
    }

    public void setJobtype(String jobtype) {
        this.jobtype = jobtype;
    }

    public LocalDate getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(LocalDate datecreated) {
        this.datecreated = datecreated;
    }

    @Override
    public String toString() {
        return "Project{" +
                "pnumber=" + pnumber +
                ", jobtype='" + jobtype + '\'' +
                ", datecreated=" + datecreated +
                '}';
    }
}
