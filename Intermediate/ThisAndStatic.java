class Demo {

    int number;

    static int count = 0;

    Demo(int number) {
        this.number = number;   
        count++;                
    }

    void show() {
        System.out.println("Number = " + this.number);
    }

    static void showCount() {
        System.out.println("Total objects created = " + count);
    }
}


public class ThisAndStatic {
    public static void main(String[] args) {

        Demo d1 = new Demo(10);
        Demo d2 = new Demo(20);
        Demo d3 = new Demo(30);

        d1.show();
        d2.show();
        d3.show();

        Demo.showCount();
    }
}
