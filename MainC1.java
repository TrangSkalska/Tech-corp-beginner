public class MainC1 {
    public static void main(String[] args) {
        Employee anna = new Employee("Anna", 8, 8000.0);
        Employee piotr = new Employee("Piotr", 6, 6500.0);
        Employee maria = new Employee("Maria", 12, 9000.0); // 12 will be clamped to 10

        printEmployee(anna);
        printEmployee(piotr);
        printEmployee(maria);
    }

    private static void printEmployee(Employee e) {
        System.out.println(
            "Employee: " + e.getName()
            + ", skill: " + e.getSkill()
            + ", salary: " + e.getSalary()
            + ", work per turn: " + e.work()
        );
    }
}
