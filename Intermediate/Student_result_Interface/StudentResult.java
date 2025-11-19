public class StudentResult extends Student {
    int m1, m2, m3;

    public StudentResult(String name, int roll, int m1, int m2, int m3) {
        super(name, roll);
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public void generateMarksheet() {
        int total = m1 + m2 + m3;
        double percentage = total / 3.0;

        System.out.println("----- MARKSHEET -----");
        displayStudent();
        System.out.println("Marks: " + m1 + ", " + m2 + ", " + m3);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 33)
            System.out.println("Result: PASS");
        else
            System.out.println("Result: FAIL");
    }
}
