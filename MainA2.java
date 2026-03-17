public class MainA2 {
    public static void main(String[] args) {
        String projectName = "Mobile App Launch";
        double projectBudget = 75000.0;
        int projectEmployees = 5;
        boolean projectFinished = false;

        System.out.println("Initial project state:");
        System.out.println(projectName);
        System.out.println(projectBudget);
        System.out.println(projectEmployees);
        System.out.println(projectFinished);

        projectName = "Mobile App Launch – Phase 2";
        projectBudget = 90000.0;
        projectEmployees = 7;
        projectFinished = true;

        System.out.println("Updated project state:");
        System.out.println(projectName);
        System.out.println(projectBudget);
        System.out.println(projectEmployees);
        System.out.println(projectFinished);
    }
}
