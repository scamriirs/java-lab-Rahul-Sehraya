class Vehicle {
    String vehicle_type;

    Vehicle(String vehicle_type) {
        this.vehicle_type = vehicle_type;
    }

    void display() {
        System.out.println("Vehicle Type: " + vehicle_type);
    }
}

class Car extends Vehicle {
    String model_type;
    String company_name;

    Car(String vehicle_type, String model_type, String company_name) {
        super(vehicle_type); 
        this.model_type = model_type;
        this.company_name = company_name;
    }

    void display() {
        super.display(); 
        System.out.println("Company Name: " + company_name);
        System.out.println("Model Type: " + model_type);
    }
}

public class Vehicles {
    public static void main(String[] args) {
        Car c = new Car("Four Wheeler", "Sedan", "Honda");
        c.display();
    }
}
