public class MainA3 {

    // 1. Method returning the salary of an employee
    public static double getSalary() {
        double salary = 8000.0;
        return salary;
    }

    // 2. Method that adds two skill values
    public static int addSkills(int skill1, int skill2) {
        int sum = skill1 + skill2;
        return sum;
    }

    // 3. Method printing a project status
    public static void printProjectStatus(String projectName, boolean finished) {
        if (finished) {
            System.out.println("Project \"" + projectName + "\" is finished.");
        } else {
            System.out.println("Project \"" + projectName + "\" is still in progress.");
        }
    }

    public static void main(String[] args) {
        // Method 1
        double salary = getSalary();
        System.out.println("Employee salary: " + salary);

        // Method 2
        int totalSkill = addSkills(7, 9);
        System.out.println("Total skill: " + totalSkill);

        // Method 3
        printProjectStatus("Mobile App Launch", false);
        printProjectStatus("Backend Refactor", true);
    }
}
