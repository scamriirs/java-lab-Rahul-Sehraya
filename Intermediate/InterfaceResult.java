interface Student {
    void getStudentDetails(String name, int roll);
}

interface Marks {
    void getMarks(int m1, int m2, int m3);
}

class Result implements Student, Marks {
    String name;
    int roll;
    int m1, m2, m3;

    @Override
    public void getStudentDetails(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    @Override
    public void getMarks(int m1, int m2, int m3) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    void displayResult() {
        int total = m1 + m2 + m3;
        double percentage = total / 3.0;

        System.out.println("\n----- Result Sheet -----");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Marks: " + m1 + ", " + m2 + ", " + m3);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 33)
            System.out.println("Result: PASS");
        else
            System.out.println("Result: FAIL");
    }
}


public class InterfaceResult {
    public static void main(String[] args) {

        Result r = new Result();

        r.getStudentDetails("Rahul", 081);
        r.getMarks(78, 85, 90);

        r.displayResult();
    }
}
