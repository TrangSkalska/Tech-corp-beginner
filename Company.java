import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<Employee> employees;
    private List<Project> projects;

    public Company(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
        this.projects = new ArrayList<>();
    }

    public void hire(Employee employee) {
        employees.add(employee);
    }

    public void startProject(Project project) {
        projects.add(project);
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void printStatus() {
        System.out.println("Company: " + name);
        System.out.println("Employees: " + employees.size());
        for (Employee e : employees) {
            System.out.println(" - " + e.getName() + " (skill " + e.getSkill() + ")");
        }

        System.out.println("Projects: " + projects.size());
        for (Project p : projects) {
            System.out.println(" - " + p.getName()
                    + " progress " + p.getProgress() + "/" + p.getRequiredWork()
                    + " finished? " + p.isFinished());
        }
    }
}
