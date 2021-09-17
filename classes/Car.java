package classes;

public class Car {
    double carSpeed;

    public Car(String carType) {
        // This constructor has one parameter, name.
        System.out.println("Car type is : " + carType );
     }

    public void setSpeed( double speed ) {
        // in Km/s 
        carSpeed = speed;
     }
    
    public double getSpeed() {
        System.out.println("car speed is : " + carSpeed + " Km/s");
        return carSpeed;
     }
    public static void main(String[] args) {
        System.out.println("Start >>");
        // Create object
        Car car1 = new Car("Tesla S-Type");
        // Call method (set)
        car1.setSpeed(125.5);
        // Call method (get)
        car1.getSpeed();
        System.out.println("Variable value is "+ car1.carSpeed);
    }
}
