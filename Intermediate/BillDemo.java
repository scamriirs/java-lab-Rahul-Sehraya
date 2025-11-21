class Customer {
    String name;
    int units;

    Customer(String name, int units) {
        this.name = name;
        this.units = units;
    }
}

class ElectricityBill extends Customer {

    ElectricityBill(String name, int units) {
        super(name, units);  
    }

    double calculateBill() {
        double amount;

        if (units <= 100)
            amount = units * 5;
        else if (units <= 200)
            amount = 100 * 5 + (units - 100) * 7;
        else
            amount = 100 * 5 + 100 * 7 + (units - 200) * 10;

        return amount;
    }
}

public class BillDemo {
    public static void main(String[] args) {

        ElectricityBill eb = new ElectricityBill("Rahul", 250);

        System.out.println("Customer Name: " + eb.name);
        System.out.println("Units Consumed: " + eb.units);
        System.out.println("Total Bill: Rs." + eb.calculateBill());
    }
}
