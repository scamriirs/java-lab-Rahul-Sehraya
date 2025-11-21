class Student {
    String name;
    int age;


    Student() {
        name = "Unknown";
        age = 0;
        System.out.println("Default Constructor Called");
    }


    Student(String n, int a) {
        name = n;
        age = a;
        System.out.println("Parameterized Constructor Called");
    }


    Student(String n) {
        name = n;
        age = 18;  
        System.out.println("Overloaded Constructor Called (Name Only)");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.display();

        Student s2 = new Student("Rahul", 21);
        s2.display();

        Student s3 = new Student("Ajay");
        s3.display();
    }
}
