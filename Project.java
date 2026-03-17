import java.util.ArrayList;
import java.util.List;

public class Project {
    private String name;
    private int requiredWork;      
    private int progress;         
    private List<Employee> team;   

    public Project(String name, int requiredWork) {
        this.name = name;
        this.requiredWork = requiredWork;
        this.progress = 0;
        this.team = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        team.add(employee);
    }

    public void workOneTurn() {
        int workThisTurn = 0;
        for (Employee e : team) {
            workThisTurn += e.work();
        }
        progress += workThisTurn;
        if (progress > requiredWork) {
            progress = requiredWork;
        }
        System.out.println("Work this turn: " + workThisTurn);
    }

    public int getProgress() {
        return progress;
    }

    public int getRequiredWork() {
        return requiredWork;
    }

    public String getName() {
        return name;
    }

    public boolean isFinished() {
        return progress >= requiredWork;
    }
}
