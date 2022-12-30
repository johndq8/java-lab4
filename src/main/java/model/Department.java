package model;
import java.util.List;

public class Department {
    private Human headman;

    private String departmentName;

    private List<Group> groups;

    public void setHeadman(Human headman) {
        this.headman = headman;
    }

    public Human getHeadman() {
        return headman;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return String.format("Department name - %s. Headman - %s. Groups:\n %s", departmentName, headman, groups.toString());
    }
}