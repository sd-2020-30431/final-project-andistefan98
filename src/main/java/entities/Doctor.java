package entities;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Doctor {

   int id;

   String name;

   int startWorkHour;

   int endWorkHour;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="department_id")
    Department departmentId ;

    public Doctor(String name, int startWorkHour, int endWorkHour, Department departmentId) {
        this.name = name;
        this.startWorkHour = startWorkHour;
        this.endWorkHour = endWorkHour;
        this.departmentId = departmentId;
    }

    public int getId() {
        return id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStartWorkHour() {
        return startWorkHour;
    }

    public void setStartWorkHour(int startWorkHour) {
        this.startWorkHour = startWorkHour;
    }

    public int getEndWorkHour() {
        return endWorkHour;
    }

    public void setEndWorkHour(int endWorkHour) {
        this.endWorkHour = endWorkHour;
    }

    public Department getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Department departmentId) {
        this.departmentId = departmentId;
    }
}
