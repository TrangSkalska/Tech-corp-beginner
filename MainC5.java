public class MainC5 {
    public static void main(String[] args) {
        Company company = new Company("TechCorp");

        Employee anna = new Employee("Anna", 8, 8000.0);
        Employee piotr = new Employee("Piotr", 6, 6500.0);
        company.hire(anna);
        company.hire(piotr);

        Project project = new Project("Mobile App", 30);
        project.addEmployee(anna);
        project.addEmployee(piotr);
        company.startProject(project);

        int turns = 0;

        while (!project.isFinished()) {
            turns++;
            System.out.println("Turn " + turns + ":");
            project.workOneTurn();
            System.out.println("Progress: " + project.getProgress()
                    + " / " + project.getRequiredWork());
            System.out.println();
        }

        System.out.println("Project finished in " + turns + " turns.");
    }
}
