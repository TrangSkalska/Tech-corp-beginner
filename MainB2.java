public class MainB2 {
    public static void main(String[] args) {
        // 1. Create three employees
        Employee anna = new Employee();
        Employee piotr = new Employee();
        Employee maria = new Employee();

        // 2. Assign different skill values
        anna.name = "Anna";
        anna.skill = 8;

        piotr.name = "Piotr";
        piotr.skill = 6;

        maria.name = "Maria";
        maria.skill = 9;

        // 3. Print the results
        System.out.println("Employee: " + anna.name + ", skill: " + anna.skill);
        System.out.println("Employee: " + piotr.name + ", skill: " + piotr.skill);
        System.out.println("Employee: " + maria.name + ", skill: " + maria.skill);
    }
}
