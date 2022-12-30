package model;


import java.util.List;

public class University {
    private Human rector;

    private String universityName;

    private List<Department> departments;

    public Human getRector() {
        return rector;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public void setRector(Human rector) {
        this.rector = rector;
    }

    @Override
    public String toString() {
        return String.format("University name - %s. Rector - %s. Departments:\n %s", universityName, rector, departments.toString());
    }
}