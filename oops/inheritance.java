public class inheritance {
    
}

class Vehicle{
    int nWheels;
    int capacity;
    int maxSpeed;

    void start(){
        System.out.println("Vehicle Starts");
    }
    void stop(){
        System.out.println("Vehicle stops");
    }
}

class Car{
    int sunRoof;
    int noOfDoors;
    int economy;

    void openSunRoof(){
        System.out.println("SunRoof is now open ");
    }
    void closeSunRoof(){
        System.out.println("SunRoof is now close");
    }
}