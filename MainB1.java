public class MainB1 {
    public static void main(String[] args) {
        // 1. Create an employee object
        Employee anna = new Employee();

        // 2. Assign values to its fields
        anna.name = "Anna";
        anna.skill = 8;

        // 3. Print the employee information
        System.out.println("Employee name: " + anna.name);
        System.out.println("Employee skill: " + anna.skill);
    }
}
