public class MainC3 {
    public static void main(String[] args) {

        Company company = new Company("TechCorp");

        // 1. Hire two employees
        Employee anna = new Employee("Anna", 8, 8000.0);
        Employee piotr = new Employee("Piotr", 6, 6500.0);
        company.hire(anna);
        company.hire(piotr);

        // 2. Start a project
        Project project = new Project("Mobile App", 30);
        project.addEmployee(anna);
        project.addEmployee(piotr);
        company.startProject(project);

        project.workOneTurn();

        // 3. Print company status
        company.printStatus();
    }
}
