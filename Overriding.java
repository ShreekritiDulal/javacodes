class GenericVehicle {

    protected double baseSpeed = 110;

    double maxSpeed(double userSpeed) {
        if (userSpeed > baseSpeed) {
            System.out.println("Base speed exceeded");
        } else {
            System.out.println("Within base speed");
        }
        return userSpeed;
    }
}

class Car extends GenericVehicle {

    double maxSpeed(double userSpeed) {
        double carMaxSpeed = 120;

        if (userSpeed > carMaxSpeed) {
            System.out.println("Car fined");
        } else if (userSpeed > baseSpeed && userSpeed <= carMaxSpeed) {
            System.out.println("Car exceeded base speed");
        } else {
            System.out.println("Car within base speed");
        }
        return userSpeed;
    }
}

class Bike extends GenericVehicle {

    double maxSpeed(double userSpeed) {
        double bikeMaxSpeed = 140;

        if (userSpeed > bikeMaxSpeed) {
            System.out.println("Bike fined");
        } else if (userSpeed > baseSpeed && userSpeed <= bikeMaxSpeed) {
            System.out.println("Bike exceeded base speed");
        } else {
            System.out.println("Bike within base speed");
        }
        return userSpeed;
    }
}

public class Overriding {

    public static void main(String[] args) {

        GenericVehicle car = new Car();
        GenericVehicle bike = new Bike();

        car.maxSpeed(112);
        bike.maxSpeed(150);
    }
}
