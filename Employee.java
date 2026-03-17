public class Employee {
    private String name;
    private int skill;
    private double salary;

    public Employee(String name, int skill, double salary) {
        this.name = name;
        setSkill(skill);      
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSkill() {
        return skill;
    }

    public double getSalary() {
        return salary;
    }

    public void setSkill(int skill) {
        if (skill < 1) {
            this.skill = 1;
        } else if (skill > 10) {
            this.skill = 10;
        } else {
            this.skill = skill;
        }
    }

    public int work() {
        return skill;
    }
}
