package student;

public class Student {
    public String name;
    public int roll;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
    }
}
