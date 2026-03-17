public class MainB3 {
    public static void main(String[] args) {
        // Create three employees using the constructor
        Employee anna = new Employee("Anna", 8, 8000.0);
        Employee piotr = new Employee("Piotr", 6, 6500.0);
        Employee maria = new Employee("Maria", 9, 9000.0);

        // Print their data
        System.out.println("Employee: " + anna.name + ", skill: " + anna.skill + ", salary: " + anna.salary);
        System.out.println("Employee: " + piotr.name + ", skill: " + piotr.skill + ", salary: " + piotr.salary);
        System.out.println("Employee: " + maria.name + ", skill: " + maria.skill + ", salary: " + maria.salary);
    }
}
