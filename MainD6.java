public class MainD6 {
    public static void main(String[] args) {
        // Using the general type Employee (from the PDF)
        Employee anna = new Developer("Anna", 9, 8000);
        Employee piotr = new Tester("Piotr", 6, 6500);

        // Polymorphic calls: which work() runs depends on the actual object
        System.out.println("Anna work: " + anna.work());
        System.out.println("Piotr work: " + piotr.work());
    }
}
