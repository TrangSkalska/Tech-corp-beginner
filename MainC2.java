public class MainC2 {
    public static void main(String[] args) {

        Employee anna = new Employee("Anna", 8, 8000.0);
        Employee piotr = new Employee("Piotr", 6, 6500.0);
        Employee maria = new Employee("Maria", 10, 9000.0);

        Project project = new Project("Mobile App", 30);

        // 1. Add employees to the project
        project.addEmployee(anna);
        project.addEmployee(piotr);
        project.addEmployee(maria);

        // 2. Run one work turn
        project.workOneTurn();

        // 3. Print project progress
        System.out.println("Project: " + project.getName());
        System.out.println("Progress: " + project.getProgress() + " / " + project.getRequiredWork());
        System.out.println("Finished? " + project.isFinished());
    }
}
