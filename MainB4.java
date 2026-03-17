public class MainB4 {
    public static void main(String[] args) {
        Employee anna = new Employee("Anna", 8, 8000.0);
        Employee piotr = new Employee("Piotr", 6, 6500.0);

        // 1. Call the method for two employees
        int annaWork = anna.work();
        int piotrWork = piotr.work();

        // 2. Add the results
        int totalWork = annaWork + piotrWork;

        // 3. Print total work produced
        System.out.println("Anna work: " + annaWork);
        System.out.println("Piotr work: " + piotrWork);
        System.out.println("Total work produced: " + totalWork);
    }
}
