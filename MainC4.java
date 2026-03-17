public class MainC4 {
    public static void main(String[] args) {
        // 1. Create a company
        Company company = new Company("TechCorp");

        // 2. Hire employees
        Employee anna = new Employee("Anna", 8, 8000.0);
        Employee piotr = new Employee("Piotr", 6, 6500.0);
        company.hire(anna);
        company.hire(piotr);

        Project project = new Project("Mobile App", 30);
        project.addEmployee(anna);
        project.addEmployee(piotr);
        company.startProject(project);

        // 3. Run two simulation turns
        System.out.println("Turn 1:");
        project.workOneTurn();

        System.out.println("Turn 2:");
        project.workOneTurn();

        company.printStatus();
    }
}
